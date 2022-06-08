package com.morningstar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcTest2 {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			String sql = "Select Employee_Id, Last_Name, Salary from Employees";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				int EmployeeId = rs.getInt("Employee_Id");
				String employeename = rs.getString("Last_Name");
				double salary = rs.getDouble("Salary");
				System.out.println("Employee_Id :"+EmployeeId);
				System.out.println("Employee_Name :"+employeename);
				System.out.println("Salary :"+ salary);
			}
			
		} catch (ClassNotFoundException e | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
