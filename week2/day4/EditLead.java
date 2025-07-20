package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
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
						driver.findElement(By.linkText("Create Lead")).click();
						driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
						driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Likhita");
						driver.findElement(By.id("createLeadForm_lastName")).sendKeys("ch");
						driver.findElement(By.name("departmentName")).sendKeys("Course");
						driver.findElement(By.name("description")).sendKeys("Selenium Automation ");
						driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("likhita@gmail.com");
						
						WebElement State = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
						Select option = new Select(State);
						option.selectByVisibleText("Maine");
						
						driver.findElement(By.xpath("//input[@name='submitButton']")).click();
						driver.findElement(By.linkText("Edit")).click();
						driver.findElement(By.name("description")).clear();
						driver.findElement(By.name("description")).sendKeys("Automation with java");
						driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
						String show = driver.getTitle();
						System.out.println(show);
						driver.close();


		}


	}


