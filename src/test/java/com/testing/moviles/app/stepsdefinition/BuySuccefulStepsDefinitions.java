package com.testing.moviles.app.stepsdefinition;


import com.testing.moviles.app.excepciones.ExceptionCompra;
import com.testing.moviles.app.models.InfoCompra;
import com.testing.moviles.app.questions.MessageCompra;
import com.testing.moviles.app.task.AgregateProducts;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class BuySuccefulStepsDefinitions {

    @DataTableType
    public InfoCompra convertirFilaATipoInfoCompra(Map<String, String> fila) {
        InfoCompra infoCompra = new InfoCompra();
        infoCompra.setNombreArticulo(fila.get("nombreArticulo"));
        infoCompra.setNombreCheck(fila.get("NombreCheck"));
        infoCompra.setApellidoCheck(fila.get("ApellidoCheck"));
        infoCompra.setCodPostalCheck(fila.get("CodPostalCheck"));
        return infoCompra;
    }

    @When("^Quiero comprar un articulo$")
    public void quieroComprarUnArticulo(List<InfoCompra> artCompra) {
        theActorInTheSpotlight().attemptsTo(AgregateProducts.alCarrito(artCompra));
    }

    @Then("^Vera el mensaje (.*) en el Checkout$")
    public void verElMensajeEnElCheckout(String mensajeCompra) {
        theActorInTheSpotlight().should(
                seeThat(MessageCompra.Exitosa(), equalTo(mensajeCompra))
                        .orComplainWith(ExceptionCompra.class, ExceptionCompra.ErrorCompra())
        );
    }
}
