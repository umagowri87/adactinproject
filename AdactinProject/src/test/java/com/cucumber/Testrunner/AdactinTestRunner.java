
package com.cucumber.Testrunner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.cucumber.baseclass.BaseClass;
import com.cucumber.listener.Reporter;
import com.cucumber.utils.FileReaderManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {
		"com.cucumber.listener.ExtentCucumberFormatter:src\\test\\resource\\com\\cucumber\\reports\\extentreport.html",
		"pretty", "json:src\\test\\resource\\com\\cucumber\\reports\\report.json",
		"junit:src\\test\\resource\\com\\cucumber\\reports\\report.xml",
		"html:src\\test\\resource\\com\\cucumber\\reports" }, features = "src\\test\\java\\com\\cucumber\\featurefile", // feature
																														// file
																														// "package"path
		glue = { "com.cucumber.adactinstepdefenition" }, // step definition package
		tags = { "@SmokeTest" }, dryRun = false,
		// format = {"pretty"},
		strict = true, monochrome = true

)

public class AdactinTestRunner extends BaseClass {

	@BeforeClass
	public static void SetupIntialization() throws Exception {
		String browsername = FileReaderManager.frm.getConfigReader().getBrowsername();
		driver = browserLaunch(browsername);
		String url = FileReaderManager.frm.getConfigReader().getUrl();
		getUrl(url);
	}

	@AfterClass
	public static void teardown() {
		Reporter.loadXMLConfig(new File(System.getProperty("user.dir")
				+ "\\src\\test\\resource\\com\\selenium\\properties\\extent-config.xml"));
		driver.quit();

	}

}
