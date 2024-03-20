package com.dekankilic.transaction.model;

import jakarta.persistence.Entity;
import lombok.*;
import org.hibernate.annotations.SQLDelete;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@SQLDelete(sql = "UPDATE PRODUCT SET DELETED = TRUE WHERE ID = ? AND VERSION = ?")
public class Product extends BaseEntity{
    private String name;
    private Integer price;
    private Integer stock;
    private Integer categoryId;
}
