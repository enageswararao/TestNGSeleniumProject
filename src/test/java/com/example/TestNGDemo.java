package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGDemo {
	
	WebDriver driver=null;
	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
	}
	
	@Test
	public void test01() {
		System.out.println("testcase01");
		
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		  driver.get("https://opensource-demo.orangehrmlive.com/");
		  driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		  driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		  driver.findElement(By.id("btnLogin")).click();
           // logic Click link
		
	}
	@Test
	public void test02() {
		System.out.println("testcase02");

		//https://opensource-demo.orangehrmlive.com/
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	  driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	  driver.findElement(By.id("btnLogin")).click();
      // logic Click link
    
	}
	
	@AfterMethod
	public void teardown() {
		System.out.println("Test");
		driver.close();
		
	}
	

}
