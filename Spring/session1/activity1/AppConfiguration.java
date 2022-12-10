package com.crio.session1.activity1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
    @Bean
    public Car car(Engine engine) {
        return new Car(engine);
    }
    
    @Bean
    public Engine engine(Camshaft camshaft, Crankshaft crankshaft) {
        return new CombustionEngine(camshaft, crankshaft);
        // or
        // return new ElectricEngine();
    }
    
    @Bean
    public Camshaft camshaft() {
        return new Camshaft();
    }
    
    @Bean
    public Crankshaft crankshaft() {
        return new Crankshaft();
    }  
}
