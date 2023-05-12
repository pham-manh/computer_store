package com.computer_spring.demo.service.impl;

import com.computer_spring.demo.domain.model.BaseProduct;
import com.computer_spring.demo.repository.BaseProductRepository;
import com.computer_spring.demo.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

	private final BaseProductRepository repository;

	@Override
	public List<BaseProduct> getAllProducts() {
		return repository.findAll();
	}
}
