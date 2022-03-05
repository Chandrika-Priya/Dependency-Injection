package com.example.di.interfaces;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"EN","default"})
@Service("i18nService")
public class I18nEnglishGreetingService implements GreetingService{
    @Override
    public String sayHello() {
        return "Hello People";
    }
}
