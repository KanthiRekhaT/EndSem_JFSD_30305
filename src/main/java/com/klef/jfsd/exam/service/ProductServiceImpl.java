package com.klef.jfsd.exam.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private RestTemplate restTemplate;

    // Base URL for the Fake Store API
    private static final String API_URL = "https://fakestoreapi.com/products";

    @Override
    public List<Object> getAllProducts() {
        // Use RestTemplate to fetch all products from the Fake Store API
        Object[] products = restTemplate.getForObject(API_URL, Object[].class);
        return Arrays.asList(products);
    }

   
}