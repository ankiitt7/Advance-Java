package com.ibm.jdbc_crud_operations_statements.controller;

import java.util.List;
import java.util.Scanner;

import com.ibm.jdbc_crud_operation_statements.service.TeacherService;
import com.ibm.jdbc_crud_operations_statements.dto.Teacher;

public class TeacherController {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	Teacher teacher = new Teacher();
	TeacherService teacherService = new TeacherService();
	while(true) {
		System.out.println("1.insert\n2.update");
		System.out.println("choose your choice");
		int ch = scanner.nextInt();
		
		switch(ch) {
		case 1: {
			teacher.setTeacherId(1001);
			teacher.setTeacherName("Masood");
			teacher.setTeacherSubject("Advance Java");
			teacherService.insertTeacher(teacher);
		}
		break;
		case 2: {
			System.out.println("enter the id");
			int id= scanner.nextInt();
			System.out.println("enter the name");
			String name=scanner.next();
			
			teacherService.updateTeacher(name,id);		
		}
		break;
		case 3: {
			List<Teacher> teachers=teacherService.displayTeacher();
			
			for(Teacher teacher2 : teachers) {
				System.out.println(teacher2.getTeacherId());
				System.out.println(teacher2.getTeacherName());
				System.out.println(teacher2.getTeacherSubject());
			}
			break;
		}
		}
	}
	
	
	
	
	
	
	
}
}
