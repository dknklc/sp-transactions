package com.dekankilic.transaction.repository;

import com.dekankilic.transaction.model.SubCategory;
import jakarta.persistence.LockModeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;

import java.util.Optional;

public interface SubCategoryRepository extends JpaRepository<SubCategory, Long> {

    @Override
    @Lock(value = LockModeType.PESSIMISTIC_FORCE_INCREMENT) // Optimistic lockingde ki versionlama sistemidir. Concurrent olarak ne read ne de write yapılamaz. Her read ve write işleminde version update edilir.
    Optional<SubCategory> findById(Long aLong);
}
