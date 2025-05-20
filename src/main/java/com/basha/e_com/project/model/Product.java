package com.basha.e_com.project.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
    private String brand;
    private BigDecimal price;
    private String category;
    @Column(name = "release_date")
    private Date releaseDate;
    private int quantities;

    @Column(name = "product_available")
    private boolean productAvailable;
    private String ImageName;
    private String ImageType;
    @Lob
    private byte[] ImageDate;

}
