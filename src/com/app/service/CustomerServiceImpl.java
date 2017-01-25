package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.CustomerDao;
import com.app.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService
{
	@Autowired
	private CustomerDao dao;
	@Override
	public void saveEmployeeObject(Customer emp) {
		dao.saveEmployeeObject(emp);
		
	}
	@Override
	public List getAllEmployees() {
		// TODO Auto-generated method stub
		return dao.getAllEmployees();
	}

}
