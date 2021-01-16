package com.purvar.springboot.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.purvar.springboot.demo.bean.Emp;

@Mapper
public interface EmpMapper {
	List<Emp> getEmpListById(String empId);
	List<Emp> getEmpList();
}
