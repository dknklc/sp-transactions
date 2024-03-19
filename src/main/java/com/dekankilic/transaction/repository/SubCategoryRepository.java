package com.dekankilic.transaction.repository;

import com.dekankilic.transaction.model.SubCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubCategoryRepository extends JpaRepository<SubCategory, Long> {
}
