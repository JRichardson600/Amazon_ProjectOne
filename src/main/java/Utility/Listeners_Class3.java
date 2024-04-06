package Utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listeners_Class3 implements ITestListener {

	public static WebDriver driver;

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
		Reporter.log("Test Case Started");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
		TakesScreenshot  ts = (TakesScreenshot) driver;
	    File source= ts.getScreenshotAs(OutputType.FILE);
	    File destination=new File("C:\\Users\\Richard\\eclipse-workspace\\ProjectOne\\ScreenShotAmazon\\PassedTC\\"+"TestCasePassed_"+result.getName()+".png");
			try {
				FileUtils.copyFile(source, destination);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	    Reporter.log("Test has Passed");

	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		TakesScreenshot  ts = (TakesScreenshot) driver;
		File source= ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\Richard\\eclipse-workspace\\ProjectOne\\ScreenShotAmazon\\FailedTC\\"+"TestCaseFailed_"+result.getName()+".png");
		try {
			FileUtils.copyFile(source, destination);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
			Reporter.log("Test has Failed");	
		}

		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
		
		TakesScreenshot  ts = (TakesScreenshot) driver;
		File source= ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\Richard\\eclipse-workspace\\ProjectOne\\ScreenShotAmazon\\SkippedTC\\"+"TestCaseSkipped_"+result.getName()+".png");
		try {
			FileUtils.copyFile(source, destination);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
			Reporter.log("Test Case Skipped");	
		}
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
		Reporter.log("Test Case Failed because of timeout");
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
		Reporter.log("Test Suite Started");
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
		Reporter.log("Test Suite completed");
	}

}
