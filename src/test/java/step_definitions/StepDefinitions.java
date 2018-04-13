package step_definitions;

import static org.testng.AssertJUnit.assertEquals;

import cucumber.api.PendingException;
import cucumber.api.Scenario;
import helpers.Log;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.ChatPage;
import pageobjects.HomePage;
import pageobjects.LoginPage;

import java.util.concurrent.TimeUnit;
//import helpers.Log;


public class StepDefinitions {
    public AppiumDriver driver;
     Scenario scenario;
public StepDefinitions()
    {
        driver = Hooks.driver;
        scenario = Hooks.scenario  ;

    }


/*    @When("^User Opens Prutopia Application$")
    public void user_Opens_Prutopia_Application() throws Throwable {

        System.out.println("User Opens Prutopia Application");
        LoginPage.user_Opens_Prutopia_Application(driver,scenario);
    }

    @Then("^User should be able to see Splash Screen$")
    public void user_should_be_able_to_see_Splash_Screen() throws Throwable {

        LoginPage.user_should_be_able_to_see_Splash_Screen(driver,scenario);
    }*/

    @When("^User Opens Prutopia Application and navigated to Azure Directory for Login$")
    public void user_is_navigated_to_Azure_Directory_for_Login() throws Throwable {

        LoginPage.user_is_navigated_to_Azure_Directory_for_Login(driver,scenario);
    }

    @When("^User Enters Username$")
    public void user_Enters_Username() throws Throwable {

        LoginPage.user_Enters_Username(driver,scenario);
    }

    @Then("^User Clicks on Next Button$")
    public void user_Clicks_on_Next_Button() throws Throwable {

        LoginPage.user_Clicks_on_Next_Button(driver,scenario);
    }

    @When("^User Enters Password$")
    public void user_Enters_Password() throws Throwable {

        LoginPage.user_Enters_Password(driver,scenario);
    }

    @Then("^User Clicks on Sign in Button$")
    public void user_Clicks_on_Sign_in_Button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        LoginPage.user_Clicks_on_Sign_in_Button(driver,scenario);
    }

    @Then("^User is Navigated to Home Page of the Application$")
    public void user_is_Navigated_to_Home_Page_of_the_Application() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
        LoginPage.user_is_Navigated_to_Home_Page_of_the_Application(driver,scenario);
    }

    @Then("^Elements in Home Page are Validated$")
    public void elements_in_Home_Page_are_Validated() throws Throwable {

        LoginPage.elements_in_Home_Page_are_Validated(driver,scenario);
    }

    //New
    @When("^User Clicks on the Chat Icon at Bottom of Home Page$")
    public void user_Clicks_on_the_Chat_Icon_at_Bottom_of_Home_Page() throws Throwable {

        LoginPage.user_Clicks_on_the_Chat_Icon_at_Bottom_of_Home_Page(driver,scenario);
    }

    @Then("^User is navigated to the Chat Page of the Application$")
    public void user_is_navigated_to_the_Chat_Page_of_the_Application() throws Throwable {

        LoginPage.user_is_navigated_to_the_Chat_Page_of_the_Application(driver,scenario);
    }

    @When("^User sends Request Text \"(.*?)\"$")
    public void user_sends_Request_Text(String Req_Text) throws Throwable {

        ChatPage.User_sends_ReqText(driver,scenario,Req_Text);

    }

    @Then("^PruBuddy sends Response Text \"(.*?)\"$")
    public void prubuddy_sends_Response_Text(String Resp_Text) throws Throwable {
        ChatPage.Prubuddy_Sends_Response(driver,scenario,Resp_Text);

    }

    @Then("^User Clicks on Main Screen Icon$")
    public void User_Clicks_on_Main_Screen_Icon() throws Throwable {
        ChatPage.User_Clicks_on_Main_Screen_Icon();
    }



}