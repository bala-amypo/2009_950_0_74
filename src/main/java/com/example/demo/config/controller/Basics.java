package com.example.demo.Controller;
import org.springframework.web.bind.annotation.*;
@RestController
public class Basics{
    @GetMapping("/home")
    public String name(){
        return "helllo world";
    }
}