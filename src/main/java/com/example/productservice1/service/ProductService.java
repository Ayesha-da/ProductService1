package com.example.productservice1.service;

import com.example.productservice1.models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


public interface ProductService {
    Product getProductById(Long id);
    List<Product> getAllProducts();
    Product createProduct(Product product);

    Product updateProduct(Product product);

    Product replaceProduct( Product product);


    void deleteProduct( Long id);
}
