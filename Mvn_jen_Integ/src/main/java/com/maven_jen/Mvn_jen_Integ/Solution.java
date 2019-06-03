package com.maven_jen.Mvn_jen_Integ;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Solution {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/ramchandhn/Desktop/Maven_Jen_Int/Mvn_jen_Integ/driver/chromedriver.exe");
		
		driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		System.out.println(driver.getTitle());
		
	}
	

}
