package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {
	public static WebDriver d;
	@Before
	public static void beforeMethod() {
	    System.setProperty("webdriver.chrome.driver", "C:\\Java\\eclipse-java-luna-SR2-win32-x86_64\\eclipse\\karthi\\cucumber3\\driver\\chromedriver.exe");
	    d=new ChromeDriver();
        
	}
	@After
	public static void afterMethod() {
		d.close();
		d.quit();

	}

}
