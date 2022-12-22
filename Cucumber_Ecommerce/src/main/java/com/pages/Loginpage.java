package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage 
{
	private WebDriver driver;
	
	//By locators
	@FindBy(id="email")     
	WebElement id;
	
	private By emailid= By.id("email");
	private By password= By.id("passwd");
	private By button= By.id("submitlogin");
	private By forgotlink=By.id("forgetlink");
	
	//constructor on this page
	public Loginpage(WebDriver driver)
	{
		this.driver= driver;
	}
	
	public String getloginpagetitle()
	{
		return driver.getTitle();
	}
	
	public boolean isforgetlink()
	{
		return driver.findElement(forgotlink).isDisplayed();
	}
	
	public void username(String username)
	{
		driver.findElement(emailid).sendKeys(username);
	}
	public void password(String passwd)
	{
		driver.findElement(password).sendKeys(passwd);
	}
	public void signin()
	{
		driver.findElement(button).click();
	}
	
	

}
