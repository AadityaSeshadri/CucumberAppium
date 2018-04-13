package step_definitions;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.cucumber.listener.Reporter;
import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.github.mkolisnyk.cucumber.reporting.CucumberDetailedResults;
import gherkin.formatter.model.Feature;
import helpers.Log;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import javax.imageio.ImageIO;

import io.appium.java_client.AppiumDriver;
import pageobjects.ChatPage;

public class Hooks{
   public static AppiumDriver driver;
    public static WebDriverWait wait ;
    public static Scenario scenario;
    public static String OS_Name;

    private AppiumDriverLocalService service;
    private AppiumServiceBuilder builder;
    private DesiredCapabilities cap;



    public void startServer() {
        //Set Capabilities
        cap = new DesiredCapabilities();
        cap.setCapability("noReset", "false");

        //Build the Appium service
        builder = new AppiumServiceBuilder();
        builder.withIPAddress("127.0.0.1");
        builder.usingPort(4723);
        builder.withCapabilities(cap);
        builder.withArgument(GeneralServerFlag.SESSION_OVERRIDE);
        builder.withArgument(GeneralServerFlag.LOG_LEVEL,"error");

        //Start the server with the builder
        service = AppiumDriverLocalService.buildService(builder);
        service.start();
        System.out.println("successfully started");
    }
    @Before("@LoginPositive,@LoginNegative")
    public void openBrowser(Scenario scenario) throws IOException, InterruptedException {
        Hooks.scenario = scenario;
        startServer();

         Log.info("Driver Initialized");
        Log.info("******Excecution  started for the scenario*****"+ scenario.getName());



        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appium-version", "1.7.2");
        capabilities.setCapability("platformVersion", "11.2");
        capabilities.setCapability("platformName", "ios");
        capabilities.setCapability("automationName", "XCUITest");
        capabilities.setCapability("deviceName", "iPhone X");

        String appPath = "/Users/user/Library/Developer/Xcode/DerivedData/prutopia-bshhxtvrkfrofgazervrafchfnrm/Build/Products/Debug-iphonesimulator/prutopia.app";

        assert appPath != null: "Path to iOS app is not set";
        System.out.println("iOS App path: "+ appPath);
        capabilities.setCapability("app", appPath);
        //driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        //driver  = (AppiumDriver) new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub/"), capabilities);
        driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        // driver = new RemoteWebDriver(new URL("http://127.0.0.1:4725/wd/hub"), capabilities);
        wait = new WebDriverWait(driver,20);

    }


    @After(order = 1)
    public void embedScreenshot(Scenario scenario) {

        if (scenario.isFailed()) {
            String screenshotName = scenario.getName().replaceAll(" ", "_");
            try {
                File sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                File destinationPath = new File(System.getProperty("user.dir") + "/target/cucumber-ExtendedReports/screenshots/" + screenshotName + ".png");
                FileUtils.copyFile(sourcePath, destinationPath);
                com.cucumber.listener.Reporter.addScreenCaptureFromPath(destinationPath.getAbsolutePath().toString());
            } catch (IOException e) {
                e.printStackTrace();

            }
        }

        //driver.quit();
    }



}