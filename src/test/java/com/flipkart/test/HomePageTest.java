package com.flipkart.test;

import org.junit.Test;

import com.base.utils.BaseClass;
import com.flipkart.pages.HomePage;
import com.flipkart.pages.PLPPage;

public class HomePageTest extends BaseClass{

	@Test 
	public void validateUserAbleToAddProductIntoTheCart() throws Exception {
		
		String data = getTestData("SearchData");
		
		HomePage.testSetup();
		HomePage.clickOnCloseButton();
		HomePage.searchData(data);
		PLPPage.verifyUserRedirectsToPLPPage();
		PLPPage.clickOnFirstProduct();
	}
}
