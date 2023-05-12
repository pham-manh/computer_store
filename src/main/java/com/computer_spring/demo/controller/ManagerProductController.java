package com.computer_spring.demo.controller;

import com.computer_spring.demo.domain.model.CPU;
import com.computer_spring.demo.service.CPUServiceImpl;
import com.computer_spring.demo.service.impl.ProductServiceImpl;
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

	@PostMapping("/add/cpu")
	public ResponseEntity<?> addProduct_CPU(@RequestBody CPU cpu){
		return ResponseEntity.ok(cpuService.saveCpu(cpu));
	}
	@PostMapping("/add/cpus")
	public ResponseEntity<?> addProduct_CPUs(@RequestBody List<CPU> cpuList){
		return ResponseEntity.ok(cpuService.saveCpu(cpuList));
	}
	@GetMapping("/all")
	public ResponseEntity<?> getAllProducts(){
		return ResponseEntity.ok(List.of(productBaseService.getAllProducts()));
	}
}
