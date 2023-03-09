package com.qsp.hibernate_one_to_many_bi_eve.service;

import java.util.List;

import com.qsp.hibernate_one_to_many_bi_eve.dao.CollegeStudentDao;
import com.qsp.hibernate_one_to_many_bi_eve.dto.College;
import com.qsp.hibernate_one_to_many_bi_eve.dto.Student;

public class CollegeStudentService {

	CollegeStudentDao dao=new CollegeStudentDao();
	
	public void insertCollegeStudent(College college, List<Student>students)
	{
		dao.insertCollegeStudent(college, students);
	}
	
	public void updateCollegeStudent(int collegeId,String StudentName)
	{
		dao.updateCollegeStudent(collegeId, StudentName);
	}
	
	public void deleteCollegeStudent(int collegeId)
	{
		dao.deleteCollegeStudent(collegeId);
	}
	
	public List<College> displayCollegeStudent()
	{
		return dao.displayCollegeStudent();
	}
}
