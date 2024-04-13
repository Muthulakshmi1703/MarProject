package sample.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void verifyUserLoginWithValidCredentials() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("muthulakshmiaiite@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Test@12");
		driver.findElement(By.name("login")).click();
		
	    try {
	    	WebElement searchFb = driver.findElement(By.xpath("//*[@placeholder='Search Facebook']"));
	    	//above line will throw NoSuchElementException
	    	if(searchFb.isDisplayed()) {
	    		System.out.println("User logged in succefully");
	    	}
	    }catch(NoSuchElementException e) {
			System.out.println("User not logged in");
	    }
	}
	
	public static void enabledSample() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/buttons");
		WebElement enabledBtn = driver.findElement(By.xpath("//*[text()='How tall & fat I am?']"));
		boolean a1 = enabledBtn.isEnabled();
		System.out.println("Enabled button : "+a1);
		
		WebElement disabledBtn = driver.findElement(By.id("isDisabled"));
		boolean a2 = disabledBtn.isEnabled();
		System.out.println("Disabled button : "+a2);
	}
	public static void main(String[] args) {
		//verifyUserLoginWithValidCredentials();
		enabledSample();
	}
}

