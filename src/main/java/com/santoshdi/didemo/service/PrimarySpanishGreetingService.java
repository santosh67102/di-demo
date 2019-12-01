package com.santoshdi.didemo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


public class PrimarySpanishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "hola - Servicio de Saludo Primario";
    }
}
