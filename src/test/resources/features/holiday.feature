#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@BookHotelAndFlights
Feature: Going on a  holiday I want to book flight tickets and a hotel

  @BookHotel
  Scenario: I want to book a hotel
    Given I live in London
    And I want to go on a holiday
    And We are 2 adults
    And We want to book from 10th Aug 2020 to 20th Aug 2020    
    When I go to a travel agent
    And Tell him my budget of 2000£    
    Then He should be able to show me the holiday destination options in my budget
    And He should provide me option to cancel
    But He should not ask for advance more than 300 USD

  #@tag2
  #Scenario Outline: Title of your scenario outline
  #  Given I want to write a step with <name>
  #  When I check for the <value> in step
  #  Then I verify the <status> in step

  #  Examples: 
  #    | name  | value | status  |
  #    | name1 |     5 | success |
  #    | name2 |     7 | Fail    |
