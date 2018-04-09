package pageobjects;
//import helpers.Log;

import cucumber.api.Scenario;
import helpers.Log;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import step_definitions.Hooks;
import step_definitions.Reusable_Functions;
import com.google.common.base.Function;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

//import static com.sun.tools.doclint.Entity.cap;

//public class LoginPage extends BaseClass{

	public class LoginPage {
		public  static WebDriver driver;
		public static WebDriverWait wait = Hooks.wait;




	@FindBy(how=How.XPATH, using="//input[@id='email']")
	public static WebElement Txt_User_Name;
	
	@FindBy(how=How.XPATH, using="//input[@id='pass']")
	//@FindBy(how=How.ID, using="pass")
	public static WebElement Txt_password;
	
	@FindBy(how=How.XPATH, using="//input[@value='Log In']")
	public static WebElement signin_button;

		public static void user_Opens_Prutopia_Application(AppiumDriver driver,Scenario scenario) throws MalformedURLException {

			Assert.assertTrue(true);

		}

		public static void user_should_be_able_to_see_Splash_Screen(AppiumDriver driver,Scenario scenario) {
			Assert.assertTrue(true);
		}

		public static void user_is_navigated_to_Azure_Directory_for_Login(AppiumDriver driver,Scenario scenario) {
			//wait =new WebDriverWait(driver, 20);

			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//XCUIElementTypeOther[@name=\"banner\"]")));
			//wait.until(ExpectedConditions.presenceOfElementLocated(By.id("banner")));

		}

		public static void user_Enters_Username(AppiumDriver driver,Scenario scenario) {
			MobileElement txtEmailID = (MobileElement) driver.findElementByAccessibilityId("Enter your email, phone, or Skype.");
			if (txtEmailID.isDisplayed())
			{
				//txtEmailID.click();
				txtEmailID.setValue("alexmin@monkeyking.onmicrosoft.com");

			}
		}

		public static void user_Clicks_on_Next_Button(AppiumDriver driver,Scenario scenario) {
			MobileElement el1 = (MobileElement) driver.findElementByXPath("(//XCUIElementTypeButton[@name=\"Next\"])[1]");
			//MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Next");
			el1.click();
		}

		public static void user_Enters_Password(AppiumDriver driver,Scenario scenario) {
			//wait =new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//XCUIElementTypeSecureTextField[@name=\"Enter password\"]")));

			MobileElement el2 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeSecureTextField[@name=\"Enter password\"]");
			el2.sendKeys("Muyu49851");
		}

		public static void user_Clicks_on_Sign_in_Button(AppiumDriver driver,Scenario scenario) {
			MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("Sign in");
			el3.click();
		}

		public static void user_is_Navigated_to_Home_Page_of_the_Application(AppiumDriver driver,Scenario scenario) {
			//wait =new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.attributeContains(By.xpath("//XCUIElementTypeStaticText[@name=\"navBarTitle\"]"),"value","News"));
		}

		public static void elements_in_Home_Page_are_Validated(AppiumDriver driver,Scenario scenario) {
			MobileElement txtMessage1 = (MobileElement) driver.findElementByAccessibilityId("Message from Wilf");
			Assert.assertTrue(txtMessage1.getText().contains("Message from Wilf"));
			MobileElement txtMessageInterior1 = (MobileElement) driver.findElementByAccessibilityId("Thank you for your commitment in 2017");
			Assert.assertTrue(txtMessageInterior1.getText().contains("Thank you for your commitment in 2017"));



			MobileElement txtMessage2 = (MobileElement) driver.findElementByAccessibilityId("Message from Wilf");


			Assert.assertTrue(txtMessage2.getText().contains("Message from Wilf"));
			MobileElement txtMessageInterior2 = (MobileElement) driver.findElementByAccessibilityId("Thank you for your commitment in 2017");
			Assert.assertTrue(txtMessageInterior2.getText().contains("Thank you for your commitment in 2017"));
}

		public static void user_Clicks_on_the_Chat_Icon_at_Bottom_of_Home_Page(AppiumDriver driver,Scenario scenario) throws MalformedURLException {


			System.out.println("******** user_Clicks_on_the_Chat_Icon_at_Bottom_of_Home_Page");//(//XCUIElementTypeOther[@name="4.pruTopia.NewsScreen"])[6]
			MobileElement el2 = (MobileElement) driver.findElementByXPath("(//XCUIElementTypeOther[@name=\"4.pruTopia.NewsScreen\"])[6]");
			el2.click();
		}

		public static void user_is_navigated_to_the_Chat_Page_of_the_Application(AppiumDriver driver,Scenario scenario) {
			//wait =new WebDriverWait(driver, 20);                    //
			MobileElement txttitle = (MobileElement) driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"navBarTitle\"]");

			wait.until(ExpectedConditions.attributeContains(By.xpath("//XCUIElementTypeStaticText[@name=\"navBarTitle\"]"),"value","Chat"));

		}




}
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
