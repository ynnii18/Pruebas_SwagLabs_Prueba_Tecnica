package com.testing.moviles.app.interactions;

import com.testing.moviles.app.userinterfaces.SwagHomePage;
import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.List;

public class CatalogoDeArticulos {

        public CatalogoDeArticulos(){}

        public static List<String> obtenerArticulos(Actor actor) {
                actor.attemptsTo(
                        WaitUntil.the(SwagHomePage.LBL_NAME_ARTICULOS, WebElementStateMatchers.isPresent()).forNoMoreThan(15).seconds()
                );
                List<WebElement> elements = GetDriver.as(actor).appiumDriver().findElements(AppiumBy.xpath("//*[@class='android.widget.TextView' and @content-desc='test-Titulo de articulo']"));
                List<String> listaBotones = new ArrayList<>();
                for (WebElement element : elements) {
                        listaBotones.add(element.getText());
                }
                return listaBotones;
        }
}
