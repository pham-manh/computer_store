package com.computer_spring.demo.service;

import com.computer_spring.demo.domain.model.CPU;
import com.computer_spring.demo.repository.CpuRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class CPUServiceImpl implements CPUService {
	private final CpuRepository cpuRepository;
	@Override
	public CPU addProduct_CPU(CPU cpu) {
		return cpuRepository.save(cpu);
	}

	@Override
	public CPU saveCpu(CPU cpu) {
		return cpuRepository.save(cpu);
	}

	@Override
	public List<CPU> saveCpu(List<CPU> cpuList) {
		return cpuRepository.saveAll(cpuList);
	}
}
