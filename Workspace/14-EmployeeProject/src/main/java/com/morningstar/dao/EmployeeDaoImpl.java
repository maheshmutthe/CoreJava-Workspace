package com.morningstar.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.morningstar.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	private static Connection connection = null;

	static {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			connection.setAutoCommit(false);
		} catch (SQLException | ClassNotFoundException e) {
			System.out.println("There is some problem");
			e.printStackTrace(); // log the stack trace
		}
	}

	public static Connection getConnection() {
		return connection;
	}

	public static void setConnection(Connection connection) {
		EmployeeDaoImpl.connection = connection;
	}

	@Override
	public int AddEmployee(Employee employee) throws SQLException {
		String sql = "Insert Into Employee( EMPLOYEE_ID, EMPLOYEE_NAME,EMPLOYEE_SALARY,DEPARTMENT_ID) Values(?,?,?,?)";
		PreparedStatement pstmt = connection.prepareStatement(sql);
		pstmt.setInt(1, employee.getEmployeeId());
		pstmt.setString(2, employee.getEmployeeName());
		pstmt.setDouble(3, employee.getEmployeeSalary());
		pstmt.setInt(4, employee.getDepartmentId());
		int result = pstmt.executeUpdate();
		return result;
	}

	@Override
	public List<Employee> ReadAllEmployee() throws SQLException {
		String sql="Select * from Employee";
		Statement stmt=connection.createStatement();
		ResultSet rs=stmt.executeQuery(sql);
		
		List<Employee> list=new ArrayList<>();
		while (rs.next())
		{
			int empId=rs.getInt("EMPLOYEE_ID");
			String empName=rs.getString("EMPLOYEE_NAME");
			double empSal=rs.getDouble("EMPLOYEE_SALARY");
			int empDept=rs.getInt("DEPARTMENT_ID");
			
		Employee employee=new Employee(empId,empName,empSal,empDept);
		list.add(employee);
		}
		return list;
	}

	@Override
	public Employee FindById(int id) throws SQLException {
		String sql="Select * from Employee Where Employee_Id="+id;
		Statement stmt=connection.createStatement();
		ResultSet rs=stmt.executeQuery(sql);
		
		Employee employee=null;
		while (rs.next())
		{
			int empId=rs.getInt("EMPLOYEE_ID");
			String empName=rs.getString("EMPLOYEE_NAME");
			double empSal=rs.getDouble("EMPLOYEE_SALARY");
			int empDept=rs.getInt("DEPARTMENT_ID");
			
		 employee=new Employee(empId,empName,empSal,empDept);
		
		}
		return employee;
	}

	@Override
	public Employee FindByName(String name) throws SQLException {
		String sql="Select * from Employee Where EMPLOYEE_NAME="+name;
		Statement stmt=connection.createStatement();
		ResultSet rs=stmt.executeQuery(sql);
		
		Employee employee=null;
		while (rs.next())
		{
			int empId=rs.getInt("EMPLOYEE_ID");
			String empName=rs.getString("EMPLOYEE_NAME");
			double empSal=rs.getDouble("EMPLOYEE_SALARY");
			int empDept=rs.getInt("DEPARTMENT_ID");
			 employee=new Employee(empId,empName,empSal,empDept);
		
		}
		return employee;
	}

	@Override
	public int DeleteEmployee(int id) throws SQLException {
		String sql="DELETE from Employee where Employee_Id="+id;
		PreparedStatement pstmt = connection.prepareStatement(sql);
		int result = pstmt.executeUpdate();
		return result;
	}

	@Override
	public int UpdateEmployee(Employee employee) throws SQLException {
		String sql="UPDATE EMPLOYEE SET EMPLOYEE_NAME=?,EMPLOYEE_SALARY=?,DEPARTMENT_ID=? Where EMPLOYEE_ID=?";
		PreparedStatement pstmt = connection.prepareStatement(sql);
		pstmt.setString(1, employee.getEmployeeName());
		pstmt.setDouble(2, employee.getEmployeeSalary());
		pstmt.setInt(3, employee.getDepartmentId());
		pstmt.setInt(4, employee.getEmployeeId());

		
		int result = pstmt.executeUpdate();
		return result;
	}

}
