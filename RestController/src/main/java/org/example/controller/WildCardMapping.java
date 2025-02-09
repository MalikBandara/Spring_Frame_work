package org.example.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("wildcard")
public class WildCardMapping {


    @GetMapping (path = "test1/*")
    public String wildMethod(){
        return  "get wild card method invoke !";
    }

    @GetMapping (path = "test2/*")
    public String wildMethod2(){
        return  "get wild card 2  method invoke !";
    }
}
