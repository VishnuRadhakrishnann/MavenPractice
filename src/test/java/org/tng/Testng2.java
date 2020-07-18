package org.tng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testng2 {
	
	
	@Test(dataProvider="data")
	public void trail(String s,String t) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\chromedriver.exe");
		
	    WebDriver driver=new ChromeDriver();
			
		driver.get("https://www.facebook.com/");
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys(s);
	
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys(t);
	
		driver.findElement(By.id("loginbutton")).click();
		

	}
	@DataProvider(name="data")
	public Object[][] dataprovider() {
		return new Object[][] {
			{"hai123@gmail.com","123456789"},
			{"helo123@gmail.com","12345678"},
			{"hii123@gmail.com","112345678"}
		};
			
			
	}

}
