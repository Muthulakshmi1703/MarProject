package com.flipkart.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.utils.BaseClass;

public class HomePageLocators extends BaseClass{

	//private WebElement closeBtn = driver.findElement(By.xpath("//*[text()='✕']"));
	
	public HomePageLocators() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[text()='✕']")
	private WebElement closeBtn;
	
	@FindBy(name="q")
	private WebElement searchInputField;
	
	
	public WebElement getCloseBtn() {
		return closeBtn;
	}
	
	public WebElement getSearchInputField() {
		return searchInputField;
	}
}
