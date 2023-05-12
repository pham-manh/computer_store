package com.computer_spring.demo.domain.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@DiscriminatorValue("HardDriver")
public class HardDriver extends BaseProduct {
	@Enumerated(EnumType.STRING)
	private HardDriverType type;
	private int capacity;
}
