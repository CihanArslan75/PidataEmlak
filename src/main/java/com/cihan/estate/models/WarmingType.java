package com.cihan.estate.models;

public enum WarmingType {
	MERKEZI ,
	DOGALGAZ, 
	KATKALORIFERI;
	
	 public String toString(){
	        switch(this) {
	            case MERKEZI:
	                return "MERKEZİ";
	            case DOGALGAZ:
	                return "DOGALGAZ";
	            case KATKALORIFERI:
	                return "KAT KALORİFERİ";
	            default: return " ";
	        }
		 }
}
