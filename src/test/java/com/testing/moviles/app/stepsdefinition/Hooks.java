package com.testing.moviles.app.stepsdefinition;


import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class Hooks {
    @Before
    public void setup(){
        OnStage.setTheStage(new OnlineCast());
    }
}
