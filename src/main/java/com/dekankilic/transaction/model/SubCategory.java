package com.dekankilic.transaction.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.SQLDelete;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@SQLDelete(sql = "UPDATE SUBCATEGORY SET DELETED = TRUE WHERE ID = ? AND VERSION = ?")
public class SubCategory extends BaseEntity{
    private String name;
    private Long categoryId;
}
