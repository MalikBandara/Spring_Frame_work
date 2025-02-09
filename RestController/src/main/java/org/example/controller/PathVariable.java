package org.example.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("variable")
public class PathVariable {


    @GetMapping(path = "{id}")

    public String pathVariableMapping(@org.springframework.web.bind.annotation.PathVariable("id") String id ){
        return id;
    }

    @GetMapping(path = "{id}/{name}")

    public String pathVariableMapping2(@org.springframework.web.bind.annotation.PathVariable("id") String id ,
                                       @org.springframework.web.bind.annotation.PathVariable("name")  String name){
        return "id : " + id + "name : " + name;
    }

    @GetMapping(path = "test/{id: [A][0-9]{3}]}")

    public String pathVariableMapping3(@org.springframework.web.bind.annotation.PathVariable("id") String id ){
        return id;
    }
}
