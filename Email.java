package com.regularexpression;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {
	public void email (){
		Pattern p = Pattern.compile("\\b[A-Z0-9._%-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}\\b");
		Matcher m = p.matcher("abc2023@gmail.com");
		boolean b = m.matches();
		System.out.println(b);
	}
	public static void main(String[] args) {
		Email firstObj = new Email();
		firstObj.email ();
	}
}
