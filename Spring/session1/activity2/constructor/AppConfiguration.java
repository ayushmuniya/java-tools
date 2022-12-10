package com.crio.session1.activity2.constructor;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.crio.session1.activity2.constructor")
// We can specify multiple packages using basePackages attribute. Let’s see an example.
// @ComponentScan(basePackages = {"com.javabydeveloper.spring.bean.animal.amphibians","com.javabydeveloper.spring.bean.animal.reptiles.crocodles"})
//
// or
//@ComponentScan(basePackageClasses = {Car.class})
// Multiple classes can be specifed
// basePackageClasses is type-safe alternative to basePackages for specifying the packages to scan for annotated components. The package of each class specified will be scanned. 
public class AppConfiguration {
    
}
