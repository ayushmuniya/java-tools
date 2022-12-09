package com.crio.session1.activity1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);

        Car car = context.getBean(Car.class);
        
        car.start();
        // Uncomment to prevent Resource leak: 'context' is never closed
        //((AnnotationConfigApplicationContext)context).close();
    }
}
