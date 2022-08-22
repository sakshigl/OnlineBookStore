package com.globallogic.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.demo.entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
