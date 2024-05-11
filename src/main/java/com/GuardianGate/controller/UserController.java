package com.GuardianGate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {

	@GetMapping
	public String getAllUsers() {
		return "Retornando todos os usuários...";
	}

	@GetMapping("/{id}")
	public String getUserById(@PathVariable Long id) {
		return "Retornando usuário com o ID " + id + "...";
	}
}
