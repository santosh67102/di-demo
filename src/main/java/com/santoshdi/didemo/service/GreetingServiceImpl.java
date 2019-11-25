package com.santoshdi.didemo.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
    public static final String HELLO_WORLD = "Hello - this is the greeting service";

    @Override
    public String sayGreeting() {
        return HELLO_WORLD;
    }
}
