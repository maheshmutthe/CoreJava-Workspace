package com.morningstar.dao;

import java.sql.SQLException;

import com.morningstar.model.Student;

public interface StudentDao {
	public int createStudent(Student student) throws SQLException;
	public Student readStudent(int studentId) throws SQLException;
	
	
	
}
