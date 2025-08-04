package marathon.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TataUrl {

		public static void main(String[] args) throws InterruptedException, IOException {
	    	
	    	
	    	
		     
	    	 ChromeOptions opt = new ChromeOptions();
	         opt.addArguments("guest");   
	         ChromeDriver driver = new ChromeDriver(opt);



	         // Open TataCliq
	            driver.get("https://www.tatacliq.com/");
	            driver.manage().window().maximize();
	            Thread.sleep(3000); // Allow page to load
	            
	            driver.findElement(By.id("moe-dontallow_button")).click();
	    		// create object for actions class 
	    		Actions act= new Actions(driver);
	    		
	    		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    		driver.get("https://www.tatacliq.com/");
	    		driver.manage().window().maximize();
	    		
	    		WebElement brands = driver.findElement(By.xpath("//div[text()='Brands']"));
	    		
	    		act.moveToElement(brands).perform();
	    		
	    		System.out.println("Mouse Hovered");
	    		driver.findElement(By.xpath("//div[text()='Watches & Accessories']")).click();
	    		
	            Thread.sleep(2000);
	    		
	    		driver.findElement(By.xpath("(//div[@class='DesktopHeader__brandsDetails'])[1]")).click();
	    		
	    		WebElement element = driver.findElement(By.className("SelectBoxDesktop__hideSelect"));
	    		
	    		Select sort= new Select(element);
	    		
	    		sort.selectByVisibleText("New Arrivals");
	    		driver.findElement(By.xpath("(//div[@class='FilterDesktop__newFilName'])[1]")).click();
	    		
	    		Thread.sleep(2000);
	    		
	    		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='ProductDescription__priceHolder']")));
	    		List<WebElement> prices = driver.findElements(By.xpath("//div[@class='ProductDescription__priceHolder']"));
	    		
	    		//for(WebElement price :prices) {
	    			//System.out.println(price.getText());
	    		//}
	    		
	    		List<String> priceTexts = prices.stream()
	    			    .map(price -> price.getText().trim())
	    			    .collect(Collectors.toList());

	    			System.out.println(String.join(", ", priceTexts));
	    			
	    		Thread.sleep(1000);
	    		
	    		String product1 = prices.get(0).getText();
	    		System.out.println("The price of the first product is "+product1);
	    		
	    		driver.findElement(By.xpath("(//a[@aria-label='Casio'])[1]")).click();
	    		
	    		Set<String> allAddr = driver.getWindowHandles();
	    		System.out.println("Address of all window :"+allAddr);

	    		List<String> address = new ArrayList<String>(allAddr);

	    		
	    		System.out.println("Title before switching is: " + driver.getTitle());

	    		driver.switchTo().window(address.get(address.size()-1));

	    		System.out.println("Title after switching is: " + driver.getTitle());
	    		
	    		String price1Full = driver.findElement(By.xpath("//h3[contains(text(),'MRP:')]")).getText(); // MRP: ₹3995
	    		System.out.println("MRP full text: " + price1Full);
	    		
	    		// Extract price part only
	    		String price1 = price1Full.replaceAll("[^₹0-9]", "");  // ₹3995
	    		String product1Clean = product1.replaceAll("[^₹0-9]", ""); // ₹3995

	    		if(product1Clean.equals(price1)) {
	    		    System.out.println("Price matches.");
	    		} else {
	    		    System.out.println("Price mismatch.");
	    		}

	    		driver.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
	    		String count=driver.findElement(By.xpath("//span[@class='DesktopHeader__cartCount']")).getText();
	    		System.out.println("Product count is "+count);
	    		driver.findElement(By.xpath("//span[@class='DesktopHeader__cartCount']")).click();
	    		
	    		
	    		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(15));
	    		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.className("CartPage__pageCenter")));
	    		
	    		File src =  driver.getScreenshotAs(OutputType.FILE);
	    		File dest = new File("./Screenshots/cartpage.png");
	    		FileUtils.copyFile(src, dest);

	    		System.out.println("Screenshot of product page taken.");
	    		
	    		//driver.close();
	    		driver.switchTo().window(address.get(0));
	    		driver.quit();
	    		


	    }

	}


