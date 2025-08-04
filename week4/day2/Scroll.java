package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Scroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();


        Actions acts=new Actions(driver);
        
        WebElement element =driver.findElement(By.linkText("Conditions of Use & Sale"));
        
        acts.scrollToElement(element).perform();
        element.click();
        
}

	}

