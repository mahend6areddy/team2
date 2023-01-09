package com.ashwin.accessingdatamysql;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="stddetails")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="stdid")
	Integer stdid;
	
//	private int stdid;
	@Column(name="name")
	private String name;
	
	@Column(name="designation")
	private String designation;

	public Integer getEmpid() {
		return stdid;
	}

	public void setEmpid(Integer empid) {
		this.stdid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	

}