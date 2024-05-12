package com.example.productservice1.DTO;

import com.example.productservice1.models.Category;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDto {
    private long id;
    private String title;
    private double price;
    private String category;
}
