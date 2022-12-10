package com.crio.session1.activity1;


public class Car {

    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }
    
    public void start() {
        engine.turnOn();
    }
}
