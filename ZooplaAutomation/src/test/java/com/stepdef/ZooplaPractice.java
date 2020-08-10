package com.stepdef;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.cucumber.BaseLoginCucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ZooplaPractice {

	WebDriver driver;
	BaseLoginCucumber obj;
@Given("^open a browser and put url$")
public void open_a_browser() {
   
  // driver = BaseLoginCucumber.setup();	
	obj = new BaseLoginCucumber();
	driver = obj.setup();
}

@Given("^Put URL$")
public void put_URL() throws Throwable {
   
    obj.getUrl(driver);
}

@When("^Click Signin$")
public void click_Signin() {
   
    obj.clickSignIn(driver);
}

@When("^put valid user name$")
public void put_valid_user_name() throws IOException {
    
    obj.enterUserName(driver);
}

@When("^put valid password$")
public void put_valid_password() throws Throwable {
  
    obj.enterPassword(driver);
}

@When("^click sign in button$")
public void click_sign_in_button() {
   
    obj.clickLoginIn(driver);
}

@Then("^Validate login was success$")
public void validate_login_was_success_sign_out_btn() {
   
    obj.userLogIn(driver);
}

}
