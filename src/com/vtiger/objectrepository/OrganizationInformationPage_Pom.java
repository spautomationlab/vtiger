package com.vtiger.objectrepository;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.vtiger.genericLib.DataHandlingMethod;

public class OrganizationInformationPage_Pom {
	
	DataHandlingMethod d = new DataHandlingMethod();
	
	@FindBy(xpath="//span[contains(text(),'Organization Information')]")
	private WebElement SuccessMessText;

	public WebElement getSuccessMessWebElement() {
		return SuccessMessText;
	}
	
	public String getSuccessMess() {
		String message = SuccessMessText.getText();
		return message;		
	}
	
	public void validateSucessMessage(int row) throws EncryptedDocumentException, IOException {
		String partialSuccessMess = (d.FetchExcelFileData("organizationdata", "OrganizationInformation", row, 1)+" - Organization Information");
		String actualSucsessmessage = SuccessMessText.getText();
		
		System.out.println(partialSuccessMess);
		System.out.println(actualSucsessmessage);
		if(actualSucsessmessage.contains(partialSuccessMess)) {
			System.out.println("Organization Successfully created");
			d.setDataToExcelFile("CAC", "organizationdata", "OrganizationInformation", row ,  0);
		}else {
			System.out.println("Organization failed to create");
			Assert.fail("Organization Failed to create");
		}
	}

}
