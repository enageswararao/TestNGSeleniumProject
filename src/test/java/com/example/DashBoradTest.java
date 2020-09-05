package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.example.pages.DashBoardPage;
import com.example.pages.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DashBoradTest {
	
WebDriver driver=null;
DashBoardPage dashboardpage=null;
	@BeforeClass
	public void setup() {
		System.out.println("Initialization");
	 
		   WebDriverManager.chromedriver().setup(); driver =new ChromeDriver();
		   driver.manage().window().maximize();
		  driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		  LoginPage loginpage=new LoginPage(driver);
		   loginpage.getUsername().sendKeys("admin");
		   loginpage.getPassword().sendKeys("admin123");
		  loginpage.getSubmitElement().click();
		 
	}
	
	
	@Test
	public void ClickonAdmin() {
		  dashboardpage=new DashBoardPage(driver);
		dashboardpage.getAdminLink().click();
 		System.out.println("User is on Admin page ---"+ driver.getCurrentUrl());
		
	}
	@Test
	public void ClickonLeave() {
		dashboardpage.getLeaveLink().click();
 		System.out.println("User is on Leave page ---"+ driver.getCurrentUrl());

	}
	@Test(enabled=false)
	public void ClickonPIM() {
		
 		System.out.println("User is on PIM page ---"+ driver.getCurrentUrl());

	}
	@Test
	public void ClickonTime() {
		dashboardpage.getTimeLink().click();
 		System.out.println("User is on TIme page ---"+ driver.getCurrentUrl());

		
	}
	
	@AfterClass
	public void teardown() {
		System.out.println("Close everything ");
		 driver.close();
	}

}
