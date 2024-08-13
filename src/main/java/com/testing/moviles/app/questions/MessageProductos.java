package com.testing.moviles.app.questions;


import com.testing.moviles.app.interactions.TakeScreenshot;
import com.testing.moviles.app.userinterfaces.SwagHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;


public class MessageProductos implements Question<String> {

    public static MessageProductos EnHome() {
        return new MessageProductos();
    }

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(SwagHomePage.MSG_PRODUCTOS, WebElementStateMatchers.isPresent()).forNoMoreThan(15).seconds(),
                TakeScreenshot.asEvidence()
        );
        return Text.of(SwagHomePage.MSG_PRODUCTOS).asString().answeredBy(actor);
    }
}
