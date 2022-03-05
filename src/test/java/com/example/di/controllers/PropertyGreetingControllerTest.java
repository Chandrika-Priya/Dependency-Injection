package com.example.di.controllers;

import com.example.di.interfaces.GreetingServiceImp;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyGreetingControllerTest {

    PropertyGreetingController greetingServiceController;

    @BeforeEach
    void setUp() {
        greetingServiceController = new PropertyGreetingController();
        greetingServiceController.greetingService = new GreetingServiceImp();
    }

    @Test
    void sayGreeting() {
        System.out.println(greetingServiceController.sayGreeting());
    }
}