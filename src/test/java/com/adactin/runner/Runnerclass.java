package com.adactin.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.BaseClass.Base_Class;
import com.adactin.properties.FileReaderManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src//test//java//com//adactin//feature", glue="com.adactin.stepdefenition",
monochrome=true,
dryRun = false,
strict=true,
tags=("@RegressionTest"),
plugin= {"html:Reports/HtmlReports",
		   
		  "pretty",
		  
		  "json:Reports/JsonReports.json",
		  
		  "com.cucumber.listener.ExtentCucumberFormatter:Reports/ExtentProjectReport.html"
}
)
public class Runnerclass {
	public static WebDriver driver;
	
	@BeforeClass
	
	public static void browserLaunch() throws IOException {
//		System.setProperty("webdriver.chrome.driver", 
//				"C:\\Users\\VIGNESH\\eclipse-workspace\\Adactin_Cucumber\\Datafile\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
		
		String browser = FileReaderManager.getinstance().getinstanceCR().getbrowser();
		driver=Base_Class.browserLaunch(browser);
		

	}
	
	@AfterClass
	
	public static void driverExit() {
	
		driver.close();
	}
	
	

}
