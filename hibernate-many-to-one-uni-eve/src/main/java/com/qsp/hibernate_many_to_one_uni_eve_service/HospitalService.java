package com.qsp.hibernate_many_to_one_uni_eve_service;

import java.util.List;

import com.qsp.hibernate_many_to_one_uni_eve_dao.HospitalDao;
import com.qsp.hibernate_many_to_one_uni_eve_dto.Hospital;

public class HospitalService {
HospitalDao dao=new HospitalDao();
	
	public void insertHospital(Hospital hospital)
	{
		dao.insertHospital(hospital);
	}
	public void updateHospital(int hospitalId, Hospital hospital)
	{
		dao.updateHospital(hospitalId, hospital);
	}
	public void deleteHospital(int hospitalId)
	{
		dao.deleteHospital(hospitalId);
	}
	public List<Hospital> displayHospital()
	{
		return dao.displayHospital();
	}
}
