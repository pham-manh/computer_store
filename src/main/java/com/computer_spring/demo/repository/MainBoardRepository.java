package com.computer_spring.demo.repository;

import com.computer_spring.demo.domain.model.MainBoard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MainBoardRepository extends JpaRepository<MainBoard,Long> {
}
