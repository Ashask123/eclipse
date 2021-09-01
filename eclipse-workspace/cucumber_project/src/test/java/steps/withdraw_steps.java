package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber_project.cucumber_project.Bank;
import junit.framework.Assert;

public class withdraw_steps {
	Bank bank;
	
	@Given("^I have \"([^\"]*)\" amount in a account$")
	public void i_have_amount_in_a_account(String init) throws Throwable {
		int value= Integer.parseInt(init);
		   bank  = new Bank(value);
	  
	}

	@When("^I withdraw \"([^\"]*)\" amount in my exists account$")
	public void i_withdraw_amount_in_my_exists_account(String draw) throws Throwable {
		int value= Integer.parseInt(draw);
		   bank.withdraw(value);
	
	}

	@Then("^I expect \"([^\"]*)\" amount will have in the account$")
	public void i_expect_amount_will_have_in_the_account(String exp) throws Throwable {
	    
		int expectedAmount= Integer.parseInt(exp);
		   int actualAmount = bank.getBalance();
		   Assert.assertEquals(actualAmount, expectedAmount);
	}

}

