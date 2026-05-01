package pages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.asm.Advice.This;

public class LoginPage extends BaseClass {
	WebDriver driver;
	@FindBy(xpath="//*[@name='empId']")
	private WebElement empid;
	@FindBy(xpath = "//*[@name='email']")
	private WebElement email;
	@FindBy(xpath = "//*[@name='password']")
	private WebElement password;
	@FindBy(xpath="//*[@type='submit']")
    private WebElement submitbn;
	
	public LoginPage(WebDriver driver) throws Exception 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public void logintoapp()
	{
      JavascriptExecutor jsExecutor=(JavascriptExecutor)driver;
//		jsExecutor.executeScript("arguments[0].value='EMP006';", empid);
		//empid.sendKeys("EMP006");
//		email.sendKeys("yoges@gmail.com");
//		password.sendKeys("yogesh@123");
		empid.sendKeys(prop.getProperty("empid"));
		email.sendKeys(prop.getProperty("email"));
		password.sendKeys(prop.getProperty("password"));
		
		jsExecutor.executeScript("arguments[0].click();",submitbn );
		//driver.switchTo().alert().accept();
		//submitbn.click();
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//		wait.until(ExpectedConditions.elementToBeClickable(
//		    By.xpath("//button[contains(text(),'OK')]")
//		)).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(99));
		wait.until(ExpectedConditions.alertIsPresent()).accept();
	}
}
