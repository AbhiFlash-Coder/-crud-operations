package com.khaja.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.khaja.restapi.entity.AEmployee;
import com.khaja.restapi.repository.EmployeeRepository;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeRepository repo;
	@GetMapping("/employees")
	public List<AEmployee> getAllEmployees(){
		List<AEmployee> employees = repo.findAll();
		
		return employees;
		
	}
	
	@GetMapping("/employees/{id}")
	public AEmployee getAEmployee(@PathVariable int id) {
	AEmployee employee = repo.findById(id).get();
		return employee;	
	}
	
	
	@PostMapping("/employees/add")
	@ResponseStatus(code = HttpStatus.CREATED )
	public void createAEmployee(@RequestBody AEmployee employee) {
		repo.save(employee);
	}
	
	@PutMapping("/employees/update/{id}")
	public AEmployee updateEmployee(@PathVariable int id) {
		AEmployee employee = repo.findById(id).get();
		employee.setEmpname("Aishwarya");
		employee.setEmail("aish96@gmail.com");
		employee.setRole("Reactjs Developer");
		repo.save(employee);
		
		return employee;
		
	}
	@DeleteMapping("/employees/delete/{id}")
	public void removeEmployee(@PathVariable int id) {
		AEmployee employee = repo.findById(id).get();
		repo.delete(employee);
	}
}
