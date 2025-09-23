package com.youtube.tutorial.ecommerce_backend.service;

import com.youtube.tutorial.ecommerce_backend.model.Product;
import com.youtube.tutorial.ecommerce_backend.model.dao.ProductDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    //@Autowired
    public ProductDAO productDAO;

    public ProductService(ProductDAO productDAO){
        this.productDAO=productDAO;
    }

    public List<Product> getProducts(){
        return productDAO.findAll();
    }

}
