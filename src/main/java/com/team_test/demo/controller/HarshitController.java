package com.team_test.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HarshitController {
    @GetMapping("/harshit")
    public String printHello(){
        return "Hello from Harshit!";
    }
}
