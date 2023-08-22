package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.EmployeeEntity;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService emser;
	@PostMapping("addemployee")
	public EmployeeEntity add(@RequestBody EmployeeEntity ee) {
		int id = ee.getId();
		String name = ee.getName();
		int age = ee.getAge();
		int salary =ee.getSalary();
		return emser.saveInfo(new EmployeeEntity(id,name,age,salary));
	}
	@GetMapping("showemployee")
	public List<EmployeeEntity>show(){
		return emser.showinfo();
	}
}
