package com.mechlin.controller;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JenkinsTest {
	
	@Test
	public void testJenkins(){
		System.out.println("welcome to jenkins.......");
		System.setProperty("webdriver.chrome.driver","D:\\Vikas\\Tools\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://test-enrjobs.classifiedsolutionsgroup.com/account/log-on?ReturnUrl=%2femployers%2fjobstatistics");
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
