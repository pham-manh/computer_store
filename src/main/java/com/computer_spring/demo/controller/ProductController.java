package com.computer_spring.demo.controller;

import com.computer_spring.demo.service.impl.ProductServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/admin/products")
@RequiredArgsConstructor
public class ProductController {
	private final ProductServiceImpl service;

	@GetMapping("/find/{type}")
	public ResponseEntity<?> findAllByType(@PathVariable String type) {
		return ResponseEntity.ok(service.findByType(type));
	}
	@GetMapping("/findName")
	public ResponseEntity<?> findProductByName(@RequestParam String name) {
		return ResponseEntity.ok(service.findByName(name));
	}


	@GetMapping("/findId")
	public ResponseEntity<?> findProductByID(@RequestParam Long id) {
		return ResponseEntity.ok(Optional.of(service.findById(id)));
	}


}
