package com.pnudev.learnspringpnudev.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello/{id}")
    public String sayHello(@PathVariable("id") Long id, @RequestParam(value = "s", required = false) String someParam) {
        return String.format("Hello world! Id: %s; someParam: %s", id, someParam);
    }

    @GetMapping("/hi")
    public String hi(){
        return "hi";
    }


}