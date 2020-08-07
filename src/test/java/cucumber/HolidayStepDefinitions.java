package cucumber;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HolidayStepDefinitions {
	
	

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
	public void we_are(int noOfPeople)
	{
		System.out.println("We are "+ noOfPeople +" adults");
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
	
	
	
	
	
	
	
	
	
}
