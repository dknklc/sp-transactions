package com.dekankilic.transaction.repository;

import com.dekankilic.transaction.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {
}
