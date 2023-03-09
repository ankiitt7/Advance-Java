package com.qsp.hibernate_many_to_one_uni_eve_service;

import java.util.List;

import com.qsp.hibernate_many_to_one_uni_eve_dao.PatientDao;
import com.qsp.hibernate_many_to_one_uni_eve_dto.Hospital;
import com.qsp.hibernate_many_to_one_uni_eve_dto.Patient;

public class PatientService {
	PatientDao patientDao=new PatientDao();
	public void insertHospitalPatient(List<Patient> patients,Hospital hospital)
	{
		patientDao.insertHospitalPatient(patients, hospital);
	}
	public void updatePatientHospital(int patientId, String patientGender,int hospitalId,String hospitalName)
	{
		patientDao.updatePatientHospital(patientId, patientGender, hospitalId, hospitalName);
	}
	public void deletePatient(int patientId)
	{
		patientDao.deletePatient(patientId);
	}
	public List<Patient> displayPatientHospital()
	{
		return patientDao.displayPatientHospital();
	}
}
