package com.dekankilic.transaction.service;

import com.dekankilic.transaction.model.Image;
import com.dekankilic.transaction.model.Product;
import com.dekankilic.transaction.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;
    private final ImageService imageService;

    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.SERIALIZABLE)
    public void create(Product product){
        productRepository.save(product);
        Image image1 = Image.builder().name("image 1").url("www.dekan.com/image1.png").build();
        Image image2 = Image.builder().name("image 2").url("www.dekan.com/image2.png").build();
        Image image3 = Image.builder().name("image 3").url("www.dekan.com/image3.png").build();
        Image image4 = Image.builder().name("image 4").url("www.dekan.com/image4.png").build();
        List<Image> images = List.of(image1, image2, image3, image4);
        images.forEach(image -> image.setProductId(product.getId()));
        imageService.create(images);
        throw new RuntimeException("Error");
    }
}
