package pages;

import java.io.FileInputStream;
import java.util.Properties;

public abstract class BaseClass {
	
	String path;
	FileInputStream fis;
	Properties prop;
	
	public BaseClass() throws Exception 
	{
		 path=System.getProperty("user.dir")+"//config.properties";
		 fis=new FileInputStream(path);
		prop=new Properties();
		prop.load(fis);
	}

}
