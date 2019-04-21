package com.cihan.estate.models;

public enum EstateType {
	KONUT ,
	ISYERI  ;
	
	 public String toString(){
	        switch(this) {
	            case KONUT:
	                return "KONUT";
	            case ISYERI:
	                return "İŞYERİ";
	          default: return " ";
	        }
		 }
}
