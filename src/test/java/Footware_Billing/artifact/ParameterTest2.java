package Footware_Billing.artifact;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParameterTest2 {
	
	@Parameters("browser")
	@Test
	public void browserselection(String browsername)
	{
		if (browsername.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get("https://secure.facebook.com/");
			driver.manage().window().maximize();
			
		}
	}}
//	@Parameters("browser")
//	@Test
//		public void browserselection2(String browsername)
//		{
//			
//		
//	      if (browsername.equalsIgnoreCase("Chrome")) {
			//WebDriverManager.edgedriver().setup();
//	    	  System.setProperty("webdriver.edge.driver", "C:\\Users\\OM\\Downloads\\msedgedriver.exe");
//			WebDriver driver=new EdgeDriver();
//	    	  WebDriverManager.chromedriver().setup();
//				WebDriver driver=new ChromeDriver();
//			driver.get("https://footware-billing.vercel.app/Account");
//			driver.manage().window().maximize();
//			
//		}
//		}
//	}

