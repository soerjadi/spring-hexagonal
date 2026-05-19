package com.oemah.io.hexa.ports.adapters.primary.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.oemah.io.hexa.domain.GreetingEntity;

@RequestMapping("/default")
public interface GreetingInterfaces {

    @GetMapping("/")
    GreetingEntity HelloWorld();
}
