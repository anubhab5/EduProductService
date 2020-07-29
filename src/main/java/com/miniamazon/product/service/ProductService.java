package com.miniamazon.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miniamazon.product.model.Product;
import com.miniamazon.product.model.ProductDTO;
import com.miniamazon.product.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository prodRepo;

	public Product saveProduct(ProductDTO product) {
		Product newProduct = new Product();
		newProduct.setProductName(product.getProductName());
		newProduct.setProductDescription(product.getProductDescription());
		newProduct.setProductPrice(product.getProductPrice());
		Product savedProduct = prodRepo.save(newProduct);
		return savedProduct;
	}
}
