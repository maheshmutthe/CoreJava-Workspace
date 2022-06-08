package com.morningstar.service;

import com.morningstar.dao.StudentDao;
import com.morningstar.model.Student;

public interface StudentService {
	public boolean	addStudent(Student student);
	public Student findByStudentId(int StudentId);
	public void setDao(StudentDao studentDao);
	

}
