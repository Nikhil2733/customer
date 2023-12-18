package com.second.RestApi.controller;

import com.second.RestApi.model.customer;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class customerService {

    customer CustomerSer;
    @GetMapping("{Cust_Id}")
    public customer getcustomerDetails(int Cust_Id){
        return CustomerSer;
    }

    @PostMapping
    public String createcustomerDetails(@RequestBody customer CustomerSer){
        this.CustomerSer = CustomerSer;
        return "Details has been successfully created";
    }
}
