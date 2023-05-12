package com.computer_spring.demo.domain.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@DiscriminatorValue("CPU")
public class CPU extends BaseProduct{
	private double clockRate;
	private int coreNumber;
	private int threadNumber;

}
