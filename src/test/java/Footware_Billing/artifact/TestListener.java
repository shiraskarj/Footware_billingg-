package Footware_Billing.artifact;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import utility.TakeScreenshotOfApp;

public class TestListener extends AddCustomer implements ITestListener  {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test case name :"+ result.getName() +"has been started");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case:" +result.getName()+"successed");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("Test case:" +result.getName()+"failed");
		try {
			TakeScreenshotOfApp.captureScreenShot(driver, result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test case:" +result.getName()+"skipped");
	}



	@Override
	public void onStart(ITestContext context) {
		System.out.println(context.getName()+"started");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println(context.getName()+"finished");
	
	}

}
