package com.testing.moviles.app.stepsdefinition;

import com.testing.moviles.app.questions.MessageProductos;
import com.testing.moviles.app.task.DoLogin;
import com.testing.moviles.app.task.OpenApp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class SuccessfulLoginStepDefinition {


    @Given("^Que (.*) este en la app de SWAGLABS$")
    public void queEsteEnLaAppDeSwagLabs(String nombre) {
        theActorCalled(nombre).wasAbleTo(OpenApp.swaglabs());
    }

    @When("^Diligencie el formulario de ingreso con (.*) y (.*)$")
    public void queDiligenciaElFormularioDeIngreso(String user, String pass) {
        theActorInTheSpotlight().attemptsTo(DoLogin.correctamenteEnLaApp(user, pass));
    }

    @Then("^Verá el mensaje de (.*)$")
    public void veraElmensaje(String msg) {
        theActorInTheSpotlight().should(
                seeThat(MessageProductos.EnHome(), equalTo(msg))
        );
    }


}
