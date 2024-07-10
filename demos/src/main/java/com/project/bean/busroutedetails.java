package com.project.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity 
public class busroutedetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int busno;
	private String busroute;
	public int getBusno() {
		return busno;
	}
	public void setBusno(int busno) {
		this.busno = busno;
	}
	public String getBusroute() {
		return busroute;
	}
	public void setBusroute(String busroute) {
		this.busroute = busroute;
	}
	
	
	

}
