package com.computer_spring.demo.service.impl;

import com.computer_spring.demo.domain.model.BaseProduct;
import com.computer_spring.demo.repository.BaseProductRepository;
import com.computer_spring.demo.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

	private final BaseProductRepository repository;
	private final CPUServiceImpl cpuService;
	private final HardDriverServiceImpl hardDriverService;
	private final MainBoardServiceImpl mainBoardService;
	private final RamServiceImpl ramService;

	@Override
	public List<BaseProduct> getAllProducts() {
		List<BaseProduct> products = new ArrayList<>();
		products.addAll(cpuService.getAll());
		products.addAll(hardDriverService.getAllHardDriver());
		products.addAll(mainBoardService.getAllMainBoards());
		products.addAll(ramService.getAllRams());
		return products;
	}

	@Override
	public List<BaseProduct> findByName(String name) {
		return repository.findByNameLike(name);
	}

	@Override
	public List<BaseProduct> findByType(String type) {
		return repository.findByType(type);
	}

	@Override
	public Optional<BaseProduct> findById(Long id) {
		return repository.findById(id);
	}
}
