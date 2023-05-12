package com.computer_spring.demo.domain.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "products")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@DiscriminatorColumn(name="product_type",
		discriminatorType = DiscriminatorType.STRING)
public class BaseProduct {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	private Long id;

	private String name;
	private double price;
	private int warrantyPeriod;
	private String description;
	private String supplierName;
	private int quantity;
	@Transient
	private boolean stockingStatus;

	public boolean isStockingStatus() {
		return this.getQuantity() > 0;
	}
}
