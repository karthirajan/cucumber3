package stepdefinition;

import cucumber.api.java.en.When;
import objrep.ActionPage;

public class ApSteps {
	

@When("The user enters the boarding and destination point{string},{string}")
public void the_user_enters_the_boarding_and_destination_point(String from, String to) {
	ActionPage ac=new ActionPage();
	ac.getTxt_src().sendKeys(from);
	ac.getTxt_dest().sendKeys(to);
	ac.getBtn_date().click();
	ac.getBtn_clk().click();
	
    
}

@When("The user submits the search")
public void the_user_submits_the_search() {
	ActionPage ac=new ActionPage();
    ac.getBtn_srch().click();
    
}


}
