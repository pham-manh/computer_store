package com.computer_spring.demo.service;

import com.computer_spring.demo.domain.model.Ram;

import java.util.List;

public interface RamService{
	Ram addRam(Ram ram);
	List<Ram> addRams(List<Ram> rams);
	List<Ram> getAllRams();
}
