package com.cucumber.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	
	public WebDriver driver;
	
	public SearchPage(WebDriver Idriver)
	{
		this.driver= Idriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id="room_nos")
	private WebElement room_no;
	
	@FindBy(id="datepick_in")
	private WebElement checkin;
	
	@FindBy(id="datepick_out")
	private WebElement checkout;
	
	@FindBy(xpath="//span[contains(text(),'Check-In Date shall be before than Check-Out Date')]")
	private WebElement checkin_errmsg;

	@FindBy(id="adult_room")
	private WebElement adult_room;
	
	@FindBy(id="Submit")
	private WebElement submit_search;
	
	@FindBy(id="room_type")
	private WebElement roomtype;
	
	@FindBy(id="hotels")
	private WebElement hotels;
	
	@FindBy(id="hotel_name_0")
	private WebElement search_hotel_display;

	

	public WebElement getSearch_hotel_display() {
		return search_hotel_display;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getSubmit_search() {
		return submit_search;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getRoom_no() {
		return room_no;
	}

	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getCheckin_errmsg() {
		return checkin_errmsg;
	}

	public WebElement getAdult_room() {
		return adult_room;
	}

	
	

}
