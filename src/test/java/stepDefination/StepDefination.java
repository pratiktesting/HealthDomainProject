package stepDefination;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageFactory.LoginPageFunction;
import pageFactory.MakeAppointmentPage;
import utitlities.BaseClass;

public class StepDefination extends BaseClass {

	//WebDriver driver= BaseClass.initilizeDriver();
	
	LoginPageFunction obj1 = new LoginPageFunction(driver);
	MakeAppointmentPage obj2 = new MakeAppointmentPage(driver);
	
	
	
	
	//New Login Page
	@Given("User opens the Url of the Application")
	public void user_opens_the_url_of_the_application() {
		driver.get("https://katalon-demo-cura.herokuapp.com/#appointment");
		
		//BaseClass.maximizeWindow();
	//	driver.manage().deleteAllCookies();
		//BaseClass.implicitWait();
	}

	@Given("Click on Make Appointment Button")
	public void click_on_make_appointment_button() {
	  obj1.makeAppointment();
	}

	@Given("User enters the valid username {string}")
	public void user_enters_the_valid_username(String Username) 
	{

		obj1.enterUsername(Username);
	}

	@Given("user enters the valid pass{string}")
	public void user_enters_the_valid_pass_this_is_not_a_password(String Password) {
	
		obj1.enterPasword(Password);
	}

	@Given("Clicks on the Login Button")
	public void clicks_on_the_login_button() {
	
		obj1.clickLogin();
	}


	//MakeAppointmentPage//
	

@Given("Selects the Facilty he wants to visit from Dropdown")
public void selects_the_facilty_he_wants_to_visit_from_dropdown() {
  
	obj2.selectFacility();
}

@Given("Click Hospital Readmission CheckBox")
public void click_hospital_readmission_check_box() {
    
	obj2.applyForReaddmission();
}

@Given("User Selects the Health Care Program")
public void user_selects_the_health_care_program() {

	obj2.selectMedicare();
}

@Given("User Selects the Visit Date {string}")
public void user_selects_the_visit_date(String Visit_Date) {
    
	obj2.visitDate(Visit_Date);
	
}

@Given("User type Appointment details in Comment Section if any {string}")
public void user_type_appointment_details_in_comment_section_if_any(String Comments) {
    
	obj2.comments(Comments);;
}

@Then("clicks on the Book Appointment Button")
public void clicks_on_the_book_appointment_button() {
   
	obj2.clickBookAppointment();
}

	
	
}
