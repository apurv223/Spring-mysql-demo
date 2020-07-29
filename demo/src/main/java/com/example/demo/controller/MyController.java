package com.example.demo.controller;

import com.example.demo.model.City;
import com.example.demo.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @Autowired
    private ICityService cityService;

    @GetMapping("/show")
    public ResponseEntity<Iterable<City>>  findCities() {
        return ResponseEntity.status(HttpStatus.OK).body(cityService.findAll());
    }
}