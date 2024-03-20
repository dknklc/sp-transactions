package com.dekankilic.transaction.controller;

import com.dekankilic.transaction.model.Image;
import com.dekankilic.transaction.service.ImageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/images")
@RequiredArgsConstructor
public class ImageController {
    private final ImageService imageService;

    @GetMapping("/{id}")
    public ResponseEntity<Image> findById(@PathVariable Long id){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(imageService.findById(id));
    }
}
