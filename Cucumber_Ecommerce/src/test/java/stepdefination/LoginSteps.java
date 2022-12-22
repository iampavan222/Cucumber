package stepdefination;

import org.junit.Assert;

import com.pages.Loginpage;
import com.qa.factory.DriverFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps 
{
	private String title;
	
	private Loginpage lp = new Loginpage(DriverFactory.getdriver() );
	@Given("^User is on login page$")
	public void user_is_on_login_page() throws Throwable 
	{
		DriverFactory.getdriver().get("http://www.automationpractise.com");
		
	}

	@When("^user gets the title of the page$")
	public void user_gets_the_title_of_the_page() throws Throwable {
		title=lp.getloginpagetitle();
		System.out.println("title of the page::"+title);
	}

	@Then("^page title should be \"([^\"]*)\"$")
	public void page_title_should_be(String exptitle) throws Throwable 
	{
		title=lp.getloginpagetitle();
		System.out.println(title);
		Assert.assertTrue(title.contains(exptitle)); 
	}

	@Then("^forget password link should be displayed$")
	public void forget_password_link_should_be_displayed() throws Throwable 
	{
	  Assert.assertTrue(lp.isforgetlink());  
	}

	@When("^User enters the username \"([^\"]*)\"$")
	public void user_enters_the_username(String username) throws Throwable 
	{
	  lp.username(username);
	}

	@When("^user enters the password \"([^\"]*)\"$")
	public void user_enters_the_password(String password) throws Throwable 
	{
	  lp.password(password); 
	}

	@When("^user click the login button$")
	public void user_click_the_login_button() throws Throwable 
	{
	 lp.signin(); 
	}



}
