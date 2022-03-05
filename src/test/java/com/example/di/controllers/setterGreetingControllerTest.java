package com.example.di.controllers;

import com.example.di.interfaces.GreetingServiceImp;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class setterGreetingControllerTest {

    SetterGreetingController setterGreetingController;

    @BeforeEach
    void setUp() {
        setterGreetingController = new SetterGreetingController();
        setterGreetingController.setterGreeting(new GreetingServiceImp());
    }

    @Test
    void sayGreeting() {
        System.out.println(setterGreetingController.sayGreeting());
    }
}