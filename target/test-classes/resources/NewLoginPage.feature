
@HealthDomain1
Feature: Login Functionality of Cura Health Care Service

  Scenario Outline: User Should be able to Login with Valid Creds
    Given User opens the Url of the Application
    And Click on Make Appointment Button
    And User enters the valid username "<Username>"
    And user enters the valid pass"<Password>"
    And Clicks on the Login Button

    Examples: 
      | Username | Password           |
      | John Doe | ThisIsNotAPassword |
      | Pratik | Pratik@123 |
