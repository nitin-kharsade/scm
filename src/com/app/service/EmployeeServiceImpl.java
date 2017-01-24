package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.EmployeeDao;
import com.app.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService
{
	@Autowired
	private EmployeeDao dao;
	@Override
	public void saveEmployeeObject(Employee emp) {
		dao.saveEmployeeObject(emp);
		
	}
	@Override
	public List getAllEmployees() {
		// TODO Auto-generated method stub
		return dao.getAllEmployees();
	}

}
