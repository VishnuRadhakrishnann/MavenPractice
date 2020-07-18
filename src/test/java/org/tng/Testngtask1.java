package org.tng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testngtask1{
	
	@Test()
	public void webpage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.guru99.com/become-an-instructor.html");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		
		WebElement fra = driver.findElement(By.xpath("//iframe[@id='JotFormIFrame-82892910187466']"));
		driver.switchTo().frame(fra);
		WebElement next = driver.findElement(By.xpath("//button[@id='jfCard-welcome-start']"));
		next.click();
	    driver.findElement(By.id("first_28")).sendKeys("Vishnu");
	    driver.findElement(By.id("last_28")).sendKeys("R");
		driver.findElement(By.xpath("(//button[@class='jfInput-button forNext u-right'])[1]")).click();
		driver.findElement(By.id("input_12")).sendKeys("vishnu@gmail.com");
		driver.findElement(By.xpath("(//button[@class='jfInput-button forNext u-right'])[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[@class='jfYesno-label'])[2]")).click();
		driver.findElement(By.xpath("(//button[@class='jfInput-button forNext u-right'])[3]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='input_87']")).sendKeys("F:\\task\\1\\task1.txt");
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[@class='jfInput-button forNext u-right'])[5]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[@class='jfYesno-label'])[3]")).click();
		driver.findElement(By.xpath("(//button[@class='jfInput-button forNext u-right'])[6]")).click();
		
		
	}
	
}
