package com.amanpreet.employeeService.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amanpreet.employeeService.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}
