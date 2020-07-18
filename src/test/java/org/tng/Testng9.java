package org.tng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(org.tng.Testng8.class)
public class Testng9 {
	
	WebDriver driver;
	@BeforeMethod()
	public void beforemethod() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
	}
	
	@Test()
	public void launch() {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone");
		driver.findElement(By.xpath("(//input[@class='nav-input'])[1]")).click();
			
	}
	
	@Test()
	public void payment() {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone");
		driver.findElement(By.xpath("(//input[@class='nav-input'])[1]")).click();
				
	}
	
	@Test()
	public void cancel() {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone");
		driver.findElement(By.xpath("(//input[@class='nav-input'])[1]")).click();
		Assert.assertTrue(false);
	
	}

}
