package StepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class Step_Definitions {

	
		@Given("User is on Net Banking Landing page")
	    public void user_is_on_net_banking_landing_page() throws Throwable {
			
			System.out.printf("Given passed");   
	    }

	    @When("User login into application with username and password")
	    public void user_login_into_application_with_username_and_password() throws Throwable {
	    	System.out.printf("When passed");   
	        
	    }

	    @Then("Homepage is dispalyed")
	    public void homepage_is_dispalyed() throws Throwable {
	    	System.out.printf("Then passed");   
	        
	    }

	    @And("Cards are displayed")
	    public void cards_are_displayed() throws Throwable {
	    	System.out.printf("And passed");   
	        
	

	}

}
