package com.example.pages;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashBoardPage {

	WebDriver driver;
	// *******************************************************************
	// Locators / webElements
	// *******************************************************************
	By username = By.id("txtUsername");
	By password = By.name("txtPassword");
	By submit = By.name("Submit");
	// Admin
	By admin = By.xpath("//B[text()='Admin']");
	// Leave
	By leave = By.xpath("//B[text()='Leave']");

	// Time
	By time = By.xpath("//B[text()='Time']");

	public DashBoardPage(WebDriver driver) {

		this.driver = driver;
	}
       public void sampleElement(){
	       
       }

	public WebElement getAdminLink() {

		return driver.findElement(admin);
	}

	public WebElement getLeaveLink() {

		return driver.findElement(leave);
	}

	public WebElement getTimeLink() {

		return driver.findElement(time);
	}

}
