package com.example.di.controllers;

import com.example.di.interfaces.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterGreetingController {

    private GreetingService greetingService;
    @Autowired
    public void setterGreeting(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayGreeting(){
        return greetingService.sayHello();
    }
}
