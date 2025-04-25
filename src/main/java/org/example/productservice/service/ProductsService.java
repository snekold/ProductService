package org.example.productservice.service;

import org.example.productservice.model.entity.Product;

public interface ProductsService {

    void saveProducts(Product product);
    Product findByIdProducts(Long id);
    void updateProductsByIdAndReturnProduct(Long id, Product product);
    void deleteProductsById(Long id);
}
