package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplictWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();

        // Load the url - get
        driver.get("https://leafground.com/waits.xhtml");

        // Maximize the browser
        driver.manage().window().maximize();

        // Click the button
        driver.findElement(By.xpath("//span[text()='Open with delay']")).click();

        // Check the element is displayed or not
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        boolean until = wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        System.out.println(until);
        
}
}
