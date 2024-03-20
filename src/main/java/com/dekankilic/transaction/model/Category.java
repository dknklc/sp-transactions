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
@SQLDelete(sql = "UPDATE CATEGORY SET DELETED = TRUE WHERE ID = ? AND VERSION = ?")
public class Category extends BaseEntity{

    private String name;
}
