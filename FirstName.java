package com.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstName {
	public void firstName(){
		Pattern p = Pattern.compile("[A-Z]{1}[a-z]+\\s{1}[A-Z]{1}[a-z]+");
		Matcher m = p.matcher("Pallavi Parteti");
		boolean b = m.matches();
		System.out.println(b);
	}
	public static void main(String[] args) {
		FirstName firstObj = new FirstName();
		firstObj.firstName();
	}
}
