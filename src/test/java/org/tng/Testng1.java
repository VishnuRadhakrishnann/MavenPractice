package org.tng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testng1 {
	
	static WebDriver driver;
	@BeforeTest
	public void beforemethod() {
System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\chromedriver.exe");
		
	   driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
	}
	
	@Parameters({"username","password"})
	@Test()
	public void trail(String s,String t) {
		
	     Assert.assertTrue(driver.getTitle().contains("log in"));
	     
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys(s);
		Assert.assertEquals(user.getAttribute("value"), "hai123@gmail.com");
		
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys(t);
		Assert.assertTrue(pass.getAttribute("value").equals("12345678"));
		driver.findElement(By.id("loginbutton")).click();

	}
	
	@Parameters({"username","password"})
	@Test()
	public void trail1(String s,String t) {
		
		SoftAssert sf=new SoftAssert();
		
		sf.assertEquals(driver.getTitle(), "log in");
		
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys(s);
		sf.assertTrue(user.getAttribute("value").equals("hai123@gmail.com"));
		
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys(t);
		sf.assertEquals(pass.getAttribute("value"), "12345678");
		
		driver.findElement(By.id("loginbutton")).click();
		sf.assertAll();

	}

}
