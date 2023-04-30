package com.csi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/api")
public class ApplicationController {

    @GetMapping

    public ResponseEntity<String>sayHello(){
        return  ResponseEntity.ok("Welcome to fintech csi ");

    }
    @GetMapping("/sayservices")

    public ResponseEntity<String>sayServices(){
        return  ResponseEntity.ok("Application Development Services ");

    }
    @GetMapping("/userdetails")

    public ResponseEntity<Principal> userDetails(Principal principal){
        return  ResponseEntity.ok(principal);
    }
}
