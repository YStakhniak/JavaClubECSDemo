package com.javaclub.ecsdemo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BanderaController {

    @GetMapping("/russnia")
    public String getRussnia() {

        return "RUSNI PYZDA";
    }
}
