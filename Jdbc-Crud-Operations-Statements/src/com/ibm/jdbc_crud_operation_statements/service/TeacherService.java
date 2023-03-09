package com.ibm.jdbc_crud_operation_statements.service;

import java.util.List;

import com.ibm.jdbc_crud_operations_statements.dao.TeacherDao;
import com.ibm.jdbc_crud_operations_statements.dto.Teacher;

public class TeacherService {
		TeacherDao teacherDao = new TeacherDao();
		
		//insertMethod
		public void insertTeacher(Teacher teacher) {
			if(teacher.getTeacherName().length()<9)
			{
				teacherDao.insertTeacher(teacher);
			}
			else
			{
				System.out.println("character is more than 8");
			}
		}
		
		//update method
		public void updateTeacher(String name,int id)
		{
			int id1=teacherDao.getById(id);
			if(id==id1)
			{
				teacherDao.updateTeacher(name,id);
			}
			else
			{
				System.out.println("Hey this "+id+"is not present"+id);
			}
		}
		
		public List<Teacher> displayTeacher() {
			return teacherDao.displayTeacher();
		}
		
}



