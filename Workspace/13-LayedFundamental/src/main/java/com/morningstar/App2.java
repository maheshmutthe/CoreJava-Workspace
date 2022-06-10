package com.morningstar;

import java.util.List;

import com.morningstar.dao.StudentDao;
import com.morningstar.dao.StudentDaoImpl;
import com.morningstar.model.Student;
import com.morningstar.service.StudentServiceImpl;

public class App2 {

	public static void main(String[] args) {

		StudentServiceImpl service = new StudentServiceImpl();
		StudentDao dao = new StudentDaoImpl();
		service.setDao(dao);
		
		List<Student> result = service.findAllList();
		for (Student student : result) {
			System.out.println("Student Id :"+student.getStudentId());
			System.out.println("Student Name :"+student.getStudentName());
			System.out.println("Student Score :"+student.getStudentScore());
			System.out.println("----------------------------------------------");
		}
	}

}
