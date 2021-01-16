package com.purvar.springboot.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.purvar.springboot.demo.bean.Emp;
import com.purvar.springboot.demo.mapper.EmpMapper;
import com.purvar.springboot.demo.service.EmpService;

@Service
public class EmpServiceImpl implements EmpService {
	@Autowired
	private EmpMapper mapper;
	
	@Override
	public List<Emp> getEmpList(String empId) {
		return mapper.getEmpListById(empId);
	}
	
	@Override
	public List<Emp> getEmpList() {
		return mapper.getEmpList();
	}
}
