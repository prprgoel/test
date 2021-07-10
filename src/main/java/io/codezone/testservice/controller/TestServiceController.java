package io.codezone.testservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestServiceController {

    @GetMapping("/service")
    public String testMethod() {
        return "Hi";
    }


    public static void main(String[] args) {
        System.out.println("Hi Students");
    }

}
