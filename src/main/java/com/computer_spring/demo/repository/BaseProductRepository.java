package com.computer_spring.demo.repository;

import com.computer_spring.demo.domain.model.BaseProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BaseProductRepository extends JpaRepository<BaseProduct,Long> {
	@Query(value = "select p from BaseProduct p where lower(p.name) like concat('%',?1,'%')")
	List<BaseProduct> findByNameLike(String name);
	@Query(value = "select * from products p where lower(p.product_type) like concat('%',?1,'%')",nativeQuery = true)
	List<BaseProduct> findByType(String type);
}
