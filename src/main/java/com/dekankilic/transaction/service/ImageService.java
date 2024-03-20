package com.dekankilic.transaction.service;

import com.dekankilic.transaction.model.Image;
import com.dekankilic.transaction.repository.ImageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ImageService {
    private final ImageRepository imageRepository;

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void create(List<Image> images){
        imageRepository.saveAll(images);
        //throw new RuntimeException("Error");
    }

    @Transactional
    public Image findById(Long id){
        return imageRepository.findById(id).orElseThrow(() -> new RuntimeException("Image not found"));
    }
}
