package com.crudoperation.crudoperations.service;

import com.crudoperation.crudoperations.entity.Product;
import com.crudoperation.crudoperations.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

   //Post
    public Product createProduct(Product product) {
        return repository.save(product);
    }
    // create list of products
    public List<Product> createListOfProducts(List<Product> products) {
        return repository.saveAll(products);
    }

    //Get
    public List<Product> getAllProducts() {
        return repository.findAll();
    }

    public Product getProductById(int id) {
        return repository.findById(id).orElse(null);
    }


    public Product getProductByName(String name) {
        return repository.findByName(name);
    }

    //delete
    public String deleteProductById(int id) {
        repository.deleteById(id);
        return "Product deleted " + id;
    }

    //update
    public Product updateProduct(Product product){
        Product existingProduct = repository.findById(product.getId()).orElse(null);
        existingProduct.setName(product.getName());
        existingProduct.setQuantity(product.getQuantity());
        existingProduct.setPrice(product.getPrice());

        return repository.save(existingProduct);
    }
}
