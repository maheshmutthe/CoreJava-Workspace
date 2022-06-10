package com.morningstar.dao;

import java.sql.SQLException;
import java.util.List;

import com.morningstar.model.Student;

public interface StudentDao {
	public int createStudent(Student student) throws SQLException;
	public Student readStudent(int studentId) throws SQLException;
	public List<Student> readAllStudents() throws SQLException;
	
	
	
}
