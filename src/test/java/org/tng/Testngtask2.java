package org.tng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Testngtask2 {
	
	@Test()
	public void webpage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.jcpenney.com/?utm_source=google&utm_medium=cpc&utm_campaign=paid%20search&cid=paid%20search%7cgoogle%7cG_Desktop_Brand_JCP_Official_Site_INT_ENG%7cG_Desktop_Brand_JCP_Official_Site_INT_ENG_Exact_JCPenney&utm_content=kwd-29180950&utm_adgroupid=9016270245&utm_keyword=jcpenny&utm_matchtype=e&utm_device=c&&s_kwcid=AL!6728!3!442885314213!e!!g!!jcpenny&gclid=Cj0KCQjwl4v4BRDaARIsAFjATPmwFlrgLCuTMedrrrpWRVQF9kWWtFnvyL9CAdEqYLMZxv1mmC66VCEaAoVqEALw_wcB&gclsrc=aw.ds");
		
		driver.manage().window().maximize();
		WebElement men = driver.findElement(By.xpath("(//div[@class='SecondaryNavigationPanel-menuItemLink'])[4]"));
		Actions ac=new Actions(driver);
		
		ac.moveToElement(men).perform();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("(//li[@class='SecondaryNavigationPanel-megaMenuSubCategories'])[3]")).click();
		
		List<WebElement> li = driver.findElements(By.xpath("//h6[@data-automation-id='product-title']"));
		
		for(int i=0;i<li.size();i++) {
			
			WebElement ge = li.get(i);
			String tex = ge.getText();
			Thread.sleep(4000);
			if(tex.equals("Levi's® Men's 550™ Relaxed Fit Jeans")) {
				ge.click();
			}
			
			
		}
		
		
		
			

}
}
