package com.computer_spring.demo.service.impl;

import com.computer_spring.demo.domain.model.BaseProduct;
import com.computer_spring.demo.repository.BaseProductRepository;
import com.computer_spring.demo.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

	private final BaseProductRepository repository;
	private final CPUServiceImpl cpuService;
	private final HardDriverServiceImpl hardDriverService;

	@Override
	public List<BaseProduct> getAllProducts() {
		List<BaseProduct> products = new ArrayList<>();
		products.addAll(cpuService.getAll());
		products.addAll(hardDriverService.getAllHardDriver());
		return products;
	}
}
