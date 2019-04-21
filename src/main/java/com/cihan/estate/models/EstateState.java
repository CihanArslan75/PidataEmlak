package com.cihan.estate.models;

public enum EstateState {
	SATILIK,
	KIRALIK;
	
	 public String toString(){
	        switch(this) {
	            case SATILIK:
	                return "SATILIK";
	            case KIRALIK:
	                return "KİRALIK";
	          default: return " ";
	        }
		 }

}
