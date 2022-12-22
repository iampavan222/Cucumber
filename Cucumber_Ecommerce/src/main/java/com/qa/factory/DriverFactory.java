package com.qa.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverFactory 
{
	public static WebDriver driver;
	public static ThreadLocal<WebDriver> tldriver= new ThreadLocal<WebDriver>(); 
	
	public WebDriver init_driver(String browser)
	{
	   System.out.println("browser value is"+browser);
	   if(browser.equals("chrome"))
	   {
		   System.setProperty("webdriver.driver.chrome", "chromedriver.exe");
		   tldriver.set(new ChromeDriver());   
	   }
	   else if(browser.equals("firefox"))  
	   {
		   System.setProperty("webdriver.driver.gecko", "geckodriver.exe");
		   tldriver.set(new FirefoxDriver());   
	   }
	   else if(browser.equals("edge"))
	   {
		   System.setProperty("webdriver.driver.edge", "edgedriver.exe");
		   tldriver.set(new EdgeDriver());   
	   }
	   else if(browser.equals("safari"))
	   {
		   System.setProperty("webdriver.driver.safari", "safaridriver.exe");
		   tldriver.set(new SafariDriver());   
	   }
	   else
	   {
		   System.out.println("please pass the valid browser name" +browser);
	   }
	   getdriver().manage().deleteAllCookies();
	   getdriver().manage().window().maximize();
	   return getdriver(); 
	
	}
	
	public static synchronized WebDriver getdriver()
	{
		return tldriver.get();
	}

}
