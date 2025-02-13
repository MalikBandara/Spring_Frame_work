package org.example.controller;


import org.example.dto.CustomerDto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;



@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/vi/customer")
public class CustomerController {
    private ArrayList<CustomerDto> arrayList = new ArrayList<>();


    @PostMapping("save")
    public CustomerDto addCustomer(@RequestBody CustomerDto customerDto){
        System.out.println("Received: " + customerDto);
        arrayList.add(customerDto);
        return customerDto;
    }


    @GetMapping("getAll")
    public List<CustomerDto>getCustomer(){
        return arrayList;
    }


    @PutMapping("update")
    public CustomerDto updateCustomer(@RequestBody CustomerDto customerDto){
        for (int i = 0 ; i < arrayList.size() ;i++){
            CustomerDto customerDto1 = arrayList.get(i);
            if (customerDto1.getId().equals(customerDto.getId())){
                customerDto1.setName(customerDto.getName());
                customerDto1.setAddress(customerDto.getAddress());
                customerDto1.setAge(customerDto.getAge());
                return customerDto1;
            }
        }
        return null;
    }



    @DeleteMapping("/delete/{id}")
    public boolean DeleteCustomer(@PathVariable("id") String id){
        for (int i = 0 ; i < arrayList.size() ; i++){

            CustomerDto customerDto = arrayList.get(i);
            if (customerDto.getId().equals(id)){
                arrayList.remove(i);
                return true;
            }
        }
        return false;
    }

}
