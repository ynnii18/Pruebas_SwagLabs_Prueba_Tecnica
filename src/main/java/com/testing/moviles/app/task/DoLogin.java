package com.testing.moviles.app.task;
import com.testing.moviles.app.userinterfaces.SwagHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class DoLogin implements Task {


    String user;
    String pass;

    public DoLogin(String user, String pass){
        this.user = user;
        this.pass = pass;
    }

    public static DoLogin correctamenteEnLaApp(String user, String pass){
        return Tasks.instrumented(DoLogin.class, user, pass);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(user).into(SwagHomePage.TXT_USUARIO),
                Enter.theValue(pass).into(SwagHomePage.TXT_PASS),
                Click.on(SwagHomePage.BTN_LOGIN)
        );
    }
}
