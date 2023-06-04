package week3.day8;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFindElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// return List <WebElement>
		List<WebElement> el= driver.findElements(By.tagName("a"));
		
		int linksize = el.size();
		System.out.println(linksize);
		
		for (int i=0; i<linksize; i++)
		{
			String text = el.get(i).getText();
			System.out.println(text);
			
		}
		
	}

}
