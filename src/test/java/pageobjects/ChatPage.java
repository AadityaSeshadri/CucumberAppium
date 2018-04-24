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
    public   AppiumDriver driver;
    public  WebDriverWait wait ;
    public  int Req_Index = 2;
    public  int Resp_index= 3;

    //*********Page Elements***************************************
                        ////XCUIElementTypeTextView[@name="chatTextInput"]
                        ////XCUIElementTypeTextView[@name="chatTextInput"]
    @iOSFindBy(accessibility = "chatTextInput")    ////XCUIElementTypeTextView[@name="chatTextInput Type Here..."]
    public  MobileElement Txt_ChatText;

    @iOSFindBy(xpath = "(//XCUIElementTypeOther[@name=\"sendTextIcon\"])[2]")    //(//XCUIElementTypeOther[@name="chatSendButton"])[2]
    public  MobileElement Btn_Send;

    @iOSFindBy(xpath = "(//XCUIElementTypeOther[@name=\"2.pruTopia.ChatScreen\"])[2]")    //(//XCUIElementTypeOther[@name="chatSendButton"])[2]
    public  MobileElement Icon_Accouunt;
    @iOSFindBy(accessibility = "Logout")
    public  MobileElement Btn_Logout;
    @iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"LOG IN USING YOUR PRUDENTIAL CREDENTIALS\"]")
    public  MobileElement Lbl_Login_Text;
    @iOSFindBy(accessibility = "lastChat")
    public  MobileElement Txt_Last_Chat;
    @iOSFindBy(accessibility = "lastSend")
    public  MobileElement Txt_Last_Send;


    @iOSFindBy(accessibility = "1) Yes")
    public  MobileElement Opt_Yes;
    @iOSFindBy(accessibility = "2) 10 years or longer")
    public  MobileElement Opt_10YorMore;
    @iOSFindBy(accessibility = "1) Head office")
    public  MobileElement Opt_HeadOffice;
    @iOSFindBy(accessibility = "1) Associate VP & Below")
    public  MobileElement Opt_AssociateVPandBelow;


    public ChatPage()
    {
        driver = Hooks.driver;
        wait = Hooks.wait;
        PageFactory.initElements(new AppiumFieldDecorator(driver, 15, TimeUnit.SECONDS), this);
    }

    //*********Page Methods***************************************
    public  void User_sends_ReqText(AppiumDriver driver,Scenario scenario,String req_text) throws InterruptedException {


        if (req_text.equals("Yes"))
        {
            Opt_Yes.click();
        }
        else if (req_text.contains("10 years or longer"))
        {
            Opt_10YorMore.click();
        }
        else if (req_text.equals("Head office"))
        {
            Opt_HeadOffice.click();
        }
        else if (req_text.equals("Associate VP & Below "))
        {
            Opt_AssociateVPandBelow.click();
        }
        else
        {
            Txt_ChatText.sendKeys(req_text);
        }

        Btn_Send.click();
        wait.until(
                ExpectedConditions.or(
                        ExpectedConditions.attributeContains(Txt_Last_Chat,"name","lastChat"),
                        ExpectedConditions.attributeContains(Txt_Last_Send,"name","lastSend")

                ));
    }

    public  void Prubuddy_Sends_Response(AppiumDriver driver,Scenario scenario, String resp_text) {

    if (resp_text.contains("Yes or No?"))
    {
        //System.out.println("display of Yes No" + Opt_Yes.getAttribute("enabled"));

        Assert.assertEquals("true",Opt_Yes.getAttribute("enabled"));
    }
    else if(resp_text.contains("Less or More than 10 years?"))
    {
        Assert.assertEquals("true",Opt_10YorMore.getAttribute("enabled"));
       // Assert.assertTrue(Opt_10YorMore.isDisplayed());
    }
    else if(resp_text.contains("head office or customer centre?"))
    {
        Assert.assertEquals("true",Opt_HeadOffice.getAttribute("enabled"));
        //Assert.assertTrue(Opt_HeadOffice.isDisplayed());
    }
    else if(resp_text.contains("Job Level?"))
    {
        Assert.assertEquals("true",Opt_AssociateVPandBelow.getAttribute("enabled"));
        //Assert.assertTrue(Opt_AssociateVPandBelow.isDisplayed());
    }
    else
    {
        String Actual_Response = Txt_Last_Chat.getAttribute("label").trim().toString();
        Actual_Response = Actual_Response.replaceAll("\\r\\n|\\r|\\n", "");
        //System.out.println("Actual Response Text" +  Actual_Response);
        //System.out.println("Expected Response text" +resp_text.trim());

        Assert.assertTrue(Actual_Response.contains(resp_text.trim()));
    }

    }


    public  void User_Clicks_on_Main_Screen_Icon() throws InterruptedException {

    }


    public  void Take_Screenshot(Scenario scenario)
    {
        byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs( OutputType.BYTES);
        scenario.embed(screenshot, "image/png");
    }


    public void User_Clicks_Account_Icon() {

        TouchAction a2 = new TouchAction(driver);
        a2.tap(Txt_Last_Chat,10,10).perform();
        wait.until(ExpectedConditions.attributeContains(Icon_Accouunt,"name","2.pruTopia.ChatScreen"));
        Icon_Accouunt.click();
    }

    public void User_Clicks_on_Logout_Button() throws InterruptedException {

        wait.until(ExpectedConditions.attributeContains(Btn_Logout,"name","Logout"));
        Btn_Logout.click();
    }

    public void User_is_able_to_see_Login_Screen_with_User_Logged_Out() throws InterruptedException {

        wait.until(ExpectedConditions.attributeContains(Lbl_Login_Text,"value","LOG IN USING YOUR PRUDENTIAL CREDENTIALS"));
        Assert.assertTrue(Lbl_Login_Text.getAttribute("value").contains("LOG IN USING YOUR PRUDENTIAL CREDENTIALS"));
    }
}
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
