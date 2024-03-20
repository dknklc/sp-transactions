package com.dekankilic.transaction.service;

import com.dekankilic.transaction.exception.MyException;
import com.dekankilic.transaction.model.Category;
import com.dekankilic.transaction.model.SubCategory;
import com.dekankilic.transaction.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService {
    private final CategoryRepository categoryRepository;
    private final SubCategoryService subCategoryService;

    // @Transactional(propagation = Propagation.REQUIRED)
    public void create(Category category) {
        categoryRepository.save(category);
        SubCategory subCategory1 = SubCategory.builder().name("Smart Phone").build();
        SubCategory subCategory2 = SubCategory.builder().name("Old Phone").build();
        List<SubCategory> subCategories = List.of(subCategory1, subCategory2);
        subCategories.forEach(subCategory -> subCategory.setCategoryId(category.getId()));
        subCategoryService.create(subCategories);
        // throw new RuntimeException("Exception occurred");
    }

    @Transactional
    public Category findById(Long id){
        return categoryRepository.findById(id).orElseThrow(() -> new MyException("Category not found"));
    }
}
