package org.example.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("caractor")
public class CharacterMapping {


    @GetMapping(path = "test1/I???")
    public String character(){
        return "character mapping method invoke ";
    }

    @GetMapping(path = "????/test2")
    public String character2(){
        return "character 2  mapping method invoke ";
    }
}
