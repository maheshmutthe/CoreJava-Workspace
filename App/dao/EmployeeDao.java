package com.morningstar.dao;

import java.sql.SQLException;
import java.util.List;

import com.morningstar.model.Employee;

public interface EmployeeDao {

	public int AddEmployee(Employee employee) throws SQLException;
	public List<Employee> ReadAllEmployee() throws SQLException;
	public Employee FindById(int id) throws SQLException;
	public Employee FindByName(String name) throws SQLException;
	public int DeleteEmployee(int id) throws SQLException;
	public int UpdateEmployee(Employee employee) throws SQLException;
	
}
