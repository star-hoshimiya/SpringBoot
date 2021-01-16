package com.purvar.springboot.demo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.purvar.springboot.demo.bean.Emp;
import com.purvar.springboot.demo.service.EmpService;

@RestController
@RequestMapping("/emp")
public class EmpController {
	@Autowired
	private EmpService service;
	
	@RequestMapping("/show/{id}")
	public List<Emp> login(@PathVariable("id") String empId) {
		return service.getEmpList(empId);
	}
	
	@RequestMapping("/show")
	public List<Emp> show() {
		return service.getEmpList();
	}
}
