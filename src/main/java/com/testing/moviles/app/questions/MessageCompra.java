package com.testing.moviles.app.questions;


import com.testing.moviles.app.interactions.TakeScreenshot;
import com.testing.moviles.app.userinterfaces.SwagHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;


public class MessageCompra implements Question<String> {

    public static MessageCompra Exitosa() {
        return new MessageCompra();
    }

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(SwagHomePage.TXT_MENSAJE, WebElementStateMatchers.isPresent()).forNoMoreThan(15).seconds(),
                TakeScreenshot.asEvidence()
        );
        return Text.of(SwagHomePage.TXT_MENSAJE).asString().answeredBy(actor);
    }
}
