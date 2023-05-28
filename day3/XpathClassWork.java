package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathClassWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Launch the browser
				ChromeDriver driver = new ChromeDriver();
						
				// To Maximize the screen
				driver.manage().window().maximize();
				
								 
				//1. Launch URL "http://leaftaps.com/opentaps/control/login"
				driver.get("https://login.salesforce.com/");
				
				// attribute based Xpath
				driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hari.radhakrishnan@qeagle.com");
				
				driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Leaf@1234");
				
				driver.findElement(By.xpath("//input[@class='button r4 wide primary']")).click();
				
				// Need to wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				driver.close();
				
				
				
				
		
		
		
		

	}

}
