package com.junit.sample;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import com.base.utils.BaseClass;

public class FacebookLogin extends BaseClass{
	
	@BeforeClass
	public static void openBrowser() {
		
	}
	
	@Before
	public void launchFacebookUrl() {
		browserOpen("chrome");
		loadUrl("https://www.facebook.com/");
	}
	
	@Test
	public void fbLoginWithValidUserAndValidPwd() {
		driver.findElement(By.id("email")).sendKeys("muthulakshmiaiite@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Test@123");
		driver.findElement(By.name("login")).click();
	}
	
	@Test
	public void fbLoginWithInvalidUserAndInvalidPwd() {
		driver.findElement(By.id("email")).sendKeys("muthulakshmi@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Test@12");
		driver.findElement(By.name("login")).click();
	}
	
	@After
	public void validateUserLoggedInOrNot() {
		try {
	    	WebElement searchFb = driver.findElement(By.xpath("//*[@placeholder='Search Facebook']"));
	    	//above line will throw NoSuchElementException
	    	if(searchFb.isDisplayed()) {
	    		Assert.assertTrue("User logged in succefully", searchFb.isDisplayed());
	    	}
	    }catch(NoSuchElementException e) {
			Assert.fail("User not logged in");
	    }
	}

	@AfterClass
	public static void closeBroser() {
		pageClose();
	}
}
