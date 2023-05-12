package com.computer_spring.demo.service;

import com.computer_spring.demo.domain.model.MainBoard;

import java.util.List;

public interface MainBoardService {
	MainBoard addMainboard(MainBoard mainBoard);
	List<MainBoard> addMainBoards(List<MainBoard>mainBoards);
	List<MainBoard> getAllMainBoards();
}
