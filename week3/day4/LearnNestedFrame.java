package week3.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnNestedFrame {
	
	    public static void main(String[] args) {
	        // Launch the Browser
	    	ChromeDriver driver = new ChromeDriver();
	    	
	    	 driver.get("https://leafground.com/frame.xhtml");
	        
	        driver.manage().window().maximize();
	        
	        driver.switchTo().frame(2);
	        
	        WebElement frames = driver.findElement(By.xpath("//iframe[@id='frame2']"));
	        
	        driver.switchTo().frame(frames);
	        
	        driver.findElement(By.id("Click")).click();
	        
	

}
}
