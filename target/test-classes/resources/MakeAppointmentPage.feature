
@HealthDomain
Feature: Fill all Deatils to make a Appiontment

  Background: 
    Given User opens the Url of the Application
    And Click on Make Appointment Button
    And User enters the valid username "John Doe"
    And user enters the valid pass"ThisIsNotAPassword"
    And Clicks on the Login Button

  Scenario Outline: User Should Fill all the Deatils to Book Appointment
    Given Selects the Facilty he wants to visit from Dropdown
    And Click Hospital Readmission CheckBox
    And User Selects the Health Care Program
    And User Selects the Visit Date "<Visit_Date>"
    And User type Appointment details in Comment Section if any "<Comments>"
    Then clicks on the Book Appointment Button

    Examples: 
      | Comments     | Visit_Date |
      | 2D Echo test | 29/01/2025 |