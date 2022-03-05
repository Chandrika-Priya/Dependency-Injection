package com.example.di.controllers;

import com.example.di.interfaces.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorGreetingController {
    private  final GreetingService greetingService;

    public ConstructorGreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayGreeting(){
        return greetingService.sayHello();
    }
}
