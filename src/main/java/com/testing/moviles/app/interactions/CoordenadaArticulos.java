package com.testing.moviles.app.interactions;

import com.testing.moviles.app.userinterfaces.SwagHomePage;
import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.List;

public class CoordenadaArticulos {

    public CoordenadaArticulos(){}

    public static List<String> obtenerCoordenadas(Actor actor) {

        actor.attemptsTo(
                WaitUntil.the(SwagHomePage.BTNS_ADD, WebElementStateMatchers.isPresent()).forNoMoreThan(15).seconds()
        );
        List<String> listaCoordenadas = new ArrayList<>();
        List<WebElement> elements = GetDriver.as(actor).appiumDriver().findElements(AppiumBy.xpath("//*[@class='android.view.ViewGroup' and @content-desc='test-AÑADIR A CARRITO']"));
        List<String> listaBotones = new ArrayList<>();
        for (WebElement element : elements) {
            listaBotones.add(element.getText());
        }
        for(int i=0; i<listaBotones.size(); i++) {
            int coorX = GetDriver.as(actor).appiumDriver().findElements(By.xpath("//*[@class='android.view.ViewGroup' and @content-desc='test-AÑADIR A CARRITO']")).get(i).getLocation().getX();
            int coorY = GetDriver.as(actor).appiumDriver().findElements(By.xpath("//*[@class='android.view.ViewGroup' and @content-desc='test-AÑADIR A CARRITO']")).get(i).getLocation().getY();
            listaCoordenadas.add(String.valueOf(coorX) + "-" + String.valueOf(coorY));
        }
        return listaCoordenadas;
    }
}
