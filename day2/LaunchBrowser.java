package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Step 1 : Launch Browser
		ChromeDriver driver = new ChromeDriver();
		
		// To Maximize the screen
		driver.manage().window().maximize();
		
		// Need to wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// Step 2 : Load the URL
		driver.get("https://login.salesforce.com/");
		
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		
		driver.findElement(By.id("password")).sendKeys("Leaf@1234");
		
		driver.findElement(By.id("Login")).click();
		
		//driver.close();
		
		}

}
