package com.catalog.product.services;

import com.catalog.product.dtos.ProductRecord;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


public interface ProductService{

    ProductRecord create(ProductRecord productRecord);

}
