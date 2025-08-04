package week4.day4;


	import org.openqa.selenium.By;
	import org.testng.annotations.Test;

	public class CreatesLead extends BaseClass {

	    @Test
	    public void createLead() {
	        driver.findElement(By.linkText("Create Lead")).click();
	        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Qeagle");
	        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vineeth");
	        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rajendran");
	        driver.findElement(By.name("submitButton")).click();
	    }
	}


