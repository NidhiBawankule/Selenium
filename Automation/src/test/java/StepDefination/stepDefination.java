package StepDefination;
	

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDefination {

    @Given("^User is on netbanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
      System.out.println("User is on netbanking landing page");
    }

    @When("^user login into application with Username and password$")
    public void user_login_into_application_with_username_and_password() throws Throwable {
    	System.out.println("user login");
    }

    @Then("^home is populated$")
    public void home_is_populated() throws Throwable {
    	System.out.println("home is populated");
    }

    @And("^cards are displayed	$")
    public void cards_are_displayed() throws Throwable {
    	System.out.println("cards are displayed");
    }

}