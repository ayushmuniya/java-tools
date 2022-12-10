package com.crio.session1.activity2.constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("Combustion Engine") // Component with custom name specified by developer other than default name
public class CombustionEngine implements Engine {
    
    private Camshaft camshaft;
    private Crankshaft crankshaft;

    @Autowired
    public CombustionEngine(Camshaft camshaft, Crankshaft crankshaft) {
        this.camshaft = camshaft;
        this.crankshaft = crankshaft;
    }

    @Override
    public void turnOn() {
        System.out.println("Started combustion engine");
    }
}
