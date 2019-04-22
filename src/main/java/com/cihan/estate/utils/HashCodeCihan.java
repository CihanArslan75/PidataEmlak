package com.cihan.estate.utils;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;
@Repository
public class HashCodeCihan {
	private  String result="";
	private  String word1 = "";
	
	public String encodeWord(String word) {
		result="";
		DecimalFormat myFormatter = new DecimalFormat("00000");
		List<Character> wordList = word.chars().mapToObj(e->(char)e).collect(Collectors.toList()); 
		wordList.stream().map(d->(int)d*55 ).forEach(d-> {String aa= String.valueOf(myFormatter.format(d));result+=aa;});
		return  result;
	 }
	
	public String decodeWord(String a) {
		word1="";
		String[] aa= a.split("(?<=\\G.....)");
		List<String> aaa=Arrays.asList(aa);
		aaa.stream().mapToInt(d->Integer.parseInt(d)).forEach(d-> { d=d/55 ;word1=word1+(char)d ;});
		return word1;	
	}	

}
