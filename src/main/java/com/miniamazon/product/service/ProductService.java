package com.miniamazon.product.service;

import java.util.List;
import java.util.Optional;

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

	public Product getProduct(int id) {
		Optional<Product> prod = prodRepo.findById(id);
		if (prod.isPresent()) {
			return prod.get();
		} else {
			return null;
		}
	}
	
	public List<Product> getProductList() {
		return prodRepo.findAll();
	}
}
