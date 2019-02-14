package objrep;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepdefinition.Hook;

public class AccessPage {
	
	public AccessPage() {
	     PageFactory.initElements(Hook.d, this);
	}
	
	@FindBy(xpath="//div[@class='topHeader wrap']")
	private WebElement is_disp;

	public WebElement getIs_disp() {
		return is_disp;
	}
	

}
