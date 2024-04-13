package com.flipkart.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;

import com.base.utils.BaseClass;
import com.flipkart.locators.HomePageLocators;

public class HomePage extends BaseClass{
	
	public static void testSetup() {
	try {
		browserOpen("chrome");
		loadUrl("https://www.flipkart.com/");
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
	}

	public static void clickOnCloseButton() {
		try {
//			click(new HomePageLocators().getCloseBtn());
			
			HomePageLocators hp = new HomePageLocators();
			click(hp.getCloseBtn());
		}catch(NoSuchElementException e) {
			System.out.println("Close button isn't visible");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void searchData(String data) {
		try {
			//dataSend(new HomePageLocators().getSearchInputField(), data);
			new HomePageLocators().getSearchInputField().sendKeys(data, Keys.ENTER);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
