package testcases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
	@Test
	public void login()
	{
		lp.logintoapp();
		String s1="dashboard";
		boolean loginsuccess = s1.contains(s1);
		Assert.assertEquals(loginsuccess, true);
		System.out.println(loginsuccess);
		System.out.println("Login successfull");
		
	}

}
