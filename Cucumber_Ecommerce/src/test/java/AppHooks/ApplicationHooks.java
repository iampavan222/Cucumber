package AppHooks;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.qa.factory.DriverFactory;
import com.qa.utils.ConfigReader;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class ApplicationHooks 
{
	private DriverFactory driverfactory;
	private WebDriver driver;
	private ConfigReader configprop;
	private Properties prop;
	
	@Before(order=0)
	//getting the browser name 
	public void getProperty()
	{
		configprop = new ConfigReader();
		prop=configprop.init_prop();	
	}
	//launch the browser is set the browser 
	@Before(order=1)
	public void setBrowser()
	{
		String browsername=prop.getProperty("browser");
		driverfactory = new DriverFactory();
		driver=driverfactory.init_driver(browsername);
	}
	
	@After(order=0)
	public void close()
	{
		driver.close();
	}
	
	@After(order=1)
	public void teardown(Scenario sc)
	{
	if(sc.isFailed()){
		String screenshot=sc.getName().replaceAll(" ", "_");
		byte[] srcpath=((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	}

	}
}
