package com.app.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao
{
	@Autowired
	private HibernateTemplate template;
	public void setTemplate(HibernateTemplate template)
	{
		this.template=template;
	}
	@Override
	public void saveEmployeeObject(Employee emp) {
		template.save(emp);
		
	}
	@Override
	public List getAllEmployees() {
		
		return template.loadAll(Employee.class);
	}
	
}
