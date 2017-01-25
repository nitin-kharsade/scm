package com.app.dao;

import java.util.List;

import com.app.model.Customer;

public interface CustomerDao {
	void saveEmployeeObject(Customer emp);
	List getAllEmployees();
}
