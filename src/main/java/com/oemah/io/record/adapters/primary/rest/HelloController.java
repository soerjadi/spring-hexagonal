package com.oemah.io.record.adapters.primary.rest;

import com.oemah.io.record.domain.GreetingEntity;
import com.oemah.io.record.ports.adapters.primary.rest.GreetingInterfaces;

import org.springframework.web.bind.annotation.RestController;
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
