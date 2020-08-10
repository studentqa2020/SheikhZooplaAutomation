
package com.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MasterPageFactory {
	WebDriver driver;
	public MasterPageFactory()	{
		this.driver =driver;
		
	}
	
	@FindBy(xpath="//*[contains(text(),'Sign in')][1]")
	private WebElement signin; 
	@FindBy(xpath="//*[@id='signin_email']")
	private WebElement email;
	@FindBy(xpath="//*[@id='signin_password']")
	private WebElement password;
	@FindBy(xpath="//*[@id='signin_submit']")
	private WebElement submit;
	@FindBy(xpath="//*[@id='search-tabs-for-sale']")
	private WebElement Forsale;
	//@FindBy(xpath= "(//*[contains(text(),'UK')])[5]")
	@FindBy(xpath="/html[1]/body[1]/header[1]/div[1]/nav[1]/ul[2]/li[1]/div[1]/ul[1]/li[1]/a[1]")
	private WebElement UKproperty;
	@FindBy(xpath="//*[@id='search-input-location']")
	private WebElement SearchBox;
	@FindBy(xpath="//*[@id='search-submit']")
	private WebElement City;
	@FindBy(xpath="//*[@id=\"content\"]/div[1]/ul[3]/li[1]/a")
	private WebElement WestLondon;
	@FindBy(xpath ="//*[@href='/for-sale/property/london/acton/']")
	private WebElement Actonproperty;
	@FindBy(xpath = "//*[@class='btn btn-search-refine-top js-btn-search-refine-top btn-search-refine-price icon icon-down-open-1']")
	private WebElement Anyprice;
	@FindBy(xpath ="//*[@name='price_min'][2]")
	private WebElement Minprice;
	@FindBy(xpath="//*[@class='ui-button-primary ui-cookie-accept-all-medium-large']")
	private WebElement cookie;
	
	
	public WebElement getCookie() {
		return cookie;
	}
	public WebElement getSignin() {
		return signin;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getSubmit() {
		return submit;
	}
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getForsale() {
		return Forsale;
	}
	public WebElement getUKproperty() {
		return UKproperty;
	}
	public WebElement getSearchBox() {
		return SearchBox;
	}
	public WebElement getCity() {
		return City;
	}
	public WebElement getWestLondon() {
		return WestLondon;
	}
	public WebElement getActonproperty() {
		return Actonproperty;
	}
	public WebElement getAnyprice() {
		return Anyprice;
	}
	public WebElement getMinprice() {
		return Minprice;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
