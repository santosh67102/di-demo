package com.santoshdi.didemo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


public class PrimaryGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello-- from the PRIMARY greetings";
    }
}
