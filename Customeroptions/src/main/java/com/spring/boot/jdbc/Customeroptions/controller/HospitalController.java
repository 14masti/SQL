package com.spring.boot.jdbc.Customeroptions.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.jdbc.Customeroptions.model.NetworkHospital;
import com.spring.boot.jdbc.Customeroptions.repository.HospitalRepo;

@RestController
public class HospitalController {
	

	@Autowired
	HospitalRepo hospitalres;

	@GetMapping(value = "/hospitals")
	public List<NetworkHospital> getAll() {

		List<NetworkHospital> hosp = hospitalres.getAllHospitalsData();
		return hosp;
	}
}