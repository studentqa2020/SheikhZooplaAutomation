package com.generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.PageFactory.MasterPageFactory;
import com.config.ObjectMap;
import com.util.HighLighter;

public class BaseLogin {
	static MasterPageFactory pf;
	static WebDriver driver;
	public ObjectMap obj;

	@BeforeTest
	public void setup() throws IOException {

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		// ChromeOptions chromeoptions = new ChromeOptions();
		driver = new ChromeDriver();
		obj = new ObjectMap();
		driver.get(obj.getconfig("URL"));
		driver.manage().window().maximize();
	}

	@Test
	public void Login() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		pf = PageFactory.initElements(driver, MasterPageFactory.class);
		pf.getCookie().click();
		
		pf.getSignin().click();
		
		HighLighter.brown(driver, pf.getEmail());
		pf.getEmail().sendKeys(obj.getconfig("email"));
		HighLighter.color(driver, pf.getPassword());
		pf.getPassword().sendKeys(obj.getconfig("pass"));
		pf.getSubmit().click();
	}
		//TakeScreenShot.captureScreenShot(driver, "Logged In");
		//WebElement element = pf.getForsale();
		
		@Test(dependsOnMethods ="Login")
		public void Forsale() throws Throwable{
	    Actions act = new Actions(driver);
		act.moveToElement(pf.getForsale());
		act.perform();
		act.click();
		Thread.sleep(1000);
	//	pf.getUKproperty().click();
		}
		@Test(dependsOnMethods ="Forsale")
		public void Search() {
		pf.getSearchBox().sendKeys("London");
		pf.getCity().click();
		pf.getWestLondon().click();
		pf.getActonproperty().click();
		}
		@Test(dependsOnMethods ="Search")
		public void Anyprice() {
		Actions act =new Actions(driver);
		act.moveToElement(pf.getAnyprice());
		act.perform();
		pf.getAnyprice().click();
		}
		@Test(dependsOnMethods = "Anyprice")
		public void Minprice() {
		pf.getMinprice().click();
		}

	

	@AfterTest (enabled = false)
	public void TearDown() {
		driver.quit();
	}

}
