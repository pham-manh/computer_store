package com.computer_spring.demo.service.impl;

import com.computer_spring.demo.domain.model.MainBoard;
import com.computer_spring.demo.repository.MainBoardRepository;
import com.computer_spring.demo.service.MainBoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service@RequiredArgsConstructor
public class MainBoardServiceImpl implements MainBoardService {
	private final MainBoardRepository repository;

	@Override
	public MainBoard addMainboard(MainBoard mainBoard) {
		return repository.save(mainBoard);
	}

	@Override
	public List<MainBoard> addMainBoards(List<MainBoard> mainBoards) {
		return repository.saveAll(mainBoards);
	}

	@Override
	public List<MainBoard> getAllMainBoards() {
		return repository.findAll();
	}
}
