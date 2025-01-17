package stepDefination;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
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
	
	@After
	public void tearDown()
	{
		
		driver.close();
		driver.quit();
	}
	
	
	
	
}
