package org.tng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;




public class Testng4 {
	
   @Parameters("browser")
	@Test()
	public void brows(String s) {
	   WebDriver driver=null;
		if(s.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vishn\\eclipse-workspace\\MavenTestng\\src\\chromedriver.exe");
		 driver=new ChromeDriver();
		
		}
		else if(s.equals("ie")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\vishn\\eclipse-workspace\\MavenTestng\\src\\chromedriver.exe");
			driver=new ChromeDriver();
			
			}
		
		else if(s.equals("gecko")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\vishn\\eclipse-workspace\\MavenTestng\\src\\chromedriver.exe");
			 driver=new ChromeDriver();
			 Assert.assertTrue(false);
			
			}
		driver.get("https://www.facebook.com/");
		
		}

}
