package com.first_springboot.first_springboot.controller;

import lombok.Data;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.first_springboot.first_springboot.entity.DepartmentEntity;

@RestController
@RequestMapping("/department")
public class HelloController {
	

	Map m = new HashMap();
    
	@RequestMapping(value="/getDeptName", method = RequestMethod.GET)
	DepartmentEntity getdeptName(@RequestParam String depId)
	{
		int deptid = Integer.parseInt(depId);
		System.out.println("DeptID passed :::"+deptid);
		DepartmentEntity depentity = new DepartmentEntity();
		depentity.setDeptId(100);
		depentity.setDeptName("Sales");
		m.put(100, depentity);
		DepartmentEntity depentityHR = new DepartmentEntity();
		depentityHR.setDeptId(200);
		depentityHR.setDeptName("HR");
		m.put(200, depentityHR);
		System.out.println("Inside getDeptname..."+m.get(deptid));
		return (DepartmentEntity) m.get(deptid);
	}
}
