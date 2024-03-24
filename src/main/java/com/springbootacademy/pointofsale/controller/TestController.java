package com.springbootacademy.pointofsale.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("api/v1/test")
public class TestController {

    @GetMapping(path = "/get-text-1")
    public String getMyText(){
        String myText = "this is my first springboot app";
        System.out.println(myText);
        return myText;
    }

    @GetMapping("/get-text-2")
    public String getMyText1(){
        String myText = "this is my second springboot app";
        System.out.println(myText);
        return myText;
    }

}
