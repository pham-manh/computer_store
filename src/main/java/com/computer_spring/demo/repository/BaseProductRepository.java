package com.computer_spring.demo.repository;

import com.computer_spring.demo.domain.model.BaseProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BaseProductRepository extends JpaRepository<BaseProduct,Long> {


}
