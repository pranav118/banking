package com.POM.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

		private WebDriver driver;
		 
		@FindBy (xpath="//input[@type='email']")
		private WebElement email;
		
		@FindBy (xpath="//input[@id='continue']")
		private WebElement conti;
		
		@FindBy (xpath="//input[@type='password']")
		private WebElement password;
		
		@FindBy (xpath="//input[@id='signInSubmit']")
		private WebElement signinButton;
		
		public LoginPage(WebDriver driver)
		{	
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		public void email()
		{
			email.sendKeys("7276218149");
		}
		
		public void conti()
		{
			
			Actions action= new Actions(driver);
			action.moveToElement(conti).click().build().perform();
			
		}
		public void password() 
		{
			password.sendKeys("pranav@118");
			
		}
		public void signinButton() {
			Actions act=new Actions(driver);
			act.moveToElement(signinButton).click().build().perform();
		}
		
		
		

}
