package com.vtiger.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.vtiger.genericLib.BaseClass;

public class OrganizationPage_Pom extends BaseClass{
	
	@FindBy(xpath= "//img[@title='Create Organization...']")
	private WebElement createOrganizationButton;
	
	// Getters
	
	public WebElement getCreateOrganizationButton() {
		return createOrganizationButton;
	}
	
	// Business Logic
	
	public void clickCreateOrganizationButton() {
		createOrganizationButton.click();
	}

}
