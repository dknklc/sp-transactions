package com.dekankilic.transaction.repository;

import com.dekankilic.transaction.model.Product;
import jakarta.persistence.LockModeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;

import java.util.Optional;


public interface ProductRepository extends JpaRepository<Product, Long> {

    @Override
    @Lock(value = LockModeType.OPTIMISTIC) // Update işlemi yapılınca version da güncellenir. Read ederken güncellenmez. Concurrent readler olabilir ve hiçbirinde version güncellenmez.
    // @Lock(value = LockModeType.OPTIMISTIC_FORCE_INCREMENT) Readlerde de versionu günceller.
    Optional<Product> findById(Long aLong);
}
