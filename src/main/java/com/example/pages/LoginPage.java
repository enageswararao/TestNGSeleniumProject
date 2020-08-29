package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	WebDriver driver = null;
	// *******************************************************************
	// Locators / webElements
	// *******************************************************************
	By username = By.id("txtUsername");
	By password = By.name("txtPassword");
	By submit = By.name("Submit");

	// *******************************************************************
	// Constructor
	// *******************************************************************

	  public LoginPage( WebDriver driver){
	  
	  this.driver=driver; 
	  }
	   
	 

	// *******************************************************************
	// Methods or Actions
	// *******************************************************************

	public WebElement getUsername() {

		WebElement usernameEl = driver.findElement(username);

		return usernameEl;
	}

	public WebElement getPassword() {

		return driver.findElement(password);
	}

	public WebElement getSubmitElement() {

		return driver.findElement(submit);
	}

}
