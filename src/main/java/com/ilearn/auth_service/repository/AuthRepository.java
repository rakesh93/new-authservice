package com.ilearn.auth_service.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ilearn.auth_service.model.UserModel;

public interface AuthRepository extends JpaRepository<UserModel, Long> {

    Optional<UserModel> findByUserName(String userName);

}