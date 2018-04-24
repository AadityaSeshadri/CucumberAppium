package step_definitions;

import static org.testng.AssertJUnit.assertEquals;

import cucumber.api.PendingException;
import cucumber.api.Scenario;
import gherkin.lexer.Pa;
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
    LoginPage loginPage = new LoginPage();
    ChatPage chatPage = new ChatPage();

    public StepDefinitions()
    {
        driver = Hooks.driver;
        scenario = Hooks.scenario  ;
    }



    @When("^User Opens Prutopia Application and navigated to Azure Directory for Login$")
    public void user_is_navigated_to_Azure_Directory_for_Login() throws Throwable
    {
        loginPage.user_is_navigated_to_Azure_Directory_for_Login(driver,scenario);

    }

    @When("^User Enters Username \"(.*?)\"$")
    public void user_Enters_Username(String Uname) throws Throwable {

        loginPage.user_Enters_Username(driver,scenario,Uname);
    }

    @Then("^User Clicks on Next Button$")
    public void user_Clicks_on_Next_Button() throws Throwable {

        loginPage.user_Clicks_on_Next_Button(driver,scenario);
    }

    @When("^User Enters Password \"(.*?)\"$")
    public void user_Enters_Password(String Pass) throws Throwable {

        loginPage.user_Enters_Password(driver,scenario, Pass);
    }

    @Then("^User Clicks on Sign in Button$")
    public void user_Clicks_on_Sign_in_Button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        loginPage.user_Clicks_on_Sign_in_Button(driver,scenario);
    }

    @Then("^User is Navigated to Home Page of the Application$")
    public void user_is_Navigated_to_Home_Page_of_the_Application() throws Throwable {
        loginPage.user_is_Navigated_to_Home_Page_of_the_Application(driver,scenario);
    }

    @Then("^Elements in Home Page are Validated$")
    public void elements_in_Home_Page_are_Validated() throws Throwable {

        loginPage.elements_in_Home_Page_are_Validated(driver,scenario);
    }

    @Then("^User is able to see Login Error Message$")
    public void User_is_able_to_see_Login_Error_Message() throws Throwable {

        loginPage.User_is_able_to_see_Login_Error_Message(driver,scenario);
    }

    //New
    @When("^User Clicks on the Chat Icon at Bottom of Home Page$")
    public void user_Clicks_on_the_Chat_Icon_at_Bottom_of_Home_Page() throws Throwable {

        loginPage.user_Clicks_on_the_Chat_Icon_at_Bottom_of_Home_Page(driver,scenario);
    }

    @Then("^User is navigated to the Chat Page of the Application$")
    public void user_is_navigated_to_the_Chat_Page_of_the_Application() throws Throwable {

        loginPage.user_is_navigated_to_the_Chat_Page_of_the_Application(driver,scenario);
    }

    @When("^User sends Request Text \"(.*?)\"$")
    public void user_sends_Request_Text(String Req_Text) throws Throwable {

        chatPage.User_sends_ReqText(driver,scenario,Req_Text);

    }

    @Then("^PruBuddy sends Response Text \"(.*?)\"$")
    public void prubuddy_sends_Response_Text(String Resp_Text) throws Throwable {
        chatPage.Prubuddy_Sends_Response(driver,scenario,Resp_Text);

    }

    @Then("^User Clicks on Main Screen Icon$")
    public void User_Clicks_on_Main_Screen_Icon() throws Throwable {
        chatPage.User_Clicks_on_Main_Screen_Icon();
    }

    @Then("^User Clicks Account Icon$")
    public void User_Clicks_Account_Icon() throws Throwable {
        chatPage.User_Clicks_Account_Icon();
    }

    @Then("^User Clicks on Logout Button$")
    public void User_Clicks_on_Logout_Button() throws Throwable {
        chatPage.User_Clicks_on_Logout_Button();
    }

    @Then("^User is able to see Login Screen with User Logged Out$")
    public void User_is_able_to_see_Login_Screen_with_User_Logged_Out() throws Throwable {
        chatPage.User_is_able_to_see_Login_Screen_with_User_Logged_Out();
    }




}