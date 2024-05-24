package com.practica.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Builder
@Data
public class Product {
    private int id;
    private String name;
    private String description;
}
