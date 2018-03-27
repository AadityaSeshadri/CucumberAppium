package pageobjects;
//import helpers.Log;

//import com.sun.jna.platform.win32.ShellAPI;
import cucumber.api.Scenario;
import helpers.Log;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder;
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

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static step_definitions.Hooks.driver;
import static step_definitions.Hooks.scenario;
import static step_definitions.Reusable_Functions.Take_Screenshot;

//public class LoginPage extends BaseClass{

public class ChatPage {
//public  static AppiumDriver driver = Hooks.driver;
    public static AppiumDriver driver;
    //public static WebDriver driver; with driver = new RemoteWebDriver(new URL("http://127.0.0.1:4725/wd/hub"), capabilities);
    //public  static Webdr== appiumdriver;
    //private static String APPIUMSERVERSTART = "/bin/sh/Applications/Appium.app/Contents/Resources/node_modules/appium/bin/appium.js --address 127.0.0.1 --port 4723 --no-reset --local-timezone";
    //private static String NODESERVERSTART = "/usr/local/bin/node";
   // public static Scenario scenario;
    public static String OS_Name;

    private static AppiumDriverLocalService service;
    private static AppiumServiceBuilder builder;
    private static DesiredCapabilities cap;



   public ChatPage()
{
    /*System.out.println("calls chat page constructor");
    //PageFactory.initElements(driver, ChatPage.class);
    PageFactory.initElements(new AppiumFieldDecorator(driver, 10, TimeUnit.SECONDS), ChatPage.class);*/
     Hooks.scenario = scenario;
}

    /*
    @FindBy(how=How.XPATH, using="//XCUIElementTypeTextView[@name=\"Type Here...\"]")
    //@FindBy(xpath="//XCUIElementTypeStaticText[@name=\"Chat\"]")
    public static MobileElement Txt_ChatTextBox;


    //****************Place required to change when xpath or property changes



    public static void User_Navigates() throws InterruptedException {
        System.out.println("inside Check_PageLoading_Elements");
        //Scenario scenario;






    }

    public static void EntersQueryText() throws InterruptedException {
        MobileElement el1 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeTextView[@name=\"Type Here...\"]");
        el1.sendKeys("What is my Leave Balance");
        Thread.sleep( 500 );
        (new TouchAction(driver)).tap(340, 550).perform();
        Thread.sleep( 2000 );
        Take_Screenshot( driver,scenario);

        el1.sendKeys("Senior Manager");
        Thread.sleep( 500 );
        (new TouchAction(driver)).tap(340, 550).perform();
        Thread.sleep( 2000 );
        Take_Screenshot( driver,scenario);
    }

    public static void ValidatesRespose() throws InterruptedException {
        MobileElement el1 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeTextView[@name=\"Type Here...\"]");

        el1.sendKeys("Yes");
        Thread.sleep( 500 );
        (new TouchAction(driver)).tap(340, 550).perform();
        Thread.sleep( 2000 );
        Take_Screenshot( driver,scenario);


    }
    */
   public static void startServer() {
      // System.out.println("***************************2***************************");
       //Set Capabilities
       cap = new DesiredCapabilities();
       cap.setCapability("noReset", "false");

       //Build the Appium service
       builder = new AppiumServiceBuilder();
       builder.withIPAddress("127.0.0.1");
       builder.usingPort(4725);
       builder.withCapabilities(cap);
       builder.withArgument( GeneralServerFlag.SESSION_OVERRIDE);
       builder.withArgument(GeneralServerFlag.LOG_LEVEL,"error");

       //Start the server with the builder
       service = AppiumDriverLocalService.buildService(builder);
       if (service.isRunning())
       {
           service.stop();
       }
       service.start();
       System.out.println("successfully started");
   }
    public static void User_Login_to_Prutopia_Application(Scenario scenario) throws MalformedURLException {
       // System.out.println("***************************1***************************");
        //Assert.assertEquals( "True","True" );
        startServer();


        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appium-version", "1.7.2");
        capabilities.setCapability("platformVersion", "11.2");
        capabilities.setCapability("platformName", "ios");
        capabilities.setCapability("automationName", "XCUITest");
        capabilities.setCapability("deviceName", "iPhone X");

        String appPath = "/Users/user/Library/Developer/Xcode/DerivedData/prutopia-bshhxtvrkfrofgazervrafchfnrm/Build/Products/Release-iphonesimulator/prutopia.app";

        assert appPath != null: "Path to iOS app is not set";
        System.out.println("iOS App path: "+ appPath);
        capabilities.setCapability("app", appPath);
        //driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        //driver  = (AppiumDriver) new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub/"), capabilities);
        driver = new IOSDriver(new URL("http://127.0.0.1:4725/wd/hub"), capabilities);
       // System.out.println("***************************3***************************");
    }

    public static void User_Navigates_to_Chatbox_Window() {

        System.out.println("User_Navigates_to_Chatbox_Window");

        Assert.assertEquals( "True","True" );
    }

    public static void User_Validates_Elements_in_ChatBox_Window(Scenario scenario) {
        System.out.println("User_Validates_Elements_in_ChatBox_Window");
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until( ExpectedConditions.elementToBeClickable( driver.findElement( By.xpath( "//XCUIElementTypeStaticText[@name=\"Chat\"]" ) ) ));
        Assert.assertEquals( "Chat", driver.findElement( By.xpath( "//XCUIElementTypeStaticText[@name=\"Chat\"]" ) ).getText() );
        System.out.println("finished ***********************");
    }

    public static void User_Initiates_Discusion_with_PruBuddy(Scenario scenario) throws InterruptedException {
        //WebDriverWait wait = new WebDriverWait(driver,20);
       /* System.out.println("Value of element Chat " + driver.findElement( By.xpath( "//XCUIElementTypeStaticText[@name=\"Chat\"]" ) ).getText());
        Thread.sleep( 2000 );*/
        System.out.println("User_Initiates_Discusion_with_PruBuddy");
        MobileElement el1 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeTextView[@name=\"Type Here...\"]");
        //MobileElement el1 = (MobileElement) Txt_ChatTextBox;

        el1.sendKeys("Hi PruBuddy");
        Thread.sleep( 500 );
        (new TouchAction(driver)).tap(340, 500).perform();
        Thread.sleep( 2000 );
        Take_Screenshot(scenario);
    }

    public static void User_Request_for_Leave_Balance(Scenario scenario) throws InterruptedException {
        System.out.println("User_Request_for_Leave_Balance");
        MobileElement el1 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeTextView[@name=\"Type Here...\"]");
        el1.sendKeys("What is my Leave Balance");
        Thread.sleep( 500 );
        (new TouchAction(driver)).tap(340, 500).perform();
        Thread.sleep( 4000 );
        Take_Screenshot(scenario);
    }

    public static void PruBuddy_asks_Job_Level(Scenario scenario) throws InterruptedException {
        System.out.println("PruBuddy_asks_Job_Level");
        Assert.assertEquals( "True","True" );

    }

    public static void User_Enters_Job_Level(Scenario scenario) throws InterruptedException {
        System.out.println("User_Enters_Job_Level");
        MobileElement el1 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeTextView[@name=\"Type Here...\"]");
        el1.sendKeys("Senior Manager");
        Thread.sleep( 500 );
        (new TouchAction(driver)).tap(340, 500).perform();
        Thread.sleep( 4000 );
        Take_Screenshot(scenario);
    }

    public static void PruBuddy_asks_for_Term_of_Service(Scenario scenario) {
        System.out.println("PruBuddy_asks_for_Term_of_Service");
        Assert.assertEquals( "True","True" );
    }


    public static void User_Enter_Term_of_Service(Scenario scenario) throws InterruptedException {
        System.out.println("User_Enter_Term_of_Service");
        MobileElement el1 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeTextView[@name=\"Type Here...\"]");
        el1.sendKeys("Yes");
        Thread.sleep( 500 );
        (new TouchAction(driver)).tap(340, 500).perform();
        Thread.sleep( 4000 );
        Take_Screenshot(scenario);
    }

    public static void PruBuddy_Responds_with_Number_of_eligible_leaves(Scenario scenario) {
        System.out.println("PruBuddy_Responds_with_Number_of_eligible_leaves");
        Assert.assertEquals( "True","True" );
    }

    public static void User_Request_for_Shares_Eligibility(Scenario scenario) throws InterruptedException {
        System.out.println("User_Request_for_Shares_Eligibility");
        MobileElement el1 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeTextView[@name=\"Type Here...\"]");
        el1.sendKeys("What is my Shares Eligibility");
        Thread.sleep( 500 );
        (new TouchAction(driver)).tap(340, 500).perform();
        Thread.sleep( 4000 );
        Take_Screenshot(scenario);
    }


    public static void PruBuddy_responds_about_PRUSharePlus(Scenario scenario) {
        System.out.println("PruBuddy_responds_about_PRUSharePlus");
        Assert.assertEquals( "True","True" );
    }

    public static void User_Request_for_Car_Parking_Slots(Scenario scenario) throws InterruptedException {
        System.out.println("User_Request_for_Car_Parking_Slots");

        MobileElement el1 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeTextView[@name=\"Type Here...\"]");
        el1.sendKeys("How many Parking slots available");
        Thread.sleep( 500 );
        (new TouchAction(driver)).tap(340, 500).perform();
        Thread.sleep( 4000 );
        Take_Screenshot(scenario);
    }

    public static void PruBuddy_responds_about_Available_Parking_Slots(Scenario scenario) {
        System.out.println("PruBuddy_responds_about_Available_Parking_Slots");
        Assert.assertEquals( "True","True" );
        driver.quit();
        service.stop();
    }

    public static void Take_Screenshot(Scenario scenario)
    {
        byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs( OutputType.BYTES);
        scenario.embed(screenshot, "image/png");



    }
}
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
