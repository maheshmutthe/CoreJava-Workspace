package com.morningstar.service;

import java.sql.SQLException;
import java.util.List;

import com.morningstar.dao.EmployeeDao;
import com.morningstar.dao.EmployeeDaoImpl;
import com.morningstar.model.Employee;


public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao dao=null;
	
	public EmployeeDao getDao() {
		return dao;
	}

	public void setDao(EmployeeDao dao) {
		this.dao = dao;
	}

	@Override
	public boolean addEmployee(Employee employee) {
		try {
			int result=dao.AddEmployee(employee);
			if(result>=1)
			{
			
				EmployeeDaoImpl.getConnection().commit();
				return true;
			}
	
		} catch (SQLException e) {
			try {
				EmployeeDaoImpl.getConnection().rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<Employee> readAllEmployee() {
		List<Employee> list=null;
		try {
			list=dao.ReadAllEmployee();
		} catch (SQLException e) {
			
		}
		return list;
	}

	@Override
	public Employee findById(int id) {
		Employee employee=null;
		try {
			employee=dao.FindById(id);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return employee;
	}

	@Override
	public Employee findByName(String name) {
		Employee employee=null;
		try {
			employee=dao.FindByName(name);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return employee;
	}

	@Override
	public boolean deleteEmployee(int id) {
		
		try {
			int result=dao.DeleteEmployee(id);
			if(result>=1)
			{
				
				return true;
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		
		try {
			int result=dao.UpdateEmployee(employee);
			if(result>=1)
			{
				EmployeeDaoImpl.getConnection().commit();
				return true;
				
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return false;
	}

}
