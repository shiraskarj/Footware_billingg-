package Footware_Billing.artifact;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddCustomer {
	static WebDriver driver;
	
	@Test
	public  void login()
	{
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("https://footware-billing.vercel.app/Account");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		 
		 WebElement empid = driver.findElement(By.xpath("//*[@name='empId']"));
		 JavascriptExecutor jsExecutor=(JavascriptExecutor)driver;
		jsExecutor.executeScript("arguments[0].value='EMP004';", empid);
		driver.findElement((By.xpath("//*[@name='email']"))).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("test@123");
		WebElement clickk = driver.findElement(By.xpath("//*[@type='submi']"));
		jsExecutor.executeScript("arguments[0].click();",clickk);
		
	}

}
 