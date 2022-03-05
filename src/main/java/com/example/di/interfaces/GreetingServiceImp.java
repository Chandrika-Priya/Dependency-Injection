package com.example.di.interfaces;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class GreetingServiceImp implements GreetingService{

    @Override
    public String sayHello() {
        return "Hello";
    }
}
