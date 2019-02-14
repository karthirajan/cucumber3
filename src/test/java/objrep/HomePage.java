package objrep;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepdefinition.Hook;

public class HomePage {
	
	public HomePage() {
	     PageFactory.initElements(Hook.d, this);
	}
	
	
	

}
