package com.dekankilic.transaction.controller;

import com.dekankilic.transaction.model.Category;
import com.dekankilic.transaction.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/categories")
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryService categoryService;

    @PostMapping
    public void create(@RequestBody Category category){
        categoryService.create(category);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Category> findById(@PathVariable Long id){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(categoryService.findById(id));
    }
}
