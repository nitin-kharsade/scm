package com.app.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.model.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao
{
	@Autowired
	private HibernateTemplate template;
	public void setTemplate(HibernateTemplate template)
	{
		this.template=template;
	}
	@Override
	public void saveEmployeeObject(Customer emp) {
		template.save(emp);
		
	}
	@Override
	public List getAllEmployees() {
		
		return template.loadAll(Customer.class);
	}
	
}
