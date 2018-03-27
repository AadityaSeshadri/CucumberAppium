package step_definitions;

import static org.testng.AssertJUnit.assertEquals;

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
import pageobjects.ChatPage;
import pageobjects.HomePage;
import pageobjects.LoginPage;

import java.util.concurrent.TimeUnit;
//import helpers.Log;


public class StepDefinitions {
    public WebDriver driver;
     Scenario scenario;
    //org.apache.log4j.Logger Log = org.apache.log4j.Logger.getLogger("StepDefinitions.java");

    public StepDefinitions()
    {
        driver = Hooks.driver;
        scenario = Hooks.scenario  ;
    }
    @When("^User Login to Prutopia Application$")
    public void User_Login_to_Prutopia_Application() throws Throwable
    {
      //  public void user_Navigates_to_Facebook_and_Login_with_Username_and_Password(String arg1, String arg2) throws Throwable {
        //System.out.println("Scenario name inside -------------------------" + scenario.getName());
        Log.info("Started Execution");
        System.out.println("Before Check_PageLoading_Elements");
        ChatPage.User_Login_to_Prutopia_Application(scenario);
    }

    @When("^User Navigates to Chatbox Window$")
    public void User_Navigates_to_Chatbox_Window() throws Throwable {
        System.out.println("************scenario************" + scenario.getName());
        //PageFactory.initElements(driver, HomePage.class);
        ChatPage.User_Navigates_to_Chatbox_Window();
    }

    @When("^User Validates Elements in ChatBox Window$")
    public void User_Validates_Elements_in_ChatBox_Window() throws Throwable {
        //PageFactory.initElements(driver, HomePage.class);
        ChatPage.User_Validates_Elements_in_ChatBox_Window(scenario);
    }

    @When("^User Initiates Discusion with PruBuddy$")
    public void User_Initiates_Discusion_with_PruBuddy() throws Throwable {
        //PageFactory.initElements(driver, HomePage.class);
        ChatPage.User_Initiates_Discusion_with_PruBuddy(scenario);
    }


    @When("^User Request for  Leave Balance$")
    public void User_Request_for_Leave_Balance() throws Throwable {
        //PageFactory.initElements(driver, HomePage.class);
        ChatPage.User_Request_for_Leave_Balance(scenario);
    }

    @Then("^PruBuddy asks Job Level$")
    public void PruBuddy_asks_Job_Level() throws Throwable {
        //PageFactory.initElements(driver, HomePage.class);
        ChatPage.PruBuddy_asks_Job_Level(scenario);
    }

    @When("^User Enters Job Level$")
    public void User_Enters_Job_Level() throws Throwable {
        //PageFactory.initElements(driver, HomePage.class);
        ChatPage.User_Enters_Job_Level(scenario);
    }

    @Then("^PruBuddy asks for Term of Service$")
    public void PruBuddy_asks_for_Term_of_Service() throws Throwable {
       // PageFactory.initElements(driver, HomePage.class);
        ChatPage.PruBuddy_asks_for_Term_of_Service(scenario);
    }

    @When("^User Enter Term of Service$")
    public void User_Enter_Term_of_Service() throws Throwable {
       // PageFactory.initElements(driver, HomePage.class);
        ChatPage.User_Enter_Term_of_Service(scenario);
    }

    @Then("^PruBuddy Responds with Number of eligible leaves$")
    public void PruBuddy_Responds_with_Number_of_eligible_leaves() throws Throwable {
        PageFactory.initElements(driver, HomePage.class);
        ChatPage.PruBuddy_Responds_with_Number_of_eligible_leaves(scenario);
    }

    @When("^User Request for  Shares Eligibility$")
    public void User_Request_for_Shares_Eligibility() throws Throwable {
       // PageFactory.initElements(driver, HomePage.class);
        ChatPage.User_Request_for_Shares_Eligibility(scenario);
    }

    @Then("^PruBuddy responds about PRUSharePlus$")
    public void PruBuddy_responds_about_PRUSharePlus() throws Throwable {
       // PageFactory.initElements(driver, HomePage.class);
        ChatPage.PruBuddy_responds_about_PRUSharePlus(scenario);
    }

    @When("^User Request for  Car Parking Slots$")
    public void User_Request_for_Car_Parking_Slots() throws Throwable {
        //PageFactory.initElements(driver, HomePage.class);
        ChatPage.User_Request_for_Car_Parking_Slots(scenario);
    }

    @Then("^PruBuddy responds about Available Parking Slots$")
    public void PruBuddy_responds_about_Available_Parking_Slots() throws Throwable {
       // PageFactory.initElements(driver, HomePage.class);
        ChatPage.PruBuddy_responds_about_Available_Parking_Slots(scenario);
    }
    
}