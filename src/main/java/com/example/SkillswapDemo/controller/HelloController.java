package com.example.SkillswapDemo.controller;

import com.example.SkillswapDemo.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    private final HelloService helloService;
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, Spring Boot!";
    }

    @GetMapping("/answerhello")
    public String answerHello(@RequestParam("name") String name){
        return helloService.hello(name);
    }
}
