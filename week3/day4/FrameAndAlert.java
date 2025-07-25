package week3.day4;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.Alert;
	import java.time.Duration;
	
	public class FrameAndAlert {

	    public static void main(String[] args) {
	        // Setup ChromeDriver
	        WebDriver driver = new ChromeDriver();

	        // Load URL and maximize
	        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
	        driver.manage().window().maximize();

	        // Add implicit wait
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	        // Switch to frame by ID or name
	        driver.switchTo().frame("iframeResult");

	        // Click the "Try it" button
	        WebElement tryButton = driver.findElement(By.xpath("//button[text()='Try it']"));
	        tryButton.click();

	        // Handle the alert (prompt)
	        Alert alert = driver.switchTo().alert();

	        // Send a name to the prompt and accept
	        String Text = "Bunny";
	        alert.sendKeys(Text);
	        alert.accept();

	        // Verify the result text
	        WebElement resultT = driver.findElement(By.id("demo"));
	        String result = resultT.getText();

	        if (result.contains(Text)) {
	            System.out.println("Accepted " + result);
	        } else {
	            System.out.println("Mismatched " + result);
	        }
	  
	        driver.quit();
	    }
	}


