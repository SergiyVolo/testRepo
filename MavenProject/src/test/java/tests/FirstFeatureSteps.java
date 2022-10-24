package tests;

import static org.testng.Assert.assertNotEquals;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FirstFeatureSteps {
	@When("I complete action")
	public void i_complete_action() {
	    System.out.println("Hello word");
	}

	@When("some other action")
	public void some_other_action() {
		int num = 5;
	    assertNotEquals(0, num);
	}

	@When("yet another action")
	public void yet_another_action() {
	    
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
	    
	}

	@Then("check more outcomes")
	public void check_more_outcomes() {
	}   

}
