package com.vtiger.genericLib;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {
	
	@Override
	public void onTestStart(ITestResult result) {
		
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Script failed");
		String testName = result.getName();
		Date d = new Date();
		String dateString = d.toString();
		String date = dateString.replaceAll(" ", "").replaceAll(":", "_");
		EventFiringWebDriver web = new EventFiringWebDriver(BaseClass.driver);
		File scr = web.getScreenshotAs(OutputType.FILE);
		File des = new File("./screenshot/"+testName+date+".png");
		try {
			FileUtils.copyFile(scr, des);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
			
	}
	
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}
 
	@Override
	public void onStart(ITestContext context) {
		}
	
	@Override
	public void onFinish(ITestContext context) {
		
	}

}
