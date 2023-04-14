package com.bridgelabz.regularexpression;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegularExpression {
	public static void main(String[] args) {
		String regex = "^[A-Z][a-zA-Z]{2,}$";

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The First Name : ");
		String firstName = sc.nextLine();
		System.out.println("Enter The Last Name : ");
		String lastName = sc.nextLine();

		Pattern pattern = Pattern.compile(regex);

		Matcher matcher = pattern.matcher(firstName + lastName);
		boolean result = matcher.matches();

		if (result) {
			System.out.println("Valid first name and last name");
		} else {
			System.out.println("Pattern not matched");
		}

	}
}