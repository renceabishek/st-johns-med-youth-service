package com.stjohns.stjohnsyouthservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("t1")
public class TestController {

    @GetMapping
    public String Value() {
        return "win!";
    }
}
