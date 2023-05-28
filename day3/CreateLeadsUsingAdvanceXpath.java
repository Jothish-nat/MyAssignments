package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLeadsUsingAdvanceXpath {

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
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesManager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		 
		 //3. Click on Login Button using Class Locator
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
				 
		 //4. Click on CRM/SFA Link
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		 
		 //5. Click on Leads Button
		driver.findElement(By.xpath("//a[contains(text(),'Lea')]")).click();
		 
		 //6. Click on create Lead Button
		driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
		
		//7. Enter CompanyName using id Locator
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Testing2");
		  
		 //8. Enter FirstName using id Locator
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Jothish2");
				 
		 //9. Enter LastName using id Locator
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Natarajan2");

		 //10. Enter your mail-id
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("jothish.testing2@gmail.com");

	      //11.phone number 
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneNumber']")).sendKeys("9080774562");

		 //12. Click on create Lead Button Using name Locator
		driver.findElement(By.name("submitButton")).click();
			
		}

}
