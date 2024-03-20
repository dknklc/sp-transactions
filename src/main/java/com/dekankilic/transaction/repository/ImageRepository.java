package com.dekankilic.transaction.repository;


import com.dekankilic.transaction.model.Image;
import jakarta.persistence.LockModeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;

import java.util.Optional;

public interface ImageRepository extends JpaRepository<Image, Long> {

    @Override
    @Lock(value = LockModeType.PESSIMISTIC_WRITE) // En strict locking. Yani siz aynı anda ne read ne de write yapamazsınız.
    Optional<Image> findById(Long aLong);
}
