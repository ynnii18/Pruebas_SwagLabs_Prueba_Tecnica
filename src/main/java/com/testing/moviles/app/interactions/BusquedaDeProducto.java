package com.testing.moviles.app.interactions;

import com.testing.moviles.app.models.InfoCompra;
import com.testing.moviles.app.userinterfaces.SwagHomePage;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;


import java.util.List;

public class BusquedaDeProducto implements Interaction {

    List<InfoCompra> nombreArticulos;

    public BusquedaDeProducto(List<InfoCompra> articulos) {
        this.nombreArticulos = articulos;
    }

    public static BusquedaDeProducto aComprar(List<InfoCompra> articulos) {
        return Tasks.instrumented(BusquedaDeProducto.class, articulos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<String> listaArticulosVisibles = CatalogoDeArticulos.obtenerArticulos(actor);
        List<String> listaCoorVisibles = CoordenadaArticulos.obtenerCoordenadas(actor);
        boolean bandera = true;
        while (bandera) {
            for (int i = 0; i < nombreArticulos.size(); i++) {
                for (int z = 0; z < listaArticulosVisibles.size(); z++) {
                    if (nombreArticulos.get(i).getNombreArticulo().equals(listaArticulosVisibles.get(z))) {
                        String coordenadas = listaCoorVisibles.get(z);
                        String[] parts = coordenadas.split("-");
                        new TouchAction((PerformsTouchActions) GetDriver.as(actor).appiumDriver()).tap(PointOption.point(Integer.parseInt(parts[0]), Integer.parseInt(parts[1]))).release().perform();
                        actor.attemptsTo(CheckOut.Completado(nombreArticulos));
                        bandera = false;
                    }
                }
            }
            if (bandera) {
                actor.attemptsTo(
                        WaitUntil.the(SwagHomePage.LBL_NAME_ARTICULOS, WebElementStateMatchers.isPresent()).forNoMoreThan(15).seconds()
                );
                actor.attemptsTo(SwipeByCoordinates.scorll(532, 1800, 540, 505));
                listaArticulosVisibles = CatalogoDeArticulos.obtenerArticulos(actor);
                listaCoorVisibles = CoordenadaArticulos.obtenerCoordenadas(actor);
            }
        }
    }
}
