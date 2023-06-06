package com.catalog.product.services.impl;

import com.catalog.product.dtos.ProductRecord;
import com.catalog.product.models.ProductModel;
import com.catalog.product.repositories.ProductRepository;
import com.catalog.product.services.ProductService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    @Override
    @Transactional
    public ProductRecord create(ProductRecord productRecord) {
        var product = new ProductModel(productRecord.name(), productRecord.brand(), productRecord.description(), productRecord.stock());
        productRepository.save(product);

        return null;
    }
}
