package org.tng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testngtask3 {
	
	@Test()
	public void webpage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://purple.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		WebElement matt = driver.findElement(By.xpath("(//a[text()='Mattresses'])[1]"));
		Thread.sleep(4000);
		
		 Actions ac=new Actions(driver);
		 ac.moveToElement(matt).perform();
		 driver.findElement(By.xpath("(//li[@tabindex='-1'])[1]")).click();
		 Thread.sleep(4000);
		 WebElement add = driver.findElement(By.xpath("(//button[@data-cart-action='open'])[3]"));
		 add.click();
		 
		 Thread.sleep(4000); 
		 WebElement cart = driver.findElement(By.xpath("(//span[text()='The Purple Mattress'])[2]"));
		
		 Assert.assertEquals(cart.getText(),"The Purple Mattress");
		 
			 
		 }

			

}

