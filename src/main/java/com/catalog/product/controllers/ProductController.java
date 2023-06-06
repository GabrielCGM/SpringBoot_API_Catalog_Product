package com.catalog.product.controllers;

import com.catalog.product.dtos.ProductRecord;
import com.catalog.product.services.ProductService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @PostMapping("/create")
    public ResponseEntity<Object> create(@Valid @RequestBody ProductRecord productRecord){
        return ResponseEntity.status(HttpStatus.CREATED).body(productService.create(productRecord));
    }

}
