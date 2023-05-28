package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
				
		// To Maximize the screen
		driver.manage().window().maximize();
				
		// Need to wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				 
		//1. Launch URL "http://leaftaps.com/opentaps/control/login"
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		
		//Attribute based Xpath ----//tagname[@attribute='attribute Value']
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesManager");
		
		//Partial attribute based Xpath -----//tagname[contains(@attribute,'partal attribute value')]
		driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("crmsfa");
		
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		//Partial Text based XPath ---//tagname[contains(text(),'Partial text'])
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		
		
	}

}
