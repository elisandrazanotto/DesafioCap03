package com.devsuperior.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.demo.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String name);

}
