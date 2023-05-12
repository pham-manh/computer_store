package com.computer_spring.demo.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Ram extends BaseProduct{
	@Enumerated(EnumType.STRING)
	private  RamType type;
	private int busRam;
	private int capacity;

}
