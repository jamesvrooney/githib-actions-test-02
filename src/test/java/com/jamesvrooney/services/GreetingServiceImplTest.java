package com.jamesvrooney.services;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class GreetingServiceImplTest {

    @Autowired
    private GreetingService greetingService;

    @Test
    void helloWorldGreeting() {
        var actualGreeting = greetingService.greeting();

        final String expectedGreeting = "AHello World!";

        assertEquals(expectedGreeting, actualGreeting);
    }
}