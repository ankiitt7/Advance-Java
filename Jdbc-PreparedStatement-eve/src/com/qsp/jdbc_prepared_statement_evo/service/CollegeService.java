package com.qsp.jdbc_prepared_statement_evo.service;



import java.util.List;

import com.qsp.jdbc_prepared_statement_evo.dto.College;
import com.qsp.jdbc_prepared_statement_evo.dto.CollegeDao;


public class CollegeService {
	
	CollegeDao dao = new CollegeDao();

	public void insertCollege(College college)
	{
		dao.insertCollege(college);
	}
	public void updateCollege(int id, String name, String city, Double pincode)
	{
		dao.updateCollege(id, name, city, pincode);
	}
	public void deleteCollege(int id)
	{
		dao.deleteCollege(id);
	}
	
	public List<College> displayCollege(){
		return dao.displayCollege();
	}
	public void insertAddBatch(List<College> college)
	{
		dao.insertAddBatch(college);
	}
}
