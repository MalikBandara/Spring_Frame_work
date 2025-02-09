package org.example.controller;


import org.example.dto.CustomerDto;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("form")
public class FormDataController {


    //id - 1
    //name - ewe
    //address - eew
    //
    @PostMapping
    public String test1(@RequestParam("id" ) String id , @RequestParam("name") String name){
        return id + " " + name;
    }

    @PostMapping(path = "test2")
    public String test2(CustomerDto customerDto ){
       return customerDto.toString();
    }

    @PostMapping(path = "test3")
    public String test3(@ModelAttribute CustomerDto customerDto ){
        return customerDto.toString();
    }


}

