package com.computer_spring.demo.service.impl;

import com.computer_spring.demo.domain.model.Ram;
import com.computer_spring.demo.repository.RamRepository;
import com.computer_spring.demo.service.RamService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RamServiceImpl implements RamService {
	private final RamRepository repository;

	@Override
	public Ram addRam(Ram ram) {
		return repository.save(ram);
	}

	@Override
	public List<Ram> addRams(List<Ram> rams) {
		return repository.saveAll(rams);
	}

	@Override
	public List<Ram> getAllRams() {
		return repository.findAll();
	}
}
