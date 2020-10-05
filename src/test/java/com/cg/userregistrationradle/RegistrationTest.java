package com.cg.userregistrationradle;

import org.junit.Test;
import org.junit.Assert;

public class RegistrationTest {
    
	 @Test
	    public void givenFirstName_Proper_ReturnTrue() {
	        UserRegistration user = new UserRegistration();
	        boolean result = user.FirstName("Neeraj");
	        Assert.assertTrue(true);
	    }
	 @Test
	    public void givenFirstName_Improper_ReturnFalse() {
		 	UserRegistration user = new UserRegistration();
	        boolean result = user.FirstName("sadasd");
	        Assert.assertFalse(false);
	    }
	 @Test
	    public void givenLastName_Proper_ReturnTrue() {
		 	UserRegistration user = new UserRegistration();
	        boolean result = user.LastName("Ads");
	        Assert.assertTrue(true);
	    }
	 @Test
	    public void givenLastName_Improper_ReturnFalse() {
		 UserRegistration user = new UserRegistration();
	        boolean result = user.LastName("asd");
	        Assert.assertFalse(false);
	    }
	 @Test
	    public void givenEmail_Proper_ReturnTruee() {
		 UserRegistration user = new UserRegistration();
	        boolean result = user.Email("abc.123@gmail.com");
	        Assert.assertTrue(true);
	    }
	 @Test
	    public void givenPassword_Proper_ReturnTrue() {
		 UserRegistration user = new UserRegistration();
	        boolean result = user.Password("Neeraj321@");
	        Assert.assertTrue(true);
	    }
	 @Test
	    public void givenPassword_Improper_ReturnFalse() {
		 UserRegistration user = new UserRegistration();
	        boolean result = user.Password("xaa");
	        Assert.assertFalse(false);
	    }
	 @Test
	    public void givenMobileNo_Proper_ReturnTrue() {
		 UserRegistration user = new UserRegistration();
	        boolean result = user.ContactNumber("91 819885277");
	        Assert.assertTrue(true);
	    }
	 @Test
	    public void givenMobileNo_Improper_ReturnFalse() {
		 UserRegistration user = new UserRegistration();
	        boolean result = user.ContactNumber("6464");
	        Assert.assertFalse(false);
	    }
}
