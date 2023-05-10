package com.computer_spring.demo.repository;

import com.computer_spring.demo.domain.model.Role;
import com.computer_spring.demo.domain.model.RoleType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	Optional<Role> findByType(RoleType type);
}
