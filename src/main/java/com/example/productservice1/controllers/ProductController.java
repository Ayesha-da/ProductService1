package com.example.productservice1.controllers;


import com.example.productservice1.models.Product;
import com.example.productservice1.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private ProductService productService;

    ProductController(ProductService productService){
        this.productService=productService;
    }
     //localhost:8080/products/1
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") long id){
       return productService.getProductById(id);

    }
    @GetMapping
    public List<Product> getAllProducts(){
        return new ArrayList<>();
    }
    @PostMapping()
    public Product createProduct(@RequestBody Product product){
        return null;
    }

    //partial
    @PatchMapping("{id}")
    public Product updateProduct(@PathVariable("id") long id, @RequestBody Product product){
        return new Product();
    }
    @PutMapping("/{id}")
    public Product replaceProduct(@PathVariable("id") long id, @RequestBody Product product){
        return new Product();
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable("id") Long id){
        return;
    }
}
