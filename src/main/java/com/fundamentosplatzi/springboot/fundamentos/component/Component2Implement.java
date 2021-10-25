package com.fundamentosplatzi.springboot.fundamentos.component;

import org.springframework.stereotype.Component;

@Component
public class Component2Implement implements ComponentDependency {
    @Override
    public void greeting() {
        System.out.println("Hola mundo desde el componente dos");
    }
}
