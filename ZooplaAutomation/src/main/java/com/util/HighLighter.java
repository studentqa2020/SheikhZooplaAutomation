package com.util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HighLighter {

	
	public static void color(WebDriver driver,WebElement element) {
		JavascriptExecutor jse =(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].style.border= '3px solid green'", element);
		
	}
	public static void brown(WebDriver driver,WebElement element) {
		JavascriptExecutor jse =(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].style.border= '3px solid brown'", element);
		
	}
}
