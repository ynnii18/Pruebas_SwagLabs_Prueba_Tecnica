package com.testing.moviles.app.userinterfaces;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SwagHomePage {
    public static final Target TXT_USUARIO = Target.the("Campo Usuario").locatedForAndroid(MobileBy.AccessibilityId("test-Usuario")).locatedForIOS(By.id(""));
    public static final Target TXT_PASS = Target.the("Campo Password").locatedForAndroid(MobileBy.AccessibilityId("test-Contraseña")).locatedForIOS(By.id(""));
    public static final Target BTN_LOGIN = Target.the("Campo Password").locatedForAndroid(MobileBy.AccessibilityId("test-LOGIN")).locatedForIOS(By.id(""));
    public static final Target MSG_PRODUCTOS = Target.the("Mensaje Productos").locatedForAndroid(MobileBy.xpath("//*[@text='PRODUCTOS']")).locatedForIOS(By.id(""));
    public static final Target CHECK_NAME = Target.the("Nombre Cliente Checkout").locatedForAndroid(MobileBy.AccessibilityId("test-Nombre")).locatedForIOS(By.id(""));
    public static final Target CHECK_APELLIDO = Target.the("Apellido Cliente Checkout").locatedForAndroid(MobileBy.AccessibilityId("test-Apellido")).locatedForIOS(By.id(""));
    public static final Target CHECK_COD_POSTAL = Target.the("Código Postal Checkout").locatedForAndroid(MobileBy.AccessibilityId("test-Código postal")).locatedForIOS(By.id(""));
    public static final Target BTN_CHECK_CONTINUAR = Target.the("Botón Continuar del Checkout").locatedForAndroid(MobileBy.AccessibilityId("test-CONTINUAR")).locatedForIOS(By.id(""));
    public static final Target MSG_CHECK_RESUMEN = Target.the("Mensaje Resumen").locatedForAndroid(By.xpath("//*[@text='CHECKOUT: RESUMEN']")).locatedForIOS(By.id(""));
    public static final Target BTN_CHECK_RESUMEN = Target.the("Botón Terminar del Checkout").locatedForAndroid(MobileBy.AccessibilityId("test-TERMINAR")).locatedForIOS(By.id(""));
    public static final Target TXT_MENSAJE = Target.the("Mensaje de confirmación Checkout").locatedForAndroid(MobileBy.xpath("//android.widget.TextView[@text='CHECKOUT: COMPLETADO!']")).locatedForIOS(By.id(""));
    public static final Target BTNS_ADD = Target.the("Botón Agregar").locatedForAndroid(AppiumBy.xpath("//*[@class='android.view.ViewGroup' and @content-desc='test-AÑADIR A CARRITO']")).locatedForIOS(By.id(""));
    public static final Target LBL_NAME_ARTICULOS = Target.the("Nombre de Artículos").locatedForAndroid(MobileBy.xpath("//*[@class='android.widget.TextView' and @content-desc='test-Titulo de articulo']")).locatedForIOS(By.id(""));
    public static final Target BTN_CARRITO = Target.the("Botón Carrito").locatedForAndroid(AppiumBy.xpath("//*[contains(@content-desc,'test-Carrito')]")).locatedForIOS(By.id(""));
    public static final Target BTN_CHECKOUT = Target.the("Botón Checkout").locatedForAndroid(AppiumBy.accessibilityId("test-CHECKOUT")).locatedForIOS(By.id(""));

    private SwagHomePage(){
        throw new IllegalStateException("Error SwagHomePage");
    }
}
