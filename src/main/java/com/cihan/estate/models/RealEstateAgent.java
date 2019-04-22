package com.cihan.estate.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.cihan.estate.dao.RealEstateAgentDAO;

@Entity
@Table(name = "realestateagent")
public class RealEstateAgent  extends BaseEntity {
	private int id;
	private String agentName  ;
	private String ownerNameSurname ;
	private String address;
	private String mobilePhone ;
	private String fax  ;
	
	@Id
	@SequenceGenerator(name = "seq_agent", allocationSize = 1, sequenceName = "seq_agent")
	@GeneratedValue(generator = "seq_agent", strategy = GenerationType.SEQUENCE)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(length = 250, name = "agentname")
	public String getAgentName() {
		return agentName;
	}
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}
	
	@Column(length = 200, name = "ownernamesurname")
	public String getOwnerNameSurname() {
		return ownerNameSurname;
	}
	public void setOwnerNameSurname(String ownerNameSurname) {
		this.ownerNameSurname = ownerNameSurname;
	}
	
	@Column(length = 500, name = "address")
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Column(length = 20, name = "mobilePhone")
	public String getMobilePhone() {
		return mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	
	@Column(length = 20, name = "fax")
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	
}
