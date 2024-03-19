package com.dekankilic.transaction.service;

import com.dekankilic.transaction.model.SubCategory;
import com.dekankilic.transaction.repository.SubCategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SubCategoryService {
    private final SubCategoryRepository subCategoryRepository;

    @Transactional(propagation = Propagation.SUPPORTS)
    public void create(List<SubCategory> subCategories){
        subCategoryRepository.saveAll(subCategories);
        throw new RuntimeException("Exception occurred");

    }
}
