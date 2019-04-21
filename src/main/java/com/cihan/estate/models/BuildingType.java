package com.cihan.estate.models;

public enum BuildingType {
	BETONARME ,
	KARKAS , 
	AHSAP;
	
	 public String toString(){
        switch(this) {
            case BETONARME:
                return "BETONARME";
            case KARKAS:
                return "KARKAS";
            case AHSAP:
                return "AHŞAP";
            default: return " ";
        }
	 }

}
