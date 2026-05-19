package com.oemah.io.hexa.adapters.primary.rest;

import org.springframework.web.bind.annotation.RestController;

import com.oemah.io.hexa.domain.GreetingEntity;
import com.oemah.io.hexa.ports.adapters.primary.rest.GreetingInterfaces;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/hello")
public class HelloController implements GreetingInterfaces {
    
    @GetMapping("/")
    public GreetingEntity HelloWorld() {
        return new GreetingEntity("hello world!");
    }

}
