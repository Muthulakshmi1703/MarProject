package com.flipkart.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.utils.BaseClass;

public class PLPPageLocators extends BaseClass{
	
	public PLPPageLocators() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//*[text()='Sort By']")
	private WebElement sortBy;
	
	//*[@loading='eager' and contains(@alt, 'REDMI')]
	
//	@FindBys({
//		@FindBy(xpath="//*[@loading='eager']"),
//		@FindBy(xpath="//*[contains(@alt, 'REDMI')]")
//	})
//	private WebElement redmiMob;
	
	@FindAll({
		@FindBy(xpath="//*[@loading='eager']"),
		@FindBy(xpath="//*[contains(@alt, 'REDMI')]")
	})
	private WebElement redmiMob;

	
	public WebElement getRedmiMob() {
		return redmiMob;
	}
	
	public WebElement getSortBy() {
		return sortBy;
	}
}
