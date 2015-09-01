package com.ws.services;

import com.ws.domain.JsonStringContainer;
import com.ws.implementation.GreetingImplementation;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingServices {
    
    @RequestMapping("/string/greeting")
    public String stringGreeting(@RequestParam(value="name", required=false, defaultValue="World") String name,
            @RequestParam(value="delay", required=false, defaultValue="0") int delay) {
        return GreetingImplementation.stringGreeting(name, delay);
    }
    
    @RequestMapping("/json/greeting")
    public JsonStringContainer jsonGreeting(@RequestParam(value="name", required=false, defaultValue="World") String name,
            @RequestParam(value="delay", required=false, defaultValue="0") int delay) {
        return GreetingImplementation.jsonGreeting(name, delay);
    }
}
