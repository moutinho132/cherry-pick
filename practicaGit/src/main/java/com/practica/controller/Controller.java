package com.practica.controller;

import com.practica.models.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Controller {

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getProducts() {
        List<Product> products = List.of(
                Product.builder().id(1).name("Gelatina").description("Para comer").build(),
                Product.builder().id(2).name("Yogurt").description("Bebida láctea").build(),
                Product.builder().id(3).name("Pan").description("Producto horneado").build()
        );
        return new ResponseEntity<>(products, HttpStatus.ACCEPTED);
    }
}

