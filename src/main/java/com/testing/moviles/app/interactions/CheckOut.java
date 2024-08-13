package com.testing.moviles.app.interactions;



import com.testing.moviles.app.models.InfoCompra;
import com.testing.moviles.app.userinterfaces.SwagHomePage;
import io.appium.java_client.AppiumDriver;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class CheckOut implements Interaction {

    List<InfoCompra> datosCheck;

    public CheckOut(List<InfoCompra> datosCheck) {
        this.datosCheck = datosCheck;
    }

    public static CheckOut Completado(List<InfoCompra> datosCheck){
        return Tasks.instrumented(CheckOut.class, datosCheck);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(SwagHomePage.BTN_CARRITO, isEnabled()).forNoMoreThan(15).seconds(),
                Click.on(SwagHomePage.BTN_CARRITO),
                Click.on(SwagHomePage.BTN_CHECKOUT),
                Enter.theValue(datosCheck.get(0).getNombreCheck()).into(SwagHomePage.CHECK_NAME),
                Enter.theValue(datosCheck.get(0).getApellidoCheck()).into(SwagHomePage.CHECK_APELLIDO),
                Enter.theValue(datosCheck.get(0).getCodPostalCheck()).into(SwagHomePage.CHECK_COD_POSTAL),
                Click.on(SwagHomePage.BTN_CHECK_CONTINUAR),
                WaitUntil.the(SwagHomePage.MSG_CHECK_RESUMEN, isPresent()).forNoMoreThan(15).seconds(),
                SwipeByCoordinates.scorll(532, 1600, 540, 505),
                Click.on(SwagHomePage.BTN_CHECK_RESUMEN)
        );
    }


}
