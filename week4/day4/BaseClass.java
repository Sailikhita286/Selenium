package week4.day4;


	import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.Parameters;

	import java.time.Duration;

	public class BaseClass {

	    public ChromeDriver driver;

	    @Parameters({ "url", "username", "password" })
	    @BeforeMethod
	    public void preConditions(String url, String username, String password) {
	    	ChromeOptions options=new ChromeOptions();
	    	options.addArguments("guest");
	    	ChromeDriver driver=new ChromeDriver(options);;
			driver.manage().window().maximize();
			
	        driver.get(url);
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	        driver.findElement(By.id("username")).sendKeys(username);
	        driver.findElement(By.id("password")).sendKeys(password);
	        driver.findElement(By.className("decorativeSubmit")).click();
	        driver.findElement(By.linkText("CRM/SFA")).click();
	        driver.findElement(By.linkText("Leads")).click();
	    }

	    @AfterMethod
	    public void postConditions() {
	        driver.close();
	    }
	}

