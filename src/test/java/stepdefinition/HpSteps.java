package stepdefinition;

import cucumber.api.java.en.Given;
import objrep.HomePage;

public class HpSteps {
	

@Given("The user is in home page")
public void the_user_is_in_home_page() {
    HomePage hp=new HomePage();
    Hook.d.get("https://www.abhibus.com/");
}


}
