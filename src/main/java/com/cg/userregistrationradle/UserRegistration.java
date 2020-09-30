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
		Email();
		ContactNumber();
		Password();
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
	
	public static void Email()
	{
		System.out.println("Enter valid email having Email has 3 mandatory parts (abc, bl & co) and 2 optional (xyz & in) with precise @ and . positions");
		String email = sc.nextLine();
		Pattern pattern = Pattern.compile("^abc{1}([-+-.]{0,1}[a-zA-z0-9]{3})?@[a-z]{2,}\\.[a-z]{2,4}(\\.[a-z]{2})?$");
		PatternMatcher(pattern,email);
	}
	
	public static void ContactNumber()
	{
		System.out.println("Enter country code followed by space and 10 digit number");
		String contactNumber = sc.nextLine();
		Pattern pattern = Pattern.compile("^[0-9]{2}\s[1-9]{1}[0-9]{9}$");
		PatternMatcher(pattern,contactNumber);
	}
	
	public static void Password()
	{
		System.out.println("Enter Password with min length 8 and one uppercase");
		String Password = sc.nextLine();
		Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[_!@#$%]).{8,16}$");
		PatternMatcher(pattern,Password);
	}
}
