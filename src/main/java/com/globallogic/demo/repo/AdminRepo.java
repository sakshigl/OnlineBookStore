package com.globallogic.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.demo.entity.Admin;

public interface AdminRepo extends JpaRepository<Admin, Integer>{

}
