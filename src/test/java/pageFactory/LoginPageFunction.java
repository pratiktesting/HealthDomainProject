package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utitlities.BaseClass;

public class LoginPageFunction extends BaseClass{
	
	WebDriver driver;
	
	
	public LoginPageFunction(WebDriver driver)
	
	{
		
	 this.driver=driver;	
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[@id='btn-make-appointment']")
	WebElement MakeAppointment;
	
	@FindBy(xpath = "//input[@id='txt-username']")
	WebElement UserName;
	
	
	@FindBy(xpath = "//input[@id='txt-password']")
	WebElement PassWord;
	
	
	@FindBy(xpath = "//button[@id='btn-login']")
	WebElement LoiginButton ;
	
	
	public void makeAppointment()
	
	{
		MakeAppointment.click();
		
	}
	
	
	public void enterUsername(String Username)
	{
		
		UserName.sendKeys(Username);
		
	}
	
	
	public void enterPasword(String Password)
	
	{
		
		PassWord.sendKeys(Password);
	}
	
	public void clickLogin()
	{
		LoiginButton.click();
		
	}

}
