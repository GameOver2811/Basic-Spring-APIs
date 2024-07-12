package com.ecom.ecom_backend.Controller;

import com.ecom.ecom_backend.Model.ProductModel;
import com.ecom.ecom_backend.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/")
    public String greet() {
        return "Hii Game_Over this side...";
    }

    @GetMapping("/products")
    public List<ProductModel> getAllProducts() {
        return productService.getAllProducts();
    }

    @PostMapping("/addproduct")
    public String addProduct(@RequestBody ProductModel model) {
        productService.addProduct(model);
        return "Product Added Sucessfully....";
    }

    @GetMapping("/getproduct/{id}")
    public Optional<ProductModel> getProduct(@PathVariable int id) {
        return productService.getAllProduct(id);
    }

    @PutMapping("/update")
    public String updateProduct(@RequestBody ProductModel model) {
        productService.addProduct(model);
        return "Product Updated Sucessfully";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id) {
        productService.deleteProduct(id);
        return "Product Deleted Sucessfully....";
    }

    @DeleteMapping("/delete")
    public String deleteAllProducts(){
        productService.deleteAllProducts();
        return "Deleted All Products";
    }

}
