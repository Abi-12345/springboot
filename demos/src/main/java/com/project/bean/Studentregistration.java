package com.project.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Studentregistration {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int registerno;
	private String name;
	private String dept;
	
	@OneToOne
	private busroutedetails busroute;
	
	public busroutedetails getBusroute() {
		return busroute;
	}
	public void setBusroute(busroutedetails busroute) {
		this.busroute = busroute;
	}
	public int getRegisterno() {
		return registerno;
	}
	public void setRegisterno(int registerno) {
		this.registerno = registerno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	

}
