package com.example.di.controllers;

import com.example.di.interfaces.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyGreetingController {

    @Autowired
    public GreetingService greetingService;

    public String sayGreeting(){
        return greetingService.sayHello();
    }
}
