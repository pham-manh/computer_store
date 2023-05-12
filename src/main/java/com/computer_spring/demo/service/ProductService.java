package com.computer_spring.demo.service;

import com.computer_spring.demo.domain.model.BaseProduct;

import java.util.List;
import java.util.Optional;

public interface ProductService {
	List<BaseProduct> getAllProducts();
	List<BaseProduct> findByName(String name);

	List<BaseProduct> findByType(String type);

	Optional<BaseProduct> findById(Long id);

}
