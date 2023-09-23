package com.spring.boot.jdbc.Customeroptions.contracts;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.boot.jdbc.Customeroptions.model.NetworkHospital;

public class HospitalMapper implements RowMapper<NetworkHospital> {

    @Override
    public NetworkHospital mapRow(ResultSet resultSet, int i) throws SQLException {
        NetworkHospital hospital = new NetworkHospital();
        hospital.setId(resultSet.getLong("hosp_id"));
        hospital.setTitle(resultSet.getString("hosp_title"));
        hospital.setLocation(resultSet.getString("hosp_location"));
        hospital.setAddress(resultSet.getString("hosp_address"));
        hospital.setContactMobile(resultSet.getLong("hosp_contactmobile"));
        hospital.setContactPhone(resultSet.getLong("hosp_contactphone"));
        hospital.setPincode(resultSet.getInt("hosp_pincode"));
        hospital.setLuuDate(resultSet.getDate("hosp_luudate"));
        hospital.setLuuUser(resultSet.getInt("hosp_luuser"));
        hospital.setCity(resultSet.getString("hosp_city"));
        hospital.setGrade(resultSet.getString("hosp_grade"));
        hospital.setFacility(resultSet.getString("hosp_facility"));
        return hospital;
    }
}





