package com.app.service;

import java.util.List;

import com.app.model.Employee;

public interface EmployeeService 
{
		void saveEmployeeObject(Employee emp);
		List getAllEmployees();
}
