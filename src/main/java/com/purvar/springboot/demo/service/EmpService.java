package com.purvar.springboot.demo.service;

import java.util.List;

import com.purvar.springboot.demo.bean.Emp;

public interface EmpService {
	List<Emp> getEmpList(String empId);
	List<Emp> getEmpList();
}
