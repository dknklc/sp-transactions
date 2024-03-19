package com.dekankilic.transaction.repository;


import com.dekankilic.transaction.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {
}
