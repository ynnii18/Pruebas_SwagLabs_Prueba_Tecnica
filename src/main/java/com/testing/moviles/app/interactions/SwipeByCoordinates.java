package com.testing.moviles.app.interactions;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;


public class SwipeByCoordinates implements Interaction{

	private int inicialX;
	private int inicialY;
	private int endX;
	private int endY;

	public SwipeByCoordinates(int inicialX, int inicialY, int endX, int endY) {
		this.inicialX = inicialX;
		this.inicialY = inicialY;
		this.endX = endX;
		this.endY = endY;
	}
	public static SwipeByCoordinates scorll(int inicialX, int inicialY, int endX, int endY){
		return Tasks.instrumented(SwipeByCoordinates.class, inicialX, inicialY, endX, endY);
	}

	@Override
	@SuppressWarnings("rawtypes")
	@Step("{0} swiped from (#inicialX, #inicialY) to (#endX, #endY)")
	public <T extends Actor> void performAs(T actor) {
		new TouchAction((PerformsTouchActions) GetDriver.as(actor).appiumDriver())
		.longPress(new PointOption<>().withCoordinates(inicialX, inicialY))
		.moveTo(new PointOption<>().withCoordinates(endX, endY))
		.release()
		.perform();
	}

}
