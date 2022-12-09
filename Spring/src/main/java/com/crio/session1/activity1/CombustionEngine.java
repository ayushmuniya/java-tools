package com.crio.session1.activity1;

public class CombustionEngine implements Engine {
    
    private Camshaft camshaft;
    private Crankshaft crankshaft;

    public CombustionEngine(Camshaft camshaft, Crankshaft crankshaft) {
        this.camshaft = camshaft;
        this.crankshaft = crankshaft;
    }

    @Override
    public void turnOn() {
        System.out.println("Started combustion engine");
    }
}
