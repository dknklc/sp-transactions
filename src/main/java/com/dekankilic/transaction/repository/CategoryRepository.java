package com.dekankilic.transaction.repository;

import com.dekankilic.transaction.model.Category;
import jakarta.persistence.LockModeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;

import java.util.Optional;

public interface CategoryRepository extends JpaRepository<Category, Long> {


    @Override
    @Lock(value = LockModeType.PESSIMISTIC_READ) // Concurrent read'e izin var demektir. Yani TransactionA ve TransactionB concurrent olarak gelip bu veriyi okuyabilir.
    Optional<Category> findById(Long aLong);
}
