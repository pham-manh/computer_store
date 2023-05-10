package com.computer_spring.demo.authentication;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AuthenticationRequest {
	private String email;
	private String password;
}
