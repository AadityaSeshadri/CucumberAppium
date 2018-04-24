package pageobjects;
//import helpers.Log;

import cucumber.api.Scenario;
import helpers.Log;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
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
import java.util.concurrent.TimeUnit;

//import static com.sun.tools.doclint.Entity.cap;

//public class LoginPage extends BaseClass{

	public class LoginPage {
	    //*********Variable Declarations*******************************
		public   WebDriver driver;
		public  WebDriverWait wait ;

        //*********Page Elements***************************************
							//XCUIElementTypeStaticText[@name=\"LOG IN USING YOUR PRUDENTIAL CREDENTIALS\"]
		@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"LOG IN USING YOUR PRUDENTIAL CREDENTIALS\"]")
	    public  MobileElement Lbl_Login_Text;

		@iOSFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Next\"])[2]")
		public  MobileElement Btn_Login;

		@iOSFindBy(accessibility = "Use another account, Use another account")
		public  MobileElement Btn_Use_AnotherAccount;

		@iOSFindBy(accessibility = "Enter your email, phone, or Skype.")
		public  MobileElement Txt_Email;

		@iOSFindBy(xpath = "(//XCUIElementTypeButton[@name=\"Next\"])[1]")
		public  MobileElement Btn_Next;

		@iOSFindBy(xpath = "//XCUIElementTypeSecureTextField[@name=\"Enter password\"]")
		public  MobileElement Txt_Password;

		@iOSFindBy(accessibility = "Sign in")
		public  MobileElement Btn_SignIn;

        @iOSFindBy(accessibility = "Your account or password is incorrect. If you don't remember your password,")
        public  MobileElement Lbl_ErrorMessage;


		@iOSFindBy(accessibility = "navBarTitle")
		public  MobileElement Txt_PageTitle;

		@iOSFindBy(accessibility = "Message from Wilf")
		public  MobileElement Txt_Blk1_Mss1;

		@iOSFindBy(accessibility = "Thank you for your commitment in 2017")
		public  MobileElement Txt_Blk1_Mss2;

		@iOSFindBy(xpath = "(//XCUIElementTypeOther[@name=\"4.pruTopia.NewsScreen\"])[6]")
		public  MobileElement Icon_Chat;

		public LoginPage()
		{
			driver = Hooks.driver;
			wait = Hooks.wait;
			PageFactory.initElements(new AppiumFieldDecorator(driver, 15, TimeUnit.SECONDS), this);
		}
        //*********Page Methods***************************************
		public  void user_is_navigated_to_Azure_Directory_for_Login(AppiumDriver driver,Scenario scenario) throws InterruptedException {
//Thread.sleep(7000);
wait.until(ExpectedConditions.visibilityOf(Lbl_Login_Text));
           // wait.until(ExpectedConditions.elementToBeClickable(Lbl_Login_Text));
			//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//XCUIElementTypeOther[@name=\"LOG IN USING YOUR PRUDENTIAL CREDENTIALS\"]/XCUIElementTypeOther"))));

			Assert.assertTrue(Lbl_Login_Text.getAttribute("value").contains("LOG IN USING YOUR PRUDENTIAL CREDENTIALS"));
			System.out.println("************user_is_navigated_to_Azure_Directory_for_Login*************");
			Btn_Login.click();
			wait.until(ExpectedConditions.elementToBeClickable(Btn_Use_AnotherAccount));
			Btn_Use_AnotherAccount.click();
		}

		public  void user_Enters_Username(AppiumDriver driver,Scenario scenario,String Uname) {
	/*		if (Txt_Email.isDisplayed())
			{*/
				Txt_Email.sendKeys(Uname);
			//}
		}

		public  void user_Clicks_on_Next_Button(AppiumDriver driver,Scenario scenario) {
		    Btn_Next.click();
		}

		public  void user_Enters_Password(AppiumDriver driver,Scenario scenario,String Pwd) {
            //System.out.println("Pwd" + Pwd);
            wait.until(ExpectedConditions.elementToBeClickable(Txt_Password));
			Txt_Password.setValue(Pwd);
		}

		public  void user_Clicks_on_Sign_in_Button(AppiumDriver driver,Scenario scenario) {
            Btn_SignIn.click();
		}

		public  void user_is_Navigated_to_Home_Page_of_the_Application(AppiumDriver driver,Scenario scenario) {
            wait.until(ExpectedConditions.attributeContains(Txt_PageTitle,"value","PRUtopia"));
		}

		public  void elements_in_Home_Page_are_Validated(AppiumDriver driver,Scenario scenario) {
            Assert.assertTrue(Txt_Blk1_Mss1.getText().contains("Message from Wilf"));
			Assert.assertTrue(Txt_Blk1_Mss2.getText().contains("Thank you for your commitment in 2017"));

            }
		public  void user_Clicks_on_the_Chat_Icon_at_Bottom_of_Home_Page(AppiumDriver driver,Scenario scenario) throws MalformedURLException {

			Icon_Chat.click();
		}

		public  void user_is_navigated_to_the_Chat_Page_of_the_Application(AppiumDriver driver,Scenario scenario) {

		    wait.until(ExpectedConditions.attributeContains(Txt_PageTitle,"value","Chat"));
			//System.out.println("Finished user_is_navigated_to_the_Chat_Page_of_the_Application");

		}

        public void User_is_able_to_see_Login_Error_Message(AppiumDriver driver, Scenario scenario)
        {
                    wait.until(ExpectedConditions.visibilityOf(Lbl_ErrorMessage));
                    Assert.assertTrue(Lbl_ErrorMessage.getText().contains("Your account or password is incorrect. If you don't remember your password,"));
        }
    }
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
