package pageFactory;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MakeAppointmentPage {

	WebDriver driver;
	
	public MakeAppointmentPage(WebDriver driver)
	{
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="//select[@id='combo_facility']")
	WebElement facitlity;
	
	@FindBy(xpath="//input[@id='chk_hospotal_readmission']")
	WebElement hospitalReaddmission;
	
	//HelathCare Program//
	@FindBy(xpath="//input[@id='radio_program_medicare']")
	WebElement medicareButton;
	
	@FindBy(xpath="//input[@id='radio_program_medicaid']")
	WebElement mediciadButton;
	
	@FindBy(xpath="//input[@id='radio_program_medicaid']")
	WebElement noneButton;
	
	
	//Vist Date//
	
	@FindBy(xpath="//input[@id='txt_visit_date']")
	WebElement visitDate;
	//
	@FindBy(xpath="//textarea[@id='txt_commentsss']")
	WebElement comments;
	
	@FindBy(xpath="//button[@id='btn-book-appointment']")
	WebElement bookAppointmentButton;
	
	
	
	public void selectFacility()
	{
		Select select = new Select(facitlity);
		select.selectByIndex(2);
	}
	
	
	public void applyForReaddmission()
	{
		hospitalReaddmission.click();
		
	}
	
	//HealthCare Programs Methods//
	
	public void selectMedicare()
	{
		medicareButton.click();
	}
	
	public void selectMediciad()
	{
		mediciadButton.click();
	}
	
	public void selectNone()
	{
		noneButton.click();
	}
	
	public void visitDate(String visit_Date)
	{
		visitDate.sendKeys(visit_Date);
		
	}
	
	public void comments(String Comment)
	{
		comments.sendKeys(Comment);
		
	}
	
	public void clickBookAppointment()
	{
		bookAppointmentButton.click();
		
	}
	
}
