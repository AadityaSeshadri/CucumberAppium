package pageobjects;
//import helpers.Log;

//import com.sun.jna.platform.win32.ShellAPI;

import cucumber.api.Scenario;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import step_definitions.Hooks;
import com.google.common.base.Function;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;


public class ChatPage {
    //*********Variable Declarations*******************************
    public   WebDriver driver;
    public  WebDriverWait wait = Hooks.wait;
    public  int Req_Index = 2;
    public  int Resp_index= 3;

    //*********Page Elements***************************************
    @iOSFindBy(xpath = "//XCUIElementTypeTextView[@name=\"chatTextInput Type Here...\"]")
    public  MobileElement Txt_ChatText;

    @iOSFindBy(xpath = "(//XCUIElementTypeOther[@name=\"chatSendButton\"])[2]")
    public  MobileElement Btn_Send;

    public ChatPage()
    {
        driver = Hooks.driver;
        wait = Hooks.wait;
        PageFactory.initElements(new AppiumFieldDecorator(driver, 15, TimeUnit.SECONDS), this);
    }

    //*********Page Methods***************************************
    public  void User_sends_ReqText(AppiumDriver driver,Scenario scenario,String req_text) throws InterruptedException {
        Txt_ChatText.setValue(req_text);
        Btn_Send.click();
        Thread.sleep(500);

      /*  driver.findElement( By.xpath( "//XCUIElementTypeTextView[@name=\"chatTextInput Type Here...\"]" ) ).sendKeys(req_text);
        //driver.findElement( By.xpath( "//XCUIElementTypeTextView[@name=\"chatTextInput\"]" ) ).sendKeys(req_text);

<<<<<<< HEAD
        driver.findElement(By.xpath("(//XCUIElementTypeOther[@name=\"chatSendButton\"])[2]")).click();
        Thread.sleep(500);*/
=======
        driver.findElement( By.xpath( "//XCUIElementTypeTextView[@name=\"chatTextInput Type Here...\"]" ) ).sendKeys(req_text);
        //driver.findElement( By.xpath( "//XCUIElementTypeTextView[@name=\"chatTextInput\"]" ) ).sendKeys(req_text);

        driver.findElement(By.xpath("(//XCUIElementTypeOther[@name=\"chatSendButton\"])[2]")).click();
        Thread.sleep(500);
>>>>>>> 603d37909f01258015dd667f68673c884fb3ca44
     //wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//XCUIElementTypeStaticText[@name=\"restChat\"])["+Req_Index +"]"))));
        //Req_Index = Req_Index+2;

    }

<<<<<<< HEAD
    public  void Prubuddy_Sends_Response(AppiumDriver driver,Scenario scenario, String resp_text) {
=======
    public static void Prubuddy_Sends_Response(AppiumDriver driver,Scenario scenario, String resp_text) {
>>>>>>> 603d37909f01258015dd667f68673c884fb3ca44
       // wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//XCUIElementTypeStaticText[@name=\"restChat\"])["+Resp_index +"]"))));
       // System.out.println("Resp_Index"+ Resp_index);
 }


    public  void User_Clicks_on_Main_Screen_Icon() {

    }


    public  void Take_Screenshot(Scenario scenario)
    {
        byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs( OutputType.BYTES);
        scenario.embed(screenshot, "image/png");
    }


}
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
