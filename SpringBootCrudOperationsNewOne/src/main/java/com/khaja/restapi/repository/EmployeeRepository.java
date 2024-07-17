package com.khaja.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.khaja.restapi.entity.AEmployee;

public interface EmployeeRepository extends JpaRepository<AEmployee, Integer> {

}
