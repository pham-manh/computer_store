package com.computer_spring.demo.service;

import com.computer_spring.demo.domain.model.CPU;

import java.util.List;

public interface CPUService {

	CPU addProduct_CPU(CPU cpu);

	CPU saveCpu(CPU cpu);

	List<CPU> saveCpu(List<CPU> cpuList);

	List<CPU> getAll();
}
