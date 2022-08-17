package com.gestion.demo;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controllers {
    public String get() {
       return "Hello World";
    }
}
