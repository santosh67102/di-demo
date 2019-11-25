package com.santoshdi.didemo.controllers;

import com.santoshdi.didemo.service.GreetingService;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private GreetingService greetingService;


    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){
        System.out.println("Hello");
        return greetingService.sayGreeting();
    }
}