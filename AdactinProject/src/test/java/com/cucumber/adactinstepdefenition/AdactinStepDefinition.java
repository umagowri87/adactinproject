package com.cucumber.adactinstepdefenition;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.cucumber.Testrunner.AdactinTestRunner;
import com.cucumber.baseclass.BaseClass;

import com.cucumber.pom.LoginPage;
import com.cucumber.pom.SearchPage;
import com.cucumber.utils.PageObjectManager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class AdactinStepDefinition extends BaseClass {
	
	
	public static WebDriver driver =AdactinTestRunner.driver;//we need to access the driver created in testrunner class
	public static PageObjectManager po= new PageObjectManager(driver);//passing the same driver

	//LoginPage lp=new LoginPage(driver);
	//SearchPage sp= new SearchPage(driver);

	@Given("^User launch the adactin application$")
	public void user_launch_the_adactin_application() throws IOException, Exception  {
		
		System.out.println("launch application");
	
		//getUrl("https://www.adactin.com/HotelApp");		
	//String excelRead = excelRead(2, 2);
		//	driver.findElement(By.id("email")).sendKeys(excelRead);
    
	}

	@When("^title of the login page is adactin$")
	public void title_of_the_login_page_is_adactin() throws Exception  {
		System.out.println("login page");
	   String title= driver.getTitle();
	   System.out.println(title);
	  Thread.sleep(1000);
	   Assert.assertEquals("AdactIn.com - Hotel Reservation System", title);
	  
	}

	@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String username, String password)  {
		inputValuestoWebElement(po.getLp().getUsername(), "umagowri");
		inputValuestoWebElement(po.getLp().getPassword(), "uma@123");
	    
		}

	@Then("^user click Login button in Login page$")
	public void user_click_Login_button_in_Login_page()  {
		clickOnWebElement(po.getLp().getLogin());
	    
	}

	@Then("^user verify the username displayed in homepage$")
	public void user_verify_the_username_displayed_in_homepage() {
		WebElement loginUserName = po.getLp().getLoginUserName();
		String actualname = loginUserName.getAttribute("value");
		
		Assert.assertEquals("Hello umagowri!", actualname);
			   
	}
	
	
	
	@Given("^the user in search page$")
	public void the_user_in_search_page() throws InterruptedException  {
	   getUrl("https://www.adactin.com/HotelApp/SearchHotel.php");
	   Thread.sleep(2000);
	}

	@When("^customer select location as \"([^\"]*)\"$")
	public void customer_select_location_as(String Location)  {
		mouseHoverToTheElemnet(po.getSp().getLocation());
	    selectValueDropdown(po.getSp().getLocation(), Location);
	   
	}

	@When("^user select number of rooms as \"([^\"]*)\"$")
	public void user_select_number_of_rooms_as(String NOR)  {
		mouseHoverToTheElemnet(po.getSp().getRoom_no());
	    selectValueDropdown(po.getSp().getRoom_no(), NOR);
	}

	
	@When("^customer enters check-in date \"([^\"]*)\"$")
	public void customer_enters_check_in_date(String checkin_date)  {
		po.getSp().getCheckin().clear();
		po.getSp().getCheckin().click();

		inputValuestoWebElement(po.getSp().getCheckin(), checkin_date);
	}

	@Then("^customer enters check-out date \"([^\"]*)\" less than check-in date$")
	public void customer_enters_check_out_date_less_than_check_in_date(String checkout_date) {
		po.getSp().getCheckout().clear(); 
		po.getSp().getCheckout().click();
		inputValuestoWebElement(po.getSp().getCheckout(), checkout_date);  
	}

	@When("^customer selects number of adults as \"([^\"]*)\"$")
	public void customer_selects_number_of_adults_as(String NOA)  {
	    selectValueDropdown(po.getSp().getAdult_room(), NOA);
	}

	@When("^user click search button$")
	public void user_click_search_button()  {
		clickOnWebElement(po.getSp().getSubmit_search());
	}

	@Then("^verify for the error message for check-in date field$")
	public void verify_for_the_error_message_for_check_in_date_field() throws Exception  {
		
		String message = getTextInWebElement(po.getSp().getCheckin_errmsg());
		System.out.println(message);

		Assert.assertEquals("Check-In Date shall be before than Check-Out Date", message);
	    
	}
	
	@Given("^the user is in select hotel page after successfull login$")
	public void the_user_is_in_select_hotel_page_after_successfull_login()   {
		  getUrl("https://www.adactin.com/HotelApp/SearchHotel.php");
	}

	@When("^the user select location as \"([^\"]*)\"$")
	public void the_user_select_location_as(String Location)   {
		selectValueDropdown(po.getSp().getLocation(), Location);
	    
	}

	@Then("^user selects hotel as \"([^\"]*)\" and room_type as \"([^\"]*)\" and NOR as\"([^\"]*)\"$")
	public void user_selects_hotel_as_and_room_type_as_and_NOR_as(String Hotel, String RT, String NOR)   {
	selectValueDropdown(po.getSp().getHotels(), Hotel);
	selectValueDropdown(po.getSp().getRoomtype(), RT);
	selectValueDropdown(po.getSp().getRoom_no(), NOR);
	
		
	}

	@Then("^customer enters check-out date \"([^\"]*)\"$")
	public void customer_enters_check_out_date(String checkout_date)   {
		po.getSp().getCheckout().clear(); 
		po.getSp().getCheckout().click();
		inputValuestoWebElement(po.getSp().getCheckout(), checkout_date);
	   	}

	@Then("^verify location displayed in select hotel is same as location selected in search hotel$")
	public void verify_location_displayed_in_select_hotel_is_same_as_location_selected_in_search_hotel()   {
	  
		WebElement hotelname = po.getSp().getSearch_hotel_display();
		hotelname.click();
		String actual_hotelname = hotelname.getAttribute("value");
		System.out.println(actual_hotelname);
		Assert.assertEquals("Hotel Creek", actual_hotelname);
	}




	
}
