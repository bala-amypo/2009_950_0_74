package com.example.demo.RestController
@RestController
public class basics{
    @GetMapping("/home")
    public String name(){
        return "helllo world";
    }
}