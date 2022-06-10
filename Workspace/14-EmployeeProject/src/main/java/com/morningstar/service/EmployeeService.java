package com.morningstar.service;

import java.util.List;

import com.morningstar.model.Employee;

public interface EmployeeService {

	public boolean addEmployee(Employee employee);
	public List<Employee> readAllEmployee();
	public Employee findById(int id);
	public Employee findByName(String name);
	public boolean deleteEmployee(int id);
	public boolean updateEmployee(Employee employee);
	
	
}
