package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber_project.cucumber_project.Bank;
import junit.framework.Assert;

public class deposite_steps {
	Bank bank;
	@Given("^I have \"([^\"]*)\" amount in my account$")
	public void i_have_amount_in_my_account(String init) throws Throwable {
	   int value= Integer.parseInt(init);
	   bank  = new Bank(value); 
	}

	@When("^I deposite \"([^\"]*)\" amont in my exists account$")
	public void i_deposite_amont_in_my_exists_account(String depo) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		   int value= Integer.parseInt(depo);
		   bank.deposit(value);
	}

	@Then("^I expect \"([^\"]*)\" amount will have in my account$")
	public void i_expect_amount_will_have_in_my_account(String exp) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	
		   int expectedAmount= Integer.parseInt(exp);
		   int actualAmount = bank.getBalance();
		   Assert.assertEquals(actualAmount, expectedAmount);

	}
	
	
}
