package com.kenzie.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.kenzie.model.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {
	//Product findByName(String name);

}