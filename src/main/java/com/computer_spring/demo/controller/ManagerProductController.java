package com.computer_spring.demo.controller;

import com.computer_spring.demo.domain.model.CPU;
import com.computer_spring.demo.domain.model.HardDriver;
import com.computer_spring.demo.domain.model.MainBoard;
import com.computer_spring.demo.domain.model.Ram;
import com.computer_spring.demo.service.impl.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/admin/products")
@RequiredArgsConstructor
public class ManagerProductController {
	private final ProductServiceImpl productBaseService;
	private final CPUServiceImpl cpuService;
	private final HardDriverServiceImpl hardDriverService;
	private final MainBoardServiceImpl mainBoardService;
	private final RamServiceImpl ramService;

	@GetMapping("/all")
	public ResponseEntity<?> getAllProducts(){
		return ResponseEntity.ok(List.of(productBaseService.getAllProducts()));
	}

	@PostMapping("/add/cpu")
	public ResponseEntity<?> addProduct_CPU(@RequestBody CPU cpu){
		return ResponseEntity.ok(cpuService.saveCpu(cpu));
	}
	@PostMapping("/add/cpus")
	public ResponseEntity<?> addProduct_CPUs(@RequestBody List<CPU> cpuList){
		return ResponseEntity.ok(cpuService.saveCpu(cpuList));
	}

	@PostMapping("/add/hard-driver")
	public ResponseEntity<?> addProduct_HardDriver(@RequestBody HardDriver hardDriver){
		return ResponseEntity.ok(hardDriverService.addHardDriver(hardDriver));
	}
	@PostMapping("/add/hard-drivers")
	public ResponseEntity<?> addProduct_HardDrivers(@RequestBody List<HardDriver> hardDrivers){
		return ResponseEntity.ok(hardDriverService.addHardDrivers(hardDrivers));
	}

	@PostMapping("/add/main-board")
	public ResponseEntity<?> addProduct_MainBoard(@RequestBody MainBoard mainboard){
		return ResponseEntity.ok(mainBoardService.addMainboard(mainboard));
	}
	@PostMapping("/add/main-boards")
	public ResponseEntity<?> addProduct_MainBoards(@RequestBody List<MainBoard> mainBoards){
		return ResponseEntity.ok(mainBoardService.addMainBoards(mainBoards));
	}


	@PostMapping("/add/ram")
	public ResponseEntity<?> addProduct_Ram(@RequestBody Ram ram){
		return ResponseEntity.ok(ramService.addRam(ram));
	}
	@PostMapping("/add/rams")
	public ResponseEntity<?> addProduct_Rams(@RequestBody List<Ram> rams){
		return ResponseEntity.ok(ramService.addRams(rams));
	}
}
