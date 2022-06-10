package com.morningstar.service;

import java.util.List;

import com.morningstar.dao.StudentDao;
import com.morningstar.model.Student;

public interface StudentService {
	public boolean	addStudent(Student student);
	public Student findByStudentId(int StudentId);
	public void setDao(StudentDao studentDao);
	
	public List<Student> findAllList();
	

}
