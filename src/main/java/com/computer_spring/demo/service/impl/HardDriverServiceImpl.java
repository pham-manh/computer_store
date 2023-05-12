package com.computer_spring.demo.service.impl;

import com.computer_spring.demo.domain.model.HardDriver;
import com.computer_spring.demo.repository.HardDriverRepository;
import com.computer_spring.demo.service.HardDriverService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service@RequiredArgsConstructor
public class HardDriverServiceImpl implements HardDriverService {
	private final HardDriverRepository repository;


	@Override
	public HardDriver addHardDriver(HardDriver hardDriver) {
		return repository.save(hardDriver);
	}

	@Override
	public List<HardDriver> addHardDrivers(List<HardDriver> hardDrivers) {
		return repository.saveAll(hardDrivers);
	}

	@Override
	public List<HardDriver> getAllHardDriver() {
		return repository.findAll();
	}
}
