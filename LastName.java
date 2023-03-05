package com.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LastName {
	public void Last(){
		Pattern p = Pattern.compile("[A-Z]{1}[a-z]+\\s{1}[A-Z]{1}[a-z]+");
		Matcher m = p.matcher("Pallavi parteti");
		boolean b = m.matches();
		System.out.println(b);
	}
	public static void main(String[] args) {
		LastName firstObj = new LastName();
		firstObj.Last();
	}
}
