package pageobjects;
//import helpers.Log;

//import com.sun.jna.platform.win32.ShellAPI;

import cucumber.api.Scenario;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import step_definitions.Hooks;
import com.google.common.base.Function;
import java.net.MalformedURLException;



public class ChatPage {

    public  static WebDriver driver;
    public static WebDriverWait wait = Hooks.wait;
    public static int Req_Index = 2;
    public static int Resp_index= 3;

    private static AppiumDriverLocalService service;
    private static AppiumServiceBuilder builder;
    private static DesiredCapabilities cap;




    public static void User_sends_ReqText(AppiumDriver driver,Scenario scenario,String req_text) throws InterruptedException {

        driver.findElement( By.xpath( "//XCUIElementTypeTextView[@name=\"chatTextInput Type Here...\"]" ) ).sendKeys(req_text);
        //driver.findElement( By.xpath( "//XCUIElementTypeTextView[@name=\"chatTextInput\"]" ) ).sendKeys(req_text);

        driver.findElement(By.xpath("(//XCUIElementTypeOther[@name=\"chatSendButton\"])[2]")).click();
        Thread.sleep(500);
     //wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//XCUIElementTypeStaticText[@name=\"restChat\"])["+Req_Index +"]"))));
        //Req_Index = Req_Index+2;

    }

    public static void Prubuddy_Sends_Response(AppiumDriver driver,Scenario scenario, String resp_text) {
       // wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//XCUIElementTypeStaticText[@name=\"restChat\"])["+Resp_index +"]"))));
       // System.out.println("Resp_Index"+ Resp_index);
 }


    public static void User_Clicks_on_Main_Screen_Icon() {

    }


    public static void Take_Screenshot(Scenario scenario)
    {
        byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs( OutputType.BYTES);
        scenario.embed(screenshot, "image/png");
    }


}
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
