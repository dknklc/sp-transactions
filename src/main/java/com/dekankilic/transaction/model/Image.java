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
@SQLDelete(sql = "UPDATE IMAGE SET DELETED = TRUE WHERE ID = ? AND VERSION = ?")
public class Image extends BaseEntity{
    private String name;
    private String url;
    private Long productId;
}
