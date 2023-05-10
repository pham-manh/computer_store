package com.computer_spring.demo.domain.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class Role {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	private Long id;

	@Enumerated(EnumType.STRING)
	private RoleType type;

	@ManyToMany(mappedBy = "roles", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH})
	private Set<User> users = new LinkedHashSet<>();


	public Role(RoleType roleType) {
		this.type = roleType;
	}

}
