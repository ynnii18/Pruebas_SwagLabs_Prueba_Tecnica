package com.testing.moviles.app.task;


import com.testing.moviles.app.interactions.BusquedaDeProducto;
import com.testing.moviles.app.models.InfoCompra;
import com.testing.moviles.app.userinterfaces.SwagHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class AgregateProducts implements Task {

    List<InfoCompra> articulo;

    public AgregateProducts(List<InfoCompra> articulosAcomprar) {
        articulo = articulosAcomprar;
    }

    public static AgregateProducts alCarrito(List<InfoCompra> articulosAcomprar){return Tasks.instrumented(AgregateProducts.class, articulosAcomprar);}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(SwagHomePage.LBL_NAME_ARTICULOS, isPresent()).forNoMoreThan(15).seconds(),
                BusquedaDeProducto.aComprar(articulo)
        );
    }
}
