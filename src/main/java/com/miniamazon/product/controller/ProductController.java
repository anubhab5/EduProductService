package com.miniamazon.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miniamazon.product.model.Product;
import com.miniamazon.product.model.ProductDTO;
import com.miniamazon.product.service.ProductService;

@RestController
@RequestMapping(path = "product")
public class ProductController {
	
	@Autowired
	ProductService prodService;

	@PostMapping("/saveproduct")
	public Product saveProduct(@RequestBody ProductDTO prod) {
		Product savedProduct =  prodService.saveProduct(prod);
		return savedProduct;
	}
}
