package com.computer_spring.demo.service;

import com.computer_spring.demo.domain.model.HardDriver;

import java.util.List;

public interface HardDriverService {
	HardDriver addHardDriver(HardDriver hardDriver);
	List<HardDriver> addHardDrivers(List<HardDriver> hardDrivers);

	List<HardDriver> getAllHardDriver();
}
