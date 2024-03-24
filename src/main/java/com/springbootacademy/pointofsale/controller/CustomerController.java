package com.springbootacademy.pointofsale.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("api/v1/customer")
public class CustomerController {
    @GetMapping(path = "/get-text-1")
    public String getMyText(){
        String myText = "customer 1";
        System.out.println(myText);
        return myText;
    }

    @GetMapping("/get-text-2")
    public String getMyText1(){
        String myText = "customer 2";
        System.out.println(myText);
        return myText;
    }
}
