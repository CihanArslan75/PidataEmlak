package com.cihan.estate.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "estate")
public class Estate extends BaseEntity{
	
	private int id ;
	private RealEstateAgent realEstateAgent ;
	private Customer customer ;
	private String estateType;  // (KONUT 0 , ISYERI 1)  
	private String estateState; //(SATILIK 0 , KIRALIK 1) 
	private int size ;    //(metrekate)
	private String roomNumber  ;
	private String floor ;
	private String  warmingType ; //(MERKEZI 0,DOGALGAZ 1, KAT KALORIFERI 2) 
	private String deedType ; //(KAT MULKIYETI 0,KAT IRTIFAKI 1,TAPUSUZ 2)   
	private State elevator  ; // (VAR , YOK) 
	private String address  ;
	private String  coordinateX  ;
	private String coordinateY;
	private String  buildingType;  // (BETONARME 0,KARKAS 1, AHŞAP 2 ),  
	private String  buildingAge ;
	private Long    prize;
	
	@Id
	@SequenceGenerator(name = "seq_estate", allocationSize = 1, sequenceName = "seq_estate")
	@GeneratedValue(generator = "seq_estate", strategy = GenerationType.SEQUENCE)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@ManyToOne 
	@JoinColumn(name = "agentid", referencedColumnName = "id")
	public RealEstateAgent getRealEstateAgent() {
		return realEstateAgent;
	}
	public void setRealEstateAgent(RealEstateAgent realEstateAgent) {
		this.realEstateAgent = realEstateAgent;
	}
	
	
	@ManyToOne   //emlak çok müşteri tek . Bir müşterinin birden fazla evi olabilir.bir ev bir müşteriye ait olabilir
	@JoinColumn(name = "customerid", referencedColumnName = "id")
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@Column(length = 50,name = "estatetype")
	public String getEstateType() {
		return estateType;
	}
	public void setEstateType(String estateType) {
		this.estateType = estateType;
	}
	@Column(length = 50,name = "estatestate")
	public String getEstateState() {
		return estateState;
	}
	public void setEstateState(String estateState) {
		this.estateState = estateState;
	}
	@Column(name = "size")
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	@Column(length = 50, name = "roomNumber")
	public String getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}
	@Column(length = 20, name = "floor")
	public String getFloor() {
		return floor;
	}
	public void setFloor(String floor) {
		this.floor = floor;
	}
	@Column(length = 50,name = "warmingtype")
	public String getWarmingType() {
		return warmingType;
	}
	public void setWarmingType(String warmingType) {
		this.warmingType = warmingType;
	}
	@Column(length = 50,name = "deedtype")
	public String getDeedType() {
		return deedType;
	}
	public void setDeedType(String deedType) {
		this.deedType = deedType;
	}
	@Column(name = "elevator")
	public State getElevator() {
		return elevator;
	}
	public void setElevator(State elevator) {
		this.elevator = elevator;
	}
	@Column(length = 1000, name = "address")
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Column(length = 20, name = "coordinatex")
	public String getCoordinateX() {
		return coordinateX;
	}
	public void setCoordinateX(String coordinateX) {
		this.coordinateX = coordinateX;
	}
	@Column(length = 20, name = "coordinatey")
	public String getCoordinateY() {
		return coordinateY;
	}
	public void setCoordinateY(String coordinateY) {
		this.coordinateY = coordinateY;
	}
	@Column(length = 50,name = "buildingtype")
	public String getBuildingType() {
		return buildingType;
	}
	public void setBuildingType(String buildingType) {
		this.buildingType = buildingType;
	}
	@Column(length = 50, name = "buildingage")
	public String getBuildingAge() {
		return buildingAge;
	}
	public void setBuildingAge(String buildingAge) {
		this.buildingAge = buildingAge;
	}
	
	@Column( name = "prize")
	public Long getPrize() {
		return prize;
	}
	public void setPrize(Long prize) {
		this.prize = prize;
	}
	
}
