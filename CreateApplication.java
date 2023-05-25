package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateApplication {

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
		
		 //2. Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		 
		 //3. Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();
				 
		 //4. Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
		 
		 //5. Click on Leads Button
		driver.findElement(By.linkText("Leads")).click();
		 
		 //6. Click on create Lead Button
		driver.findElement(By.linkText("Create Lead")).click();
		
		//7. Enter CompanyName using id Locator
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testing");
		  
		 //8. Enter FirstName using id Locator
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jothish");
				 
		 //9. Enter LastName using id Locator
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Natarajan");

		 //10. Enter your mail-id
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("jothish.testing@gmail.com");

	      //11.phone number 
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9988776655");

		 //12. Click on create Lead Button Using name Locator
		driver.findElement(By.name("submitButton")).click();
			
		

	}

}
