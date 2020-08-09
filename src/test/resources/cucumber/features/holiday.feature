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

Background:
Given I live in London
    And I want to go on a holiday
    And We are 2 adults
    # One dimentional data table is not working becuase of some error Cucumber 3.0 above
    #|Ome|Sri|
    |Adult1|Adult2|
    |Ome   |Sri   |
    |65    |70    |


  @BookHotel
  Scenario: I want to book a hotel
    
    And We want to book a hotel from 11th Aug 2020 to 19th Aug 2020    
    When I go to a travel agent
    And Tell him my budget of 2000 pounds
    Then He should be able to show me the holiday destination options in my budget
    And He should provide me option to cancel
    But He should not ask for advance more than 300 pounds

 @BookFlight
  Scenario: I want to book a flight
   
    And We want to book flight from London from 10th Aug 2020
    And Return Flight on 20th Aug 2020
    When I go to a travel agent
    And Tell him my budget of 1000 pounds
    Then He should be able to show me the flight options in my budget
    And He should provide me option to cancel
    But He should not ask for advance more than 300 pounds
  
