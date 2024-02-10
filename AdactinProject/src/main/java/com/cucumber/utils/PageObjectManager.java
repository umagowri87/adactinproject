package com.cucumber.utils;

import org.openqa.selenium.WebDriver;

import com.cucumber.pom.LoginPage;
import com.cucumber.pom.SearchPage;

public class PageObjectManager {
	
	public WebDriver driver;
	
	public PageObjectManager(WebDriver Idriver){
		this.driver=Idriver;
		
	}
	
	private LoginPage lp;
	
	private SearchPage sp;

	public LoginPage getLp() {
		
		if(lp==null) {
		      lp= new LoginPage(driver);
		}
		
		return lp;
	}
	
	public SearchPage getSp() {
			if(sp==null) {
				sp=new SearchPage(driver);
			}
		return sp;
	}

}
