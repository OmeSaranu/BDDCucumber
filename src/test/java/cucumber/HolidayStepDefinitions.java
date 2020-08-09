package cucumber;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.*;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HolidayStepDefinitions {
	
@Before
public void beforeScenario()
{
	System.out.println("-----------Before execution-------------");
	
}

@After
public void afterScenario()
{
	System.out.println("-----------After execution-------------");
	
}

//start and end symbols ^ $
//passing values from scenario
//[a-zA-Z]{1,} - any number of alphabets  kahsjhd HJAHUAU  AHAHhshsjsjsh
//\\d+ - any number of digits  1  123  53333
//[a-zA-Z0-9]{1,} alpha numeric
//(.*) - list
//[^\"]* anything

	@Given("^I live in ([a-zA-Z]{1,})$")
	public void i_live_in (String cityName)
	{
		System.out.println("I live in " + cityName);
	}
	@And("^I want to go on a holiday$")
	public void i_want ()
	{
		System.out.println("I want to go on a holiday");
	}
	@And("^We are (\\d+) adults$")
	//public void we_are(int noOfPeople, List<String>names)
	public void we_are(int noOfPeople, List<Map<String,String>> names)
	{
		System.out.println("We are "+ noOfPeople +" adults "+ names.toString());
	}
    @And("^We want to book from ([^\"]*) to ([^\"]*)$")    
    public void book_dates(String fromDate, String toDate)
    {
		System.out.println("We want to book from " +fromDate+ " to "+toDate);
	}
    @When("^I go to a travel agent$")
    public void i_go()
    {
		System.out.println("I go to a travel agent");
	}
    @And("^Tell him my budget of (\\d+) pounds$")
    public void mybudget(double budget)
    {
		System.out.println("Tell him my budget of "+ budget+ "£");
	}
    @Then("^He should be able to show me the holiday destination options in my budget$")
    public void he_should()
    {
		System.out.println("He should be able to show me the holiday destination options in my budget");
	}
    @And("^He should provide me option to cancel$")
    public void cancel()
    {
		System.out.println("He should provide me option to cancel");
	}
    @But("^He should not ask for advance more than (\\d+) pounds")
    public void he_should_not(double advance)
    {
		System.out.println("He should not ask for advance more than "+ advance+ "£");
	}
	
    @And("^We want to book flight from ([a-zA-Z]{1,}) from ([^\"]*)$")
    public void bookFlightFromandDest(String destination, String fromDate)
    {
		System.out.println("We want to book flight from "+ destination + " from "+ fromDate);
	}
    @And("Return Flight on ([^\"]*)$")
    public void bookFlighttoDate(String toDate)
    {
		System.out.println("And Return Flight on "+ toDate);
	}
    @Then("^He should be able to show me the flight options in my budget$")
    public void he_should_show()
    {
		System.out.println("He should be able to show me the flight options in my budget");
	}
	
	
	
	
	
	
}
