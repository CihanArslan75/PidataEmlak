package com.cihan.estate.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "province", uniqueConstraints = { @UniqueConstraint(columnNames = { "provinceName" }) })
public class Provinces {

	private int id ;
	private int provinceCode ;
	private String provinceName ;
	
	@Id
	@SequenceGenerator(name = "seq_province", allocationSize = 1, sequenceName = "seq_province")
	@GeneratedValue(generator = "seq_province", strategy = GenerationType.SEQUENCE)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column( name = "provincecode")
	public int getProvinceCode() {
		return provinceCode;
	}
	public void setProvinceCode(int provinceCode) {
		this.provinceCode = provinceCode;
	}
	@Column(length = 100, name = "provincename")
	public String getProvinceName() {
		return provinceName;
	}
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}
	
	

	
}
