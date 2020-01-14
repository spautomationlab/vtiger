package com.vtiger.genericLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GeneralMethod extends BaseClass{
	
	public void selectListByValue(WebElement x,String value) {
		Select s = new Select(x);
		s.selectByValue(value);
	}
	
	public void selectListByVisibleText(WebElement x,String value) {
		Select s = new Select(x);
		s.selectByVisibleText(value);
	}
}
