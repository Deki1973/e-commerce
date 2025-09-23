package com.youtube.tutorial.ecommerce_backend.api.product;

import com.youtube.tutorial.ecommerce_backend.model.Product;
import com.youtube.tutorial.ecommerce_backend.service.ProductService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/product")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService){
        this.productService=productService;
    }

    @GetMapping("")
    public List<Product> getProducts(){
        return productService.getProducts();
    }
}
