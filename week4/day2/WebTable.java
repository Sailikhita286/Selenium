package week4.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 ChromeDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();

	        driver.get("https://leafground.com/table.xhtml");
	        WebElement table = driver.findElement(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]"));

	        // Retrieve column 2 text
	        List<WebElement> column2 = driver.findElements(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr/td[2]"));
	        for (int i = 0; i < column2.size(); i++) {
	            String textdata = column2.get(i).getText();
	            System.out.println(textdata);
	        }
	}
}
	


