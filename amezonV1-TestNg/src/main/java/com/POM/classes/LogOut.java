package com.POM.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOut {
	
	@FindBy	 (xpath="//span[text()='Sign Out']")
	private WebElement SignOut ;
	
	public LogOut(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Logout()
	{
		
		SignOut.click();
	}
	
}

