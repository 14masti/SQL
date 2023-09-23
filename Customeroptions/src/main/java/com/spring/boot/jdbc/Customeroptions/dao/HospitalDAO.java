package com.spring.boot.jdbc.Customeroptions.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import com.spring.boot.jdbc.Customeroptions.contracts.HospitalMapper;
import com.spring.boot.jdbc.Customeroptions.model.NetworkHospital;

public class HospitalDAO implements HospitalIntDAO {
	JdbcTemplate jdbcTemplate;

	@Autowired
	public HospitalDAO(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	private final String SQL_DISPLAY_NetworkHospitals = "SELECT * FROM NetworkHospitals";

	@Override
	public List<NetworkHospital> getAllHospitalsList() {
		
		return jdbcTemplate.query(SQL_DISPLAY_NetworkHospitals, new HospitalMapper());
	}
	
}
