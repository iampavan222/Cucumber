
@tag
Feature: Login Page Feature
  I want to use this template for my Login Page feature file

  @tag1
  Scenario: Login page Title
    Given User is on login page
    When user gets the title of the page
    Then page title should be "Login - My Store"

  @tag2
  Scenario: Forget password link
    Given User is on login page
    Then forget password link should be displayed
  
  @tag3
    Scenario: Login with valid credentials
    Given User is on login page
    When User enters the username "naveenanimation20@gmail.com"
    And user enters the password "Selenium12345"
    And user click the login button 
    Then user gets see title of the page
    And page title should be "My Account"
