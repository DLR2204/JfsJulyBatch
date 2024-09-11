package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Employee;
import com.service.Services;

@RestController
@RequestMapping("/emp")

public class Controller {
	
	@Autowired
	Services services;
	
	@PostMapping("/addEmp")
	public String insertEmp(@RequestBody Employee emp) {
		return services.addEmp(emp);
	}
	@PutMapping("/updateEmp")
	public String updateEmp(@RequestBody Employee emp) {
		return services.updateEmp(emp);
	}
	
	@DeleteMapping("/delteEmp/{eid}")
	public String deleteEmp(@PathVariable("eid") int empId) {
		return services.deleteEmp(empId);
	}
	@GetMapping("/getEmp/{eid}")
	public Employee getEmp(@PathVariable("eid") int empId) {
		return services.getEmp(empId);
	}

}
