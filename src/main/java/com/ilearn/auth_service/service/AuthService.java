package com.ilearn.auth_service.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.ilearn.auth_service.model.LoginResponse;
import com.ilearn.auth_service.model.UserModel;
import com.ilearn.auth_service.repository.AuthRepository;
import com.ilearn.auth_service.security.JwtService;
import com.ilearn.user_service.util.AppConstants;

@Service
public class AuthService {

	@Autowired
	private AuthRepository userRepository;

	@Autowired
	private JwtService jwtService;

	@Autowired
	private PasswordEncoder passwordEncoder;
	
	public LoginResponse login(UserModel request) {

		String token = "";
		
		Optional<UserModel> optionalUser = userRepository.findByUserName(request.getUserName());
		if (optionalUser.isEmpty()) {
			return new LoginResponse(AppConstants.FAILURE,AppConstants.USERNAME_WRONG,token);
		}
		
		UserModel user = optionalUser.get();
		// Plain text password comparison
		if (!passwordEncoder.matches(request.getPassword(), user.getPassword())) {
			return new LoginResponse(AppConstants.FAILURE,AppConstants.PASSWORD_WRONG,token);
		}
		
		// Generate JWT Token
		token=jwtService.generateToken(request.getUserName());

		return new LoginResponse(AppConstants.SUCCESS,AppConstants.LOGIN_SUCCESS,token);
	}
}