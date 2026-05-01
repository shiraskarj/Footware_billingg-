package testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;

public class BaseTest {
	
	static WebDriver driver;
	LoginPage lp;
	
	
	@BeforeSuite
	public void initbrowser() throws IOException
	{
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		// driver.get("https://footware-billing.vercel.app/Account");
		String path = (System.getProperty("user.dir"))+"//config.properties";
		FileInputStream fis=new FileInputStream(path);
		Properties prop=new Properties();
		prop.load(fis);
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
	}
	@BeforeClass
	public void createobj() throws Exception
	{
		lp=new LoginPage(driver);
	}
	@AfterSuite
	public void teardown()
	{
		//driver.quit();
	}

}
