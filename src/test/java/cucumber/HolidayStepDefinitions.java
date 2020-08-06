package cucumber;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HolidayStepDefinitions {

	@Given("I live in London")
	public void i_live_in ()
	{
		System.out.println("I live in London");
	}
	@And("I want to go on a holiday")
	public void i_want ()
	{
		System.out.println("I want to go on a holiday");
	}
	@And("We are 2 adults")
	public void we_are()
	{
		System.out.println("We are 2 adults");
	}
    @And("We want to book from 10th Aug 2020 to 20th Aug 2020")    
    public void book_dates()
    {
		System.out.println("We want to book from 10th Aug 2020 to 20th Aug 2020");
	}
    @When("I go to a travel agent")
    public void i_go()
    {
		System.out.println("I go to a travel agent");
	}
    @And("Tell him my budget of 2000pounds")
    public void mybudget()
    {
		System.out.println("Tell him my budget of 2000£");
	}
    @Then("He should be able to show me the holiday destination options in my budget")
    public void he_should()
    {
		System.out.println("He should be able to show me the holiday destination options in my budget");
	}
    @And("He should provide me option to cancel")
    public void cancel()
    {
		System.out.println("He should provide me option to cancel");
	}
    @But("He should not ask for advance more than 300 USD")
    public void he_should_not()
    {
		System.out.println("He should not ask for advance more than 300 USD");
	}
	
	
	
	
	
	
	
	
	
}
