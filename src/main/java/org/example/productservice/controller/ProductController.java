package org.example.productservice.controller;

import org.example.productservice.model.entity.Product;
import org.example.productservice.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductsService productsService;

    public ProductController(@Autowired @Qualifier("productsServiceImpl1")
                             ProductsService productsService) {
        this.productsService = productsService;
    }
    @PostMapping("/{Product}")
    public void addProduct(@PathVariable Product product) {
        productsService.saveProducts(product);

    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getUserId(@PathVariable Long id) {
        Product product = productsService.findByIdProducts(id);
        return ResponseEntity.ok().body(product);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Product> deleteProduct(@PathVariable Long id) {
        productsService.deleteProductsById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
