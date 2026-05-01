package utility;

import java.io.File;
import java.io.IOException;
//import java.util.logging.FileHandler;

import org.apache.commons.compress.harmony.pack200.NewAttribute;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshotOfApp {
	public static void captureScreenShot (WebDriver driver,String filename) throws IOException{
		TakesScreenshot tkr=(TakesScreenshot)driver;
	     File src=	tkr.getScreenshotAs(OutputType.FILE);
		
				File destination=new File(System.getProperty("user.dir")+"//Screenshot\\" +filename+".png");
				//FileHandler(src,destination);
				FileHandler.copy(src, destination);
		
	}

}
