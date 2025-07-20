package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeletedLead {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		 options.addArguments("guest");
		 
			
			ChromeDriver driver = new ChromeDriver(options);
			

					driver.get("http://leaftaps.com/opentaps/control/main");
					driver.manage().window().maximize();

					
					driver.findElement(By.id("username")).sendKeys("democsr");
					driver.findElement(By.id("password")).sendKeys("crmsfa");
					driver.findElement(By.className("decorativeSubmit")).click();
					driver.findElement(By.linkText("CRM/SFA")).click();
					driver.findElement(By.linkText("Leads")).click();
					
					
					driver.findElement(By.linkText("Find Leads")).click();
					driver.findElement(By.linkText("Phone")).click();
					driver.findElement(By.name("phoneAreaCode")).sendKeys("91");
					driver.findElement(By.name("phoneNumber")).sendKeys("817915061");
					driver.findElement(By.linkText("Find Leads")).click();
					driver.findElement(By.xpath("//input[@name='id']")).sendKeys("10143");
					driver.findElement(By.linkText("Find Leads")).click();
					
					WebElement LeadID = driver.findElement(By.xpath("//a[text()='10001']"));
					String text = LeadID.getText();
					System.out.println(text);
					LeadID.click();
					driver.findElement(By.linkText("Qualify Lead")).click();
									
	}

}