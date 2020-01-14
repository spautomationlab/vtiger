package com.vtiger.objectrepository;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.vtiger.genericLib.DataHandlingMethod;
import com.vtiger.genericLib.GeneralMethod;

public class CreateOrganizationPage_Pom {
	DataHandlingMethod d = new DataHandlingMethod();
	GeneralMethod gm = new GeneralMethod();
	
	//Initializing WebElements for Organization Information 
	
	@FindBy(name= "accountname")
	private WebElement organizationNameField;
	
	@FindBy(name= "website")
	private WebElement websiteField;
	
	@FindBy(id="tickersymbol")
	private WebElement TickerSymbolField;
	
	@FindBy(name="account_name")
	private WebElement MemberOfDropDown;
	
	@FindBy(name= "employees")
	private WebElement employeesField;
	
	@FindBy(name= "email2")
	private WebElement otherEmailField;

	@FindBy(name="industry")
	private WebElement industryField;
	
	@FindBy(name="accounttype")
	private WebElement typeDropDown;
	
	@FindBy(name="emailoptout")
	private WebElement EmailOptOutField;
	
	@FindBy(xpath="//input[@name=\"assigntype\"]")
	private WebElement assignedToUserRadioButton;
	
	@FindBy(xpath="//input[@name=\"assigntype\"][2]")
	private WebElement assignedToGroupRadioButton;
	
	@FindBy(name="assigned_user_id")
	private WebElement assignedToUserDropDown;
	
	@FindBy(name="assigned_group_id")
	private WebElement assignedToGroupDropDown;
	
	@FindBy(name="phone")
	private WebElement PhoneField;
	
	@FindBy(name= "fax")
	private WebElement faxField;
	
	@FindBy(name="otherphone")
	private WebElement otherPhoneField;

	@FindBy(name="email1")
	private WebElement emailField;

	@FindBy(name="ownership")
	private WebElement ownershipField;
	
	@FindBy(name="rating")
	private WebElement ratingDropDown;
	
	@FindBy(id="siccode")
	private WebElement sicCodeField;
	
	@FindBy(name="annual_revenue")
	private WebElement annualRevenueField;
	
	@FindBy(name="notify_owner")
	private WebElement notifyOwnerField;
	
	//Initializing WebElements for Address Information
	
	@FindBy(xpath="//b[text()='Copy Shipping address']/../input")
	private WebElement copyShippingAddressRadioButton;
	
	@FindBy(xpath="//b[text()='Copy Billing address']/../input")
	private WebElement CopyBillingAddressRadioButton;
	
	@FindBy(name="bill_street")
	private WebElement billingAddressField;
	
	@FindBy(name="bill_pobox")
	private WebElement billingPOBoxField;
	
	@FindBy(name="bill_city")
	private WebElement billingCityField;
	
	@FindBy(name="bill_state")
	private WebElement billingStateField;
	
	@FindBy(name="bill_code")
	private WebElement billingPostalCodeField;
	
	@FindBy(name="bill_country")
	private WebElement billingCountryField;
	
	@FindBy(name="ship_street")
	private WebElement shippingAddressField;
	
	@FindBy(id="ship_pobox")
	private WebElement shippingPOBoxField;
	
	@FindBy(id="ship_city")
	private WebElement shippingCityField;
	
	@FindBy(id="ship_state")
	private WebElement shippingStateField;
	
	@FindBy(id="ship_code")
	private WebElement shippingPostalCodeField;
	
	@FindBy(name="ship_country")
	private WebElement shippingCountryField;

	//Initializing WebElements for Description Information
	
	@FindBy(name="description")
	private WebElement descriptionTextBox;
	
	@FindBy(xpath="//input[@value='  Save  ']")
	private WebElement saveButton;
	
	@FindBy(xpath="//input[@value='Cancel  ']")
	private WebElement cancelButton;

	public WebElement getOrganizationNameField() {
		return organizationNameField;
	}

	public WebElement getWebsiteField() {
		return websiteField;
	}

	public WebElement getTickerSymbolField() {
		return TickerSymbolField;
	}

	public WebElement getMemberOfDropDown() {
		return MemberOfDropDown;
	}

	public WebElement getEmployeesField() {
		return employeesField;
	}

	public WebElement getOtherEmailField() {
		return otherEmailField;
	}

	public WebElement getIndustryField() {
		return industryField;
	}

	public WebElement getTypeDropDown() {
		return typeDropDown;
	}

	public WebElement getEmailOptOutField() {
		return EmailOptOutField;
	}

	public WebElement getAssignedToUserRadioButton() {
		return assignedToUserRadioButton;
	}

	public WebElement getAssignedToGroupRadioButton() {
		return assignedToGroupRadioButton;
	}

	public WebElement getAssignedToUserDropDown() {
		return assignedToUserDropDown;
	}

	public WebElement getAssignedToGroupDropDown() {
		return assignedToGroupDropDown;
	}

	public WebElement getPhoneField() {
		return PhoneField;
	}

	public WebElement getFaxField() {
		return faxField;
	}

	public WebElement getOtherPhoneField() {
		return otherPhoneField;
	}

	public WebElement getEmailField() {
		return emailField;
	}

	public WebElement getOwnershipField() {
		return ownershipField;
	}

	public WebElement getRatingDropDown() {
		return ratingDropDown;
	}

	public WebElement getSicCodeField() {
		return sicCodeField;
	}

	public WebElement getAnnualRevenueField() {
		return annualRevenueField;
	}

	public WebElement getNotifyOwnerField() {
		return notifyOwnerField;
	}

	public WebElement getCopyShippingAddressRadioButton() {
		return copyShippingAddressRadioButton;
	}

	public WebElement getCopyBillingAddressRadioButton() {
		return CopyBillingAddressRadioButton;
	}

	public WebElement getBillingAddressField() {
		return billingAddressField;
	}

	public WebElement getBillingPOBoxField() {
		return billingPOBoxField;
	}

	public WebElement getBillingCityField() {
		return billingCityField;
	}

	public WebElement getBillingStateField() {
		return billingStateField;
	}

	public WebElement getBillingPostalCodeField() {
		return billingPostalCodeField;
	}

	public WebElement getBillingCountryField() {
		return billingCountryField;
	}

	public WebElement getShippingAddressField() {
		return shippingAddressField;
	}

	public WebElement getShippingPOBoxField() {
		return shippingPOBoxField;
	}

	public WebElement getShippingCityField() {
		return shippingCityField;
	}

	public WebElement getShippingStateField() {
		return shippingStateField;
	}

	public WebElement getShippingPostalCodeField() {
		return shippingPostalCodeField;
	}

	public WebElement getShippingCountryField() {
		return shippingCountryField;
	}

	public WebElement getDescriptionTextBox() {
		return descriptionTextBox;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}
	
	//Business Logic
	
	public void fillBillingAddressField(int dataRow) throws EncryptedDocumentException, IOException {
		billingAddressField.sendKeys(d.FetchExcelFileData("organizationdata", "AddressInformation", dataRow, 1));
		billingPOBoxField.sendKeys(d.FetchExcelFileData("organizationdata", "AddressInformation", dataRow, 2));
		billingCityField.sendKeys(d.FetchExcelFileData("organizationdata", "AddressInformation", dataRow, 3));
		billingStateField.sendKeys(d.FetchExcelFileData("organizationdata", "AddressInformation", dataRow, 4));
		String postalCode= d.FetchExcelFileData("organizationdata", "AddressInformation", dataRow, 5);
		billingPostalCodeField.sendKeys(postalCode);
		billingCountryField.sendKeys(d.FetchExcelFileData("organizationdata", "AddressInformation", dataRow, 6));
	}
	
	public void fillShippingAddressField(int dataRow) throws EncryptedDocumentException, IOException {
		shippingAddressField.sendKeys(d.FetchExcelFileData("organizationdata", "AddressInformation", dataRow, 7));
		shippingPOBoxField.sendKeys(d.FetchExcelFileData("organizationdata", "AddressInformation", dataRow, 8));
		shippingCityField.sendKeys(d.FetchExcelFileData("organizationdata", "AddressInformation", dataRow, 9));
		shippingStateField.sendKeys(d.FetchExcelFileData("organizationdata", "AddressInformation", dataRow, 10));
//		String postalCode = d.FetchExcelFileData("organizationdata", "AddressInformation", dataRow, 11);
//		shippingPostalCodeField.sendKeys(postalCode);
		shippingCountryField.sendKeys(d.FetchExcelFileData("organizationdata", "AddressInformation", dataRow, 12));
	}
	
	public int createOrganization() throws EncryptedDocumentException, IOException {
		String dataRowStatus = "CNC";
		int dataRow = 0 ;
		int totalDataRow = 6;
		for(int row=2 ; row <= totalDataRow ; row++) {
			String value = d.FetchExcelFileData("organizationdata", "OrganizationInformation", row, 0);
			System.out.println(value);
			if(value.equals(dataRowStatus)) {
				dataRow = row;
				break;
			}		
		}
		
		System.out.println("Now the data will fetch from " + dataRow);
		
		organizationNameField.sendKeys(d.FetchExcelFileData("organizationdata", "OrganizationInformation", dataRow, 1));
		websiteField.sendKeys(d.FetchExcelFileData("organizationdata", "OrganizationInformation", dataRow, 2));
//		TickerSymbolField.sendKeys(d.FetchExcelFileData("organizationdata", "OrganizationInformation", dataRow, 3));
		employeesField.sendKeys(d.FetchExcelFileData("organizationdata", "OrganizationInformation", dataRow, 5));
		otherEmailField.sendKeys(d.FetchExcelFileData("organizationdata", "OrganizationInformation", dataRow, 6));
		gm.selectListByValue(industryField, d.FetchExcelFileData("organizationdata", "OrganizationInformation", dataRow, 7));
		gm.selectListByValue(typeDropDown, d.FetchExcelFileData("organizationdata", "OrganizationInformation", dataRow, 8));
		String emailOptOut = d.FetchExcelFileData("organizationdata", "OrganizationInformation", dataRow, 9);
		if(emailOptOut.equals("Yes")) {
			EmailOptOutField.click();
		}
		String assignToRole = d.FetchExcelFileData("organizationdata", "OrganizationInformation", dataRow, 10);
		if (assignToRole.equals("User")) {
			gm.selectListByVisibleText(assignedToUserDropDown, d.FetchExcelFileData("organizationdata", "OrganizationInformation", dataRow, 11));
		}else {
			assignedToGroupRadioButton.click();
			gm.selectListByVisibleText(assignedToGroupDropDown, d.FetchExcelFileData("organizationdata", "OrganizationInformation", dataRow, 12));
		}
		
		PhoneField.sendKeys(d.FetchExcelFileData("organizationdata", "OrganizationInformation", dataRow, 13));
		faxField.sendKeys(d.FetchExcelFileData("organizationdata", "OrganizationInformation", dataRow, 14));
		otherPhoneField.sendKeys(d.FetchExcelFileData("organizationdata", "OrganizationInformation", dataRow, 15));
		emailField.sendKeys(d.FetchExcelFileData("organizationdata", "OrganizationInformation", dataRow, 16));
		ownershipField.sendKeys(d.FetchExcelFileData("organizationdata", "OrganizationInformation", dataRow, 17));
		gm.selectListByValue(ratingDropDown, d.FetchExcelFileData("organizationdata", "OrganizationInformation", dataRow, 18));
		sicCodeField.sendKeys(d.FetchExcelFileData("organizationdata", "OrganizationInformation", dataRow, 19));
		annualRevenueField.sendKeys(d.FetchExcelFileData("organizationdata", "OrganizationInformation", dataRow, 20));
		
		String emailopt = d.FetchExcelFileData("organizationdata", "OrganizationInformation", dataRow, 21);
		if(emailopt.equals("Yes")) {
			notifyOwnerField.click();
		}
		
		String addressCheckBoxValue = d.FetchExcelFileData("organizationdata", "AddressInformation", dataRow, 0);		
		
		if(addressCheckBoxValue.equals("Copy Billing address") ) {
			fillBillingAddressField(dataRow);
			CopyBillingAddressRadioButton.click();
		}else if(addressCheckBoxValue.equals("Copy Shipping address")) {
			fillShippingAddressField(dataRow);
			copyShippingAddressRadioButton.click();
		} else {
			fillBillingAddressField(dataRow);
			fillShippingAddressField(dataRow);
		}

		descriptionTextBox.sendKeys(d.FetchExcelFileData("organizationdata", "DescriptionInformation", dataRow, 0));
		saveButton.click();
		return dataRow;
	}
	

}
