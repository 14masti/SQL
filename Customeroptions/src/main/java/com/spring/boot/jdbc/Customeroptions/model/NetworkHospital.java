package com.spring.boot.jdbc.Customeroptions.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "NetworkHospitals")
public class NetworkHospital {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hosp_id")
    private Long id;

    @Column(name = "hosp_title")
    private String title;

    @Column(name = "hosp_location")
    private String location;

    @Column(name = "hosp_address")
    private String address;

    @Column(name = "hosp_contactmobile")
    private Long contactMobile;

    @Column(name = "hosp_contactphone")
    private Long contactPhone;

    @Column(name = "hosp_pincode")
    private Integer pincode;

    @Column(name = "hosp_luudate")
    private Date luuDate;

    @Column(name = "hosp_luuser")
    private Integer luuUser;

    @Column(name = "hosp_city")
    private String city;

    @Column(name = "hosp_grade")
    private String grade;

    @Column(name = "hosp_facility")
    private String facility;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getContactMobile() {
		return contactMobile;
	}

	public void setContactMobile(Long contactMobile) {
		this.contactMobile = contactMobile;
	}

	public Long getContactPhone() {
		return contactPhone;
	}

	public void setContactPhone(Long contactPhone) {
		this.contactPhone = contactPhone;
	}

	public Integer getPincode() {
		return pincode;
	}

	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}

	public Date getLuuDate() {
		return luuDate;
	}

	public void setLuuDate(Date luuDate) {
		this.luuDate = luuDate;
	}

	public Integer getLuuUser() {
		return luuUser;
	}

	public void setLuuUser(Integer luuUser) {
		this.luuUser = luuUser;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getFacility() {
		return facility;
	}

	public void setFacility(String facility) {
		this.facility = facility;
	}
    
    

}
