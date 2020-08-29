package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.example.pages.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrganLoginTest {

	
	WebDriver driver=null;
	
	@BeforeMethod
	public void setup() {
		
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}
	
	
	@Test
	public void logintest() {
		LoginPage  loginpage=new LoginPage(driver);
		loginpage.getUsername().sendKeys("admin");
		loginpage.getPassword().sendKeys("admin123");
		loginpage.getSubmitElement().click();
		
	}
	
	@AfterMethod
	public void teardown() {
		
		driver.close();
	}
}
