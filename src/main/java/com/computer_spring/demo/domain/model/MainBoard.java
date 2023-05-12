package com.computer_spring.demo.domain.model;

import jakarta.persistence.Entity;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MainBoard extends BaseProduct {
	private String chipSet;

}
