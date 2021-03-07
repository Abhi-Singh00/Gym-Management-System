package com.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "gym")
public class gym {
	 
	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "name")
	 private String name;
	
	@Column(name = "bloodgroup")
	 private String bloodgroup;
	
	@Column(name  = "duration")
	private String duration;
	
	 
	 @Column(name= "emailid")
	 private String emailid;
	 
	 @Column(name="phoneno")
	 private String phoneno;
	 
	 @Column(name="address")
	 private String address;
	 
	 @Column(name="state")
	 private String state;
	 
	 @Column(name="city")
	 private String city;
    
	 @Column(name= "taluka")
	 private String taluka;
	 
	 @Column(name="pincode")
	 private int pincode;
	 
	 @Column(name="gender")
	 private String gender;
	 
	 @Column(name="hobbies")
	 private String hobbies;
	 
	 @Column(name="course")
	 private String course;
	 
	 
	 public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBloodgroup() {
		return bloodgroup;
	}

	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getTaluka() {
		return taluka;
	}

	public void setTaluka(String taluka) {
		this.taluka = taluka;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHobbies() {
		return hobbies;
	}

	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}

	public String getcourse() {
		return course;
	}

	public void setcourse(String course) {
		this.course = course;
	}

	}