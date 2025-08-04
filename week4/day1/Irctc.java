package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Irctc {
	
	public static void main(String[] args) {
		
		ChromeOptions option = new ChromeOptions();
        option.addArguments("guest");
        
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.irctc.co.in/nget/train-search");
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();

        // Get parent window handle
        String Parent = driver.getWindowHandle();
        System.out.println(Parent);

        // Get all window handles
        Set<String> Child = driver.getWindowHandles();
        System.out.println(Child);

        // Convert Set to List
        List<String> StoreChild = new ArrayList<String>(Child);
        String ValueofChild = StoreChild.get(1);

        // Get and print child window title
        String titleofChild = driver.getTitle();
        System.out.println(titleofChild);

        // Switch to child window
        driver.switchTo().window(ValueofChild);

        driver.close(); // Close child window

        // Switch back to parent window
        driver.switchTo().window(Parent);

        // Get and print parent window title
        String titleofParent = driver.getTitle();
        System.out.println(titleofParent);

        driver.close(); 
        // Close parent window
    }
	
}