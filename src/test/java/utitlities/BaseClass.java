package utitlities;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.Scenario;

public class BaseClass {

	
	public static WebDriver driver;
	
	public static String browsername;
	
	public static WebDriver initilizeDriver() 	{
		
		
		try {
			browsername= FetchDataFromPropertyFile.getDataFromProperty().getProperty("browser");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(browsername.equalsIgnoreCase("Chrome"))
		{
			 driver = new ChromeDriver();
			 
			// driver.get("https://katalon-demo-cura.herokuapp.com/#appointment");
		
		}
		
		if(browsername.equalsIgnoreCase("Edge"))
		{
			 driver = new EdgeDriver();
			 
			// driver.get("https://katalon-demo-cura.herokuapp.com/#appointment");
		
		}
		
		
		if(browsername.equalsIgnoreCase("FireFox"))
		{
			 driver = new FirefoxDriver();
			 
			// driver.get("https://katalon-demo-cura.herokuapp.com/#appointment");
		
		}
		
		
		
		
		return driver;
		
		
	}
	
	
	public static void maximizeWindow()
	{
		
		driver.manage().window().maximize();
	}
	
	public static void implicitWait()

	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	public static void takesScreenShootOnFailure(Scenario scenario)
	{
		if(scenario.isFailed())
		{
			TakesScreenshot ts = (TakesScreenshot) driver;
			byte [] des = ts.getScreenshotAs(OutputType.BYTES);
			scenario.attach(des, "image/png", "FailedTest");
			
		}
		
	}
	
	
	
	
}
