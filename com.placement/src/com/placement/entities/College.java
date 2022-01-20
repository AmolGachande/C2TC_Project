package com.placement.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="college")
public class College {
	@Id
	private int id;
	private String collegeAdmin;
	private String collegeName;
	private String location;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getCollegeAdmin() {
		return collegeAdmin;
	}
	public void setCollegeAdmin(String collegeAdmin) {
		this.collegeAdmin = collegeAdmin;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "College [id=" + id + ", collegeAdmin=" + collegeAdmin + ", collegeName=" + collegeName + ", location="
				+ location + "]";
	}
	
	
	
}
