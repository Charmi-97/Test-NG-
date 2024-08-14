package Project1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Program1 {

	WebDriver driver;
	
	@BeforeMethod
	
	public void OpenBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@Test
	
	public void Login(){
		WebElement usernameField = driver.findElement(By.id("email"));
		usernameField.sendKeys("YourEmailAddress");
		
		WebElement passwordField = driver.findElement(By.id("pass"));
		passwordField.sendKeys("YourPassword");

	}
	
	@AfterMethod
	
	public void CloseBrowsor() {
		driver.close();
	}
}
