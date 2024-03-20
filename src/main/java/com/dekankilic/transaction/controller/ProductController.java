package com.dekankilic.transaction.controller;


import com.dekankilic.transaction.model.Product;
import com.dekankilic.transaction.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    public void create(@RequestBody Product product){
        productService.create(product);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getById(@PathVariable Long id){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(productService.findById(id));
    }
}
