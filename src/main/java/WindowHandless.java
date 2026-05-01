import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandless {
	
	//WebDriverManager.chromedriver().setup();
	@Test
	public void launchbrowser()
	{
		
	
	WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://www.flipkart.com/");
String parentwin = driver.getWindowHandle();
driver.switchTo().newWindow(org.openqa.selenium.WindowType.TAB);
driver.get("https://www.facebook.com/");
driver.switchTo().newWindow(org.openqa.selenium.WindowType.TAB);
driver.get("https://www.ajio.com/");
Set<String> handles = driver.getWindowHandles();
for(String handle:handles)
{
	if(!(handle.equals(parentwin)))
	{
		driver.switchTo().window(handle);
		driver.close();
	}
}
driver.switchTo().window(parentwin);
}
}