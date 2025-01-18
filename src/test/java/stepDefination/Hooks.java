package stepDefination;

import java.io.File;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.mongodb.MapReduceCommand.OutputType;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import utitlities.BaseClass;

public class Hooks extends BaseClass {



	@Before
	public void initialSetup()
	{
		
		WebDriver driver= BaseClass.initilizeDriver();
		BaseClass.maximizeWindow();
		driver.manage().deleteAllCookies();
		BaseClass.implicitWait();
		
	}
	
	
	
	@After(order=0)
	public void tearDown()
	{
		

	//	takesScreenShootOnFailure(null);
		driver.close();
		driver.quit();
	}
	
	@After(order=1)
	
	public void ss(Scenario Scenario)
	{
		
		takesScreenShootOnFailure(Scenario );
	}
	
	

}
