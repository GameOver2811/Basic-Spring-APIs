package com.ecom.ecom_backend.Service;

import com.ecom.ecom_backend.Model.ProductModel;
import com.ecom.ecom_backend.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductRepo productRepo;

    public List<ProductModel> getAllProducts() {
        return productRepo.findAll();
    }

    public void addProduct(ProductModel model) {
        productRepo.save(model);
    }

    public Optional<ProductModel> getAllProduct(int id) {
        return productRepo.findById(id);
    }

    public void deleteProduct(int id) {
        productRepo.deleteById(id);
    }

    public void deleteAllProducts() {
        productRepo.deleteAll();
    }
}
