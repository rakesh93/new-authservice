package com.ilearn.auth_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ilearn.auth_service.model.LoginResponse;
import com.ilearn.auth_service.model.UserModel;
import com.ilearn.auth_service.service.AuthService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/authservice")
public class AuthController {

	@Autowired
	private AuthService authService;

	@PostMapping("/login")
	public LoginResponse login(@RequestBody UserModel request) {
		return authService.login(request);
	}

}
