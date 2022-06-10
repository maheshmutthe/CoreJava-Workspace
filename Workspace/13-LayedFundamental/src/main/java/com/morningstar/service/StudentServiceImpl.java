package com.morningstar.service;

import java.sql.SQLException;
import java.util.List;

import com.morningstar.dao.StudentDao;
import com.morningstar.dao.StudentDaoImpl;
import com.morningstar.model.Student;

public class StudentServiceImpl implements StudentService {

	private StudentDao dao= new StudentDaoImpl();
		
	public StudentDao getDao() {
		return dao;
	}

	public void setDao(StudentDao dao) {
		this.dao = dao;
	}


	@Override
	public boolean addStudent(Student student) {
		try {
			int result = dao.createStudent(student);
			if(result >= 1) {
				StudentDaoImpl.getConnection().commit();
				return true;
			}
		} catch (SQLException e) {
			
			try {
				StudentDaoImpl.getConnection().rollback();
			} catch (SQLException e2) {
				System.out.println("Rollback doesnt happend");
				e2.printStackTrace();
			}
			
		//	System.out.println("Connection isn't done");
			e.printStackTrace();
			
		}
		return false;	
	}

	@Override
	public Student findByStudentId(int StudentId) {
		Student student = null;
		try {
			student = dao.readStudent(StudentId);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return student;
		}

	@Override
	public List<Student> findAllList() {
		List<Student> list = null;
		try {
			list = dao.readAllStudents();
		}	catch (SQLException e) {
			e.printStackTrace();
		}
		
	
		return list;
	}

}
