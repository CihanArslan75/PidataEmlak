package com.cihan.estate.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "districts")

public class Districts {
	private int id;
	private int districtCode; 
	private Provinces province;
	private String districtName;
	
	@Id
	@SequenceGenerator(name = "seq_districts", allocationSize = 1, sequenceName = "seq_districts")
	@GeneratedValue(generator = "seq_districts", strategy = GenerationType.SEQUENCE)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name = "districtcode")
	public int getDistrictCode() {
		return districtCode;
	}
	public void setDistrictCode(int districtCode) {
		this.districtCode = districtCode;
	}
	
	@ManyToOne
	@JoinColumn(name = "provinceid", referencedColumnName = "id")
	public Provinces getProvince() {
		return province;
	}
	public void setProvince(Provinces province) {
		this.province = province;
	}
	@Column(length = 100, name = "districtname")
	public String getDistrictName() {
		return districtName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	

}
