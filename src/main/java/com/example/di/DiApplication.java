package com.example.di;

import com.example.di.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiApplication.class, args);
		MyController myController = (MyController) ctx.getBean("myController");
		String greeting = myController.sayHello();
		System.out.println(greeting);
		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayGreeting());
		System.out.println("-------property------");
		PropertyGreetingController propertyGreetingController = (PropertyGreetingController) ctx.getBean("propertyGreetingController");
		System.out.println(propertyGreetingController.sayGreeting());
		SetterGreetingController setterGreetingController = (SetterGreetingController) ctx.getBean("setterGreetingController");
		System.out.println(setterGreetingController.sayGreeting());
		ConstructorGreetingController constructorGreetingController = (ConstructorGreetingController) ctx.getBean("constructorGreetingController");
		System.out.println(constructorGreetingController.sayGreeting());
	}
}
