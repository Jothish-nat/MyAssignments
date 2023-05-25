package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLeads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
				
		// To Maximize the screen
		driver.manage().window().maximize();
				
		// Need to wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Launch the browser
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		// Enter the username
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		
		// Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		// Click Login
		driver.findElement(By.className("decorativeSubmit")).click();
		
		// Click crm/sfa link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
	    // Click Leads link
		driver.findElement(By.linkText("Leads")).click();
		
		// Click on Create Lead
		driver.findElement(By.linkText("Create Lead")).click();
		
        // Enter company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testing1");
		
        // Enter first name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Testfirstname");
		
        // Enter last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Testlastname");
		
        // Click on Create Lead button
		driver.findElement(By.name("submitButton")).click();
		
		// Click on Edit Lead Button
		driver.findElement(By.linkText("Edit")).click();
	
	    // Change the company name
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Testleafmay");
		
		// Click Update
		driver.findElement(By.name("submitButton")).click();
		
		}

}
