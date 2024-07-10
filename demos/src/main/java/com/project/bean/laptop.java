package com.project.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class laptop {
	 @Id
	private int lid;
	private String Name;
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	

}
