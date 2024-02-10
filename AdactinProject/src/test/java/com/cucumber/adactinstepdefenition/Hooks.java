package com.cucumber.adactinstepdefenition;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.TakesScreenshot;

import com.cucumber.baseclass.BaseClass;
import com.cucumber.listener.Reporter;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass{

	@Before
	public void beforeHooks()
	{
		System.out.println("Before Hooks");
	}
	
	@After
	public void afterHooks(Scenario testcase) throws Exception
	{
		System.out.println("After Hooks");
		
		testcase.getStatus();
		if(testcase.isFailed())
		{
			File screenshot=tkScreenshot(testcase.getName());
			Reporter.addScreenCaptureFromPath(screenshot.getAbsolutePath());
		}
		
	}
	
}
