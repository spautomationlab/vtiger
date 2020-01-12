package com.vtiger.genericLib;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.vtiger.objectrepository.HomePage_Pom;
import com.vtiger.objectrepository.LoginPage_Pom;

public class BaseClass {
	public static WebDriver driver = null;
	public DataHandlingMethod f = new DataHandlingMethod();
	
	
	@BeforeClass
	public void launchBrowser() throws IOException {
		System.setProperty("webdriver.chrome.driver", "./src/com/vtiger/dependencies/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(f.FetchPropertyFileData("url"));			
	}
	
	@BeforeMethod 
	public void loginIntoVtiger() throws IOException, InterruptedException {
		LoginPage_Pom lp = PageFactory.initElements(driver, LoginPage_Pom.class);
		lp.successfullLogin(f.FetchPropertyFileData("usernamesachin"), f.FetchPropertyFileData("passwordsachin"));		
	}
	
	@AfterMethod 
	public void logoutFromVtiger() throws InterruptedException {
		HomePage_Pom hp = PageFactory.initElements(driver, HomePage_Pom.class);
		hp.ClickLogout();
	}
	
	@AfterClass 
	public void closeBrowser() {
		driver.close();
	}
}
