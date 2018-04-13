package step_definitions;

import com.cucumber.listener.Reporter;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;
import helpers.ConfigReaderClass;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import java.io.File;



@RunWith(ExtendedCucumber.class)
@ExtendedCucumberOptions(jsonReport = "target/cucumber.json",
		retryCount = 0,
		detailedReport = true,
		detailedAggregatedReport = true,
		overviewReport = true,
		coverageReport = false,
		jsonUsageReport = "target/cucumber-usage.json",
		usageReport = true,
		toPDF = true,
<<<<<<< HEAD
		includeCoverageTags = {"@LoginNegative,@LoginPositive,@NavigateToPruBuddy,@PruBuddyChat"},
=======
		includeCoverageTags = {"@DemoPositive1,@DemoPositive2"},
>>>>>>> 603d37909f01258015dd667f68673c884fb3ca44
		outputFolder = "target/")

@CucumberOptions(
		features = "classpath:features",
<<<<<<< HEAD
		plugin = {"json:target/cucumber.json","usage:target/cucumber-usage.json","com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-ExtendedReports/report.html"},
		tags = {"@LoginNegative,@LoginPositive,@NavigateToPruBuddy,@PruBuddyChat"}
		//monochrome = true
		)

=======
		//plugin = {"json:target/cucumber.json","usage:target/cucumber-usage.json"},
plugin = {"json:target/cucumber.json","usage:target/cucumber-usage.json","com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-ExtendedReports/report.html"},
		tags = {"@DemoPositive1,@DemoPositive2"}
		//monochrome = true
		)
		//tags = {"@initial"})
/*
@ExtendedCucumberOptions(jsonReport = "target/cucumber.json",
		retryCount = 3,
		detailedReport = true,
		detailedAggregatedReport = true,
		overviewReport = true,
		//coverageReport = true,
		jsonUsageReport = "target/cucumber-usage.json",
		usageReport = true,
		toPDF = true,
		outputFolder = "target/cucumber-html-report")*/
>>>>>>> 603d37909f01258015dd667f68673c884fb3ca44

public class RunCukesTest{

	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File(System.getProperty("user.dir")+"/src/test/resources/extent-config.xml"));
		Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
		Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
		Reporter.setSystemInfo("Machine", 	"MAC" + "64 Bit");
		Reporter.setSystemInfo("Selenium", "3.7.0");
		Reporter.setSystemInfo("Maven", "3.5.3");
		Reporter.setSystemInfo("Java Version", "1.9.0_4");
	}
	
}