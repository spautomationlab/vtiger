package com.vtiger.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage_Pom {
	
	@FindBy(name="user_name")
	private WebElement userName;
	
	@FindBy(name="user_password")
	private WebElement password;
	
	@FindBy(id="submitButton")
	private WebElement submitButton;
	
	@FindBy(xpath="//div[contains(text(),'username and password')]")
	private WebElement errorMessageText;
	
	//Getters Method
	
	public WebElement getUserName() {
		return userName;
	}
	
	public WebElement getPassword() {
		return password;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}

	public WebElement getErrorMessage() {
		return errorMessageText;
	}
	
	//Business Logic
	
	public void successfullLogin(String un, String pass) {
		userName.sendKeys(un);
		password.sendKeys(pass);
		submitButton.click();
	}
	
	public void ErrorMessageValidation(String un, String pass) {
		userName.sendKeys(un);
		password.sendKeys(pass);
		submitButton.click();
		String actualErrorMeaasge = errorMessageText.getText();
		String expErrorMeassage = "You must specify a valid username and password.";
		
		if(actualErrorMeaasge.equals(expErrorMeassage)) {
			Reporter.log("Validation successfull",true);
		}else {
			Reporter.log("Validation Failed",true);
			
		}
	}
}
