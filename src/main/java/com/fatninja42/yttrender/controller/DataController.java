package com.fatninja42.yttrender.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DataController {

    @GetMapping("/api/hello")
    public @ResponseBody String hello() {
        return "Hello";
    }
}
