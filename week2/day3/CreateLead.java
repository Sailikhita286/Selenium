package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;


public class CreateLead{

public static void main(String[]  args)
{
	ChromeOptions options=new ChromeOptions();
	options.addArguments("guest");
	ChromeDriver driver=new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();	
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Likhita");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("ch");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Lead");
		driver.findElement(By.name("submitButton")).click();
		driver.getTitle();
		driver.close();
		
}

}
		
	
	   
