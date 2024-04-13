package prop.read.write;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertyReadAndWrite {

	public static void readData() {
	try {
		FileReader read = new FileReader("./TestDataFiles/testdata.properties");
		
		Properties prop = new Properties();
		prop.load(read);
		String name = prop.getProperty("Name");
		String id = prop.getProperty("Id");
		System.out.println(id+" "+name);
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
	}
	
	public static void writeData() {
		try {
			FileWriter write = new FileWriter("./TestDataFiles/writedata.properties");
			
			Properties prop = new Properties();
			prop.setProperty("Std1", "Priyadharshini");
			prop.setProperty("Std2", "Khaviya");
			prop.store(write, "Last updated by Muthulakshmi");
			
			System.out.println("done");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static String readTestData(String key) throws IOException {
		FileReader read = new FileReader("./TestDataFiles/testdata.properties");

		Properties prop = new Properties();
		prop.load(read);
		String value = prop.getProperty(key);
		return value;
	}
	
public static void main(String[] args) throws IOException{
	//readData();
	//writeData();
	String name = readTestData("Name1");
	System.out.println(name);	
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.name("email")).sendKeys(name);
}
}
