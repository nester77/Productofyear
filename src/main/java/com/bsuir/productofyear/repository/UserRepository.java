package com.bsuir.productofyear.repository;

import com.bsuir.productofyear.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long>{


}
