package com.cihan.estate.models;

public enum StateEnum {
	YENIGIRIS,
	DEGISTIRILMIS,
	SILINMIS;
	
	 public String toString(){
        switch(this) {
            case YENIGIRIS:
                return "YENİ GİRİS";
            case DEGISTIRILMIS:
                return "DEĞİŞTİRİLMİŞ";
            case SILINMIS:
                return "SİLİNMİŞ";
            default: return " ";
        }
	 }

}