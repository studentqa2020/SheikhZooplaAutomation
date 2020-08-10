package com.cucumber;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.PageFactory.MasterPageFactory;
import com.config.ObjectMap;
import com.util.HighLighter;

public class BaseLoginCucumber {
	
	ObjectMap obj;
	MasterPageFactory pf;
	
	public WebDriver setup() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		// ChromeOptions chromeoptions = new ChromeOptions();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		return driver;

	}
	public void getUrl(WebDriver driver) throws IOException  {
		obj = new ObjectMap();
		driver.get(obj.getconfig("URL"));
	}
	public void clickSignIn(WebDriver driver) {
		pf = PageFactory.initElements(driver, MasterPageFactory.class);
		pf.getCookie().click();
		
		pf.getSignin().click();

	}
	public void enterUserName(WebDriver driver) throws IOException {
		HighLighter.brown(driver, pf.getEmail());
		pf.getEmail().sendKeys(obj.getconfig("email"));

	}
	public void enterPassword(WebDriver driver) throws IOException {
		HighLighter.color(driver, pf.getPassword());
		pf.getPassword().sendKeys(obj.getconfig("pass"));
		
	}
	public void clickLoginIn(WebDriver driver) {
		pf.getSubmit().click();
	}
	
	public void userLogIn(WebDriver driver) {
		System.out.println(driver.getTitle());
	}

}
