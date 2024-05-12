package com.example.productservice1.service;

import com.example.productservice1.DTO.ProductDto;
import com.example.productservice1.models.Category;
import com.example.productservice1.models.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class FakeStoreProductService implements ProductService{
    private RestTemplate restTemplate;

    FakeStoreProductService(RestTemplate restTemplate){
        this.restTemplate=restTemplate;
    }
    private Product convertFakestore(ProductDto productDto){
        Product product= new Product();
        product.setId(productDto.getId());
        product.setPrice(productDto.getPrice());
        product.setTitle(productDto.getTitle());
        Category category= new Category();
        category.setTitle(productDto.getCategory());
        product.setCategory(category);
        return product;
    }
    @Override
    public Product getProductById(Long id) {
       ProductDto responseProduct= restTemplate.getForObject("https://fakestoreapi.com/products/1"+id, ProductDto.class);
       //convert fakestore to product because of category
        return convertFakestore(responseProduct);
    }

    @Override
    public List<Product> getAllProducts() {
        return null;
    }

    @Override
    public Product createProduct(Product product) {
        return null;
    }

    @Override
    public Product updateProduct(Product product) {
        return null;
    }

    @Override
    public Product replaceProduct(Product product) {
        return null;
    }

    @Override
    public void deleteProduct(Long id) {

    }
}
