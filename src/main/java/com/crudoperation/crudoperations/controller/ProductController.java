package com.crudoperation.crudoperations.controller;

import com.crudoperation.crudoperations.entity.Product;
import com.crudoperation.crudoperations.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping("/createProduct")
    public Product createProduct(@RequestBody Product product){
        return productService.createProduct(product);
    }

    @PostMapping("/createProducts")
    public List<Product> createProducts(@RequestBody List<Product> products){
        return productService.createListOfProducts(products);
    }
    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }
    @GetMapping("/productById/{id}")
    public Product findProductById(@PathVariable int id){
        return productService.getProductById(id);
    }
    @GetMapping("/productByName/{name}")
    public Product findProductByName(@PathVariable String name) {
        return productService.getProductByName(name);
    }

    @PutMapping("/update")
    public Product updateProduct(@RequestBody Product product){
        return productService.updateProduct(product);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id){
        return productService.deleteProductById(id);
    }

}
