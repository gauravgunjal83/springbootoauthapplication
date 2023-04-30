package com.csi.controller;

import com.csi.model.Customer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @GetMapping

    public ResponseEntity<List<Customer>>getAllData(){
        return  ResponseEntity.ok(Stream.of(new Customer (1,"GAURAV","PUNE",97000),
                new Customer(2,"Rohit","pcmc",67000)).collect(Collectors.toList()));

        /*return ResponseEntity.ok(Stream.of(new Customer(121, "gaurav", "Pune",95000),
                new Customer(122, "rohit", "sangamner",65000)).collect(Collectors.toList()));*/
    }
}
