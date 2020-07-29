/**
 * 
 */
package com.miniamazon.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miniamazon.product.model.Product;

/**
 * @author Anubhab Mukherjee
 *
 */
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
