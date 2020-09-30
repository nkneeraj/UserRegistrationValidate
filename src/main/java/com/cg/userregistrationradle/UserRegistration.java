package com.cg.userregistrationradle;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome to the User Registration portal");
		FirstName();
		LastName();
	}

	public static void PatternMatcher(Pattern pattern, String string) {
		Matcher matcher = pattern.matcher(string);
		if (matcher.find())
			System.out.println("Valid Entry");
		else
			System.out.println("Invalid entry");
	}

	public static void FirstName() {
		System.out.println("Enter a user name with first capital character and min 3 length:");
		String firstName = sc.nextLine();
		Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
		PatternMatcher(pattern,firstName);
	}
	
	public static void LastName()
	{
		System.out.println("Enter last name with first capital character and min 3 length:");
		String lastName = sc.nextLine();
		Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
		PatternMatcher(pattern,lastName);
	}
}
