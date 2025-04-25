package org.example.productservice.service;

import lombok.AllArgsConstructor;
import org.example.productservice.model.entity.Product;
import org.example.productservice.repository.ProductsRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductsServiceImpl1 implements ProductsService {
    private ProductsRepository productsRepository;

    public void saveProducts(Product product) {
        productsRepository.save(product);
    }
    public Product findByIdProducts(Long id) {
        Product productById = productsRepository.findById(id).orElse(null);
        return productById;
    }
    public void updateProductsByIdAndReturnProduct(Long id, Product product) {
        Product productById2 = productsRepository.findById(id).orElse(null);
        productById2.setName(product.getName());
        productById2.setPrice(product.getPrice());
    }
    public void deleteProductsById(Long id) {
        productsRepository.deleteById(id);
    }
}
