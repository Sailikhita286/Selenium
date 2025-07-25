package week3.day4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ConformAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions option = new ChromeOptions();
        option.addArguments("guest");
        
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://leafground.com/alert.xhtml");
        driver.manage().window().maximize();
   
        driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click(); 
        Alert conform = driver.switchTo().alert();
        String show = conform.getText();
        System.out.println(show);
        
        Thread.sleep(5000);
        conform.accept();

	}

}
