package com.testing.moviles.app.task;

import com.testing.moviles.app.interactions.TakeScreenshot;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import java.util.logging.Logger;

public class OpenApp implements Task {

    public OpenApp() {
    }

    public static OpenApp swaglabs() {
        return Tasks.instrumented(OpenApp.class);
    }

    @Override
    @Step("App SwagLabs abierta")
    public <T extends Actor> void performAs(T actor) {
        Logger.getAnonymousLogger().info("Se abre app Swag Labs");
        actor.attemptsTo(TakeScreenshot.asEvidence());
    }
}