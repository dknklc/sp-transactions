package com.dekankilic.transaction.repository;

import com.dekankilic.transaction.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
