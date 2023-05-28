package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnSelectClass {

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
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jothish1");
						 
				 //9. Enter LastName using id Locator
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Natarajan1");

				 //10. Enter your mail-id
				driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("jothish.testing1@gmail.com");
				
				//11.phone number 
				driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9988776655");
				
				// 12. Using SelectClass capturing the drop down values
				
				//Industry-values
				
				WebElement cd = driver.findElement(By.id("createLeadForm_industryEnumId"));
				
				//Syntax 
				 
				Select op =  new Select(cd);
				
				op.selectByValue("IND_DISTRIBUTION");
				
				//Ownership-index
				
                WebElement cd1 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
				
				//Syntax 
				 
				Select op1 =  new Select(cd1);
				
				op1.selectByIndex(5);
				
				//state-text

                WebElement cd2 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
				
				//Syntax 
				 
				Select op2 =  new Select(cd2);
				
				op2.selectByVisibleText("Georgia");

				 //12. Click on create Lead Button Using name Locator
				driver.findElement(By.name("submitButton")).click();
		
	}

}
