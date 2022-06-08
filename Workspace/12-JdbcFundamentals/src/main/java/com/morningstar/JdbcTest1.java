package com.morningstar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcTest1 {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			System.out.println("Connected to db");
		}
		catch (ClassNotFoundException e) {
			System.out.println("Driver class not found");
		}
		catch (SQLException e) {
			System.out.println("Unable to connect to databse");
		}

	}

}
