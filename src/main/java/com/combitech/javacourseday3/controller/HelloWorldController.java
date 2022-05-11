package com.combitech.javacourseday3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/helloworld")
@RestController
public class HelloWorldController {

    @GetMapping
    public HelloWorld sayHelloWorld(){
        return new HelloWorld(1, "Martin");
    }
}