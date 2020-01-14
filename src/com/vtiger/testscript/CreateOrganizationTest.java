package com.vtiger.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.vtiger.genericLib.BaseClass;
import com.vtiger.objectrepository.CreateOrganizationPage_Pom;
import com.vtiger.objectrepository.HomePage_Pom;
import com.vtiger.objectrepository.OrganizationInformationPage_Pom;
import com.vtiger.objectrepository.OrganizationPage_Pom;

@Test
public class CreateOrganizationTest extends BaseClass {
	public void createOrganization() throws EncryptedDocumentException, IOException{
		
		HomePage_Pom hp = PageFactory.initElements(driver, HomePage_Pom.class);
		OrganizationPage_Pom ohp = PageFactory.initElements(driver, OrganizationPage_Pom.class);
		CreateOrganizationPage_Pom cop = PageFactory.initElements(driver, CreateOrganizationPage_Pom.class);
		OrganizationInformationPage_Pom oip = PageFactory.initElements(driver, OrganizationInformationPage_Pom.class);
		
		hp.getOrganizationsNavLink().click();
		ohp.clickCreateOrganizationButton();
		int dataRow =cop.createOrganization();
		oip.validateSucessMessage(dataRow);	
		
	}
}
