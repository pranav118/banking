package com.Test.claases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.POM.classes.HomePage;
import com.POM.classes.LoginPage;

public class Test_Login_Page {
	
	WebDriver driver;
	
	@BeforeTest
	public  void LaunchBrower(){
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pranav\\Desktop\\chromedriver.exe");
	
	driver = new ChromeDriver();  // Upcasting 
	}
	
	@BeforeClass
	public void LaunchURL() {
		driver.get("https://www.amazon.in");
		
	}
	
	@BeforeMethod
	public void brower() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@Test
	public void validateLoginPage(){
		HomePage signin=new HomePage(driver);
		signin.Signin();
		
	    LoginPage signIn=new LoginPage(driver);
		signIn.email();
		signIn.conti();
		signIn.password();
		signIn.signinButton();
	}
	
	@AfterMethod
	public void LogOut() {
		
		com.POM.classes.LogOut logout=new com.POM.classes.LogOut(driver);
		logout.Logout();
	}
	
	@AfterClass
	public void closebroswer()
	{
		driver.close();
	}
	
	
	

}
