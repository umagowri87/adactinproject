   package com.cucumber.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
public WebDriver driver;
	
	public LoginPage(WebDriver Idriver) {
		this.driver=Idriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="login")
	private WebElement login;
	
	@FindBy(xpath="//input[@id='username_show' and @value='Hello umagowri!']")
	private WebElement loginUserName;

	public WebElement getLoginUserName() {
		return loginUserName;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}
	

}
