package com.example.di.controllers;

import com.example.di.interfaces.GreetingServiceImp;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorGreetingControllerTest {

    ConstructorGreetingController constructorGreetingController;
    @BeforeEach
    void setUp() {
        constructorGreetingController= new ConstructorGreetingController(new GreetingServiceImp());
    }

    @Test
    void sayGreeting() {
        System.out.println(constructorGreetingController.sayGreeting());
    }
}