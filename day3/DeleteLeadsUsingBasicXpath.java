package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLeadsUsingBasicXpath {

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
		 
		//6. Click on find Leads
		driver.findElement(By.xpath("//a[contains(text(),'Find')]")).click();
		
		//7. Click on Phone
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		
		//8.Enter phone number
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9080774562");
		
		//9.Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		//10.Capture lead ID of First Resulting lead
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String leadID=null;
		leadID= driver.findElement(By.xpath("(//div[@class='x-panel x-grid-panel']//table)[2]//a")).getText();
		System.out.println("Lead ID is :"+leadID);
		
		//11.Click First Resulting lead
		driver.findElement(By.xpath("(//div[@class='x-panel x-grid-panel']//table)[2]//a")).click();
				
		//12.Click Delete
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		
		//13.Click Find leads
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		//14.Enter captured lead ID
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
		
		//15.Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//16.Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		String expectedMessage="No records to display";
		String actualMessage=driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
		if(actualMessage.equals(expectedMessage)) {
			System.out.println("The Record is deleted successfully");
			System.out.println("Then, don't do nothing");
		}else {
			System.out.println("The Record is not deleted");
		}
		
		//17.Close the browser (Do not log out)
		driver.close();
		
	}

}
