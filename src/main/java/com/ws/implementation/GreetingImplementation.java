package com.ws.implementation;

import com.ws.domain.JsonStringContainer;
import com.ws.processing.Processing;

public class GreetingImplementation {

    private static final String greetingTemplate = "Hello, %s!";
    
    public static String stringGreeting(String name, int delay) {
        if(delay > 0) { Processing.delay(delay);}
        return String.format(greetingTemplate,  name);
    }
    
    public static JsonStringContainer jsonGreeting(String name, int delay) {
        if(delay > 0) { Processing.delay(delay);}
        return new JsonStringContainer(String.format(greetingTemplate,  name));
    }
    
}
