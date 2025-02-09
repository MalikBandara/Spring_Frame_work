package org.example.controller;


import org.example.dto.CustomerDto;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


@RestController
@RequestMapping("json")
public class JSONController {

//    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE )
//    public String test(@RequestBody CustomerDto customerDto){
//    return customerDto.toString();
//    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE )
    public ArrayList<CustomerDto> test3(){
        ArrayList<CustomerDto> arrayList = new ArrayList<>();
        arrayList.add(new CustomerDto("malik" , "bandar" , 12));
        arrayList.add(new CustomerDto("malik" , "kamal" , 32));
        arrayList.add(new CustomerDto("malik" , "Saman" , 12));
        return  arrayList;
    }
}
