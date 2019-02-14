package stepdefinition;

import org.junit.Assert;

import cucumber.api.java.en.Then;

import objrep.AccessPage;

public class AcPSteps {
	
	@Then("The user should see the available buses")
	public void the_user_should_see_the_available_buses() {
	   AccessPage ac=new AccessPage();
	   Assert.assertTrue(ac.getIs_disp().isDisplayed());
	}

}
