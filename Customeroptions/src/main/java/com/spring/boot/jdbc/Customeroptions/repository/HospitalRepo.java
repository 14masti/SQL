package com.spring.boot.jdbc.Customeroptions.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.boot.jdbc.Customeroptions.dao.HospitalDAO;
import com.spring.boot.jdbc.Customeroptions.model.NetworkHospital;

@Repository
public class HospitalRepo {
	@Autowired
	private HospitalDAO hospitaldao;
	
	
	public List<NetworkHospital> getAllHospitalsData(){
		List<NetworkHospital> l1= hospitaldao.getAllHospitalsList();
		return l1;
	}


}
