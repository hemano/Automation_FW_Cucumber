package stepDefinition;

import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_Steps {

	public static WebDriver driver=null;
	
	@Given("^User is on Home Page$")
	public void User_is_on_Home_Page() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.newtours.demoaut.com/");
	}

	@When("^User Navigate to LogIn Page$")
	public void User_Navigate_to_LogIn_Page() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		driver.findElement(By.linkText("SIGN-ON")).click();
	}

	@When("^User enters \"(.*)\" and \"(.*)\"$")
	public void User_enters_UserName_and_Password(String userName, String password) throws Throwable {
	    // Express the Regexp above with the code you wish you had
		driver.findElement(By.name("userName")).sendKeys(userName); 	 
	    driver.findElement(By.name("password")).sendKeys(password);
	    driver.findElement(By.name("login")).click();
	}

	@Then("^Home Page Displayed Successfully$")
	public void Home_Page_Displayed_Successfully() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		if(driver.findElement(By.linkText("SIGN-OFF")).isDisplayed()){
			System.out.println("Login Successfully");
		}else{
			Assert.fail("Login Unsuccessful");			
		}
		
		
	}

	@When("^User LogOut from the Application$")
	public void User_LogOut_from_the_Application() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		driver.findElement (By.linkText("SIGN-OFF")).click();
	}

	@Then("^Message displayed LogOut Successfully$")
	public void Message_displayed_LogOut_Successfully() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		System.out.println("LogOut Successfully");
		driver.quit();
	}

}
