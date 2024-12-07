package com.klef.jfsd.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.klef.jfsd.exam.service.ProductService;

@RestController
@RequestMapping("admin")  // Base path for all admin routes
public class AdminController {

    @Autowired
    private ProductService productService;

    // Endpoint to return a simple message (admin home)
    @GetMapping("/")
    public String adminHome() {
        return "I am in Admin Home";
    }

    // Endpoint to fetch all products
    @GetMapping("viewallproducts")
    public List<Object> viewAllProducts() {
        return productService.getAllProducts();
    }

   
}
