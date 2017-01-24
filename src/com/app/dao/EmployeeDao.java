package com.app.dao;

import java.util.List;

import com.app.model.Employee;

public interface EmployeeDao {
	void saveEmployeeObject(Employee emp);
	List getAllEmployees();
}
