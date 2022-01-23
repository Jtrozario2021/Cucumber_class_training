package Stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination {
	@Given("Already opened the amazon home page")
	public void already_opened_the_amazon_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("I click on the signin button")
	public void i_click_on_the_signin_button() {
	    // Write code here that turns the phrase above into concrete actions
	}  

	@Then("I seen the Email field")
	public void i_seen_the_email_field() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("I entered email id as {string}")
	public void i_entered_email_id_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("this is email getting from feature " +string);
	}

	@When("Clicked on the continue button")
	public void clicked_on_the_continue_button() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("I seen password field")
	public void i_seen_password_field() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("I entered correct password {string}")
	public void i_entered_correct_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("this is password from feature" +string);
	}

	@When("clicked on signin button")
	public void clicked_on_signin_button() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("I signed in successfully")
	public void i_signed_in_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
}
