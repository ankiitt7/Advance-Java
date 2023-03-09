package com.qsp.hibernate_one_to_many_bi_eve.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.qsp.hibernate_one_to_many_bi_eve.dto.College;
import com.qsp.hibernate_one_to_many_bi_eve.dto.Student;
import com.qsp.hibernate_one_to_many_bi_eve.service.CollegeStudentService;

public class CollegeStudentController {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		CollegeStudentService service=new CollegeStudentService();
		
		while(true)
		{
			System.out.println("1.Insert/2.Update/3.Delete/4.Display/5.Exit");
			System.out.println("Chooseeeeee");
			College college=new College();
			switch(sc.nextInt())
			{
			case 1:
			{
				
				System.out.println("Enter the College Id");
				college.setCollegeId(sc.nextInt());
				System.out.println("Enter the College Name");
				college.setCollegeName(sc.next());
				System.out.println("Enter the College City");
				college.setCollegeCity(sc.next());
				
				System.out.println("Enter the no of students");
				int size=sc.nextInt();
				List <Student>students=new ArrayList<Student>();
				for(int i=0;i<size;i++)
				{
					Student student=new Student();
					System.out.println("Enter the Student Id");
					student.setStudentId(sc.nextInt());
					System.out.println("Enter the Student Name");
					student.setStudentName(sc.next());
					System.out.println("Enter the Student Branch");
					student.setStudentBranch(sc.next());
					student.setCollege(college);
					
					students.add(student);
				}
				college.setStudents(students);
				service.insertCollegeStudent(college, students);
			}break;
			case 2:
			{
				System.out.println("Enter the college id to update");
				int id=sc.nextInt();
				System.out.println("Enter the student name to update");
				String name=sc.next();
				service.updateCollegeStudent(id, name);
			}break;
			case 3:
			{
				System.out.println("Enter the id to delete");
				int collegeid=sc.nextInt();
				service.deleteCollegeStudent(collegeid);
			}break;
			case 4:
			{
				List<College> colleges=service.displayCollegeStudent();
				for(College college2:colleges)
				{
					System.out.println(college2);
			
				
				List<Student> students=college.getStudents();
				for(Student student2:students)
				{
					System.out.println(student2);
				}
				}
			}
			}
		}
		
		
	}
}
