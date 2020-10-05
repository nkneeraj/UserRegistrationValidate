package com.cg.userregistrationradle;

import com.cg.userregistrationradle.*;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import org.junit.Assert;

@RunWith(Parameterized.class)
public class EmailTest {
	private String mail;
	private boolean result;
	
	 public EmailTest(String mail, boolean result) {
		// TODO Auto-generated constructor stub
		 this.mail = mail;
		 this.result = result;
	}
	
	@Parameterized.Parameters
	public static Collection mails() {
		return Arrays.asList(new Object[][] {{"abc@yahoo.com", true},
			{"abc-100@yahoo.com",true},
			{"abc.100@yahoo.com",true},
			{"abc111@abc.com",true},
			{"abc-100@abc.net",true},
			{"abc.100@abc.com.au",true},
			{"abc@1.com",false},
			{"abc+100@gmail.com",true},
			{"abc-",false},
			{"abc@.com.my",false},
			{"abc123@gmail.a",false},
			{".abc123@.com",false},
			{"abc123@.com.com",false},
			{"abc@gmail.com.aa.au",false}});
	}
	
	@Test
	public void test_Valid_Or_Invalid_Emails() {
		UserRegistration obj = new UserRegistration();
		boolean result1 = obj.Email(this.mail);
		System.out.println(mail+ result);
		Assert.assertEquals(this.result, result1);
	}
	
	
}
