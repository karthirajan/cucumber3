package objrep;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepdefinition.Hook;

public class ActionPage {
	
	public ActionPage() {
	     PageFactory.initElements(Hook.d, this);
	}
	
	@FindBy(id="source")
	private WebElement txt_src;
	
	@FindBy(id="destination")
	private WebElement txt_dest;
	
	@FindBy(id="datepicker1")
	private WebElement btn_date;
	
	@FindBy(xpath="//h4[text()='Today']")
	private WebElement btn_clk;
	
	@FindBy(xpath="//a[text()='Search']")
	private WebElement btn_srch;

	public WebElement getTxt_src() {
		return txt_src;
	}

	public WebElement getTxt_dest() {
		return txt_dest;
	}

	public WebElement getBtn_date() {
		return btn_date;
	}

	public WebElement getBtn_clk() {
		return btn_clk;
	}

	public WebElement getBtn_srch() {
		return btn_srch;
	}

	
	

}
