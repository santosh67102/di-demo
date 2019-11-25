package com.santoshdi.didemo.controllers;

import com.santoshdi.didemo.service.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConstructorInjectedControllerTest {
    private ConstructorInjectedController constructorInjectedController;

    @Before
    public void setUp() throws Exception{
        this.constructorInjectedController=new ConstructorInjectedController(new GreetingServiceImpl());
    }
    @Test
    public void test() throws Exception{
        assertEquals(GreetingServiceImpl.HELLO_WORLD, constructorInjectedController.sayHello());
    }
}
