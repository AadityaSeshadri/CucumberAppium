package pageobjects;
//import helpers.Log;

//import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane;
import cucumber.api.Scenario;
import helpers.Log;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import step_definitions.Hooks;

import java.util.logging.Logger;

//public class HomePage extends BaseClass{
	public class HomePage {

	private static Logger logger;
	//Logger logger ;
	WebDriver driver = Hooks.driver;

	/*public HomePage(WebDriver driver){
		super(driver);
	}*/

	//****************Place required to change when xpath or property changes
	@FindBy(how=How.XPATH, using="//a[@class='_2s25']")
	public static WebElement Lnk_Home;
	//****************Place required to change when xpath or property changes


	public static void check_HomePage()
	{
		if (Lnk_Home.isDisplayed())
		{
			//Log.info("hi`");
			Log.info("Home page displayed");
		}
		else
		{
			Log.info("Home page not displayed");
		}
		Lnk_Home.isDisplayed();
		//logger = Logger.getLogger("devpinoyLogger");
		//logg
	}
	
}
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	