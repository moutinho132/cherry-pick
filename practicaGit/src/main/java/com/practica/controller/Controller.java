package com.practica.controller;

import com.practica.models.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping( "/api/product")
public class Controller {

    @GetMapping
    public ResponseEntity<List<Product>> getProduct() {
        return new ResponseEntity<>(List.of(Product.builder().id(1).name("Gelatina").description("para comer").build()), HttpStatus.ACCEPTED) ;
    }

}
