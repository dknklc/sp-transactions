package com.dekankilic.transaction.controller;


import com.dekankilic.transaction.model.SubCategory;
import com.dekankilic.transaction.service.SubCategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/subcategories")
@RequiredArgsConstructor
public class SubCategoryController {
    private final SubCategoryService subCategoryService;

    @GetMapping("/{id}")
    public ResponseEntity<SubCategory> getById(@PathVariable Long id){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(subCategoryService.findById(id));
    }
}
