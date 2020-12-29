package com.rockor.selenium;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;

public class CrossBrowserTesting {
	
	private WebDriver driver;

	@BeforeClass
	@Parameters({"URL", "BrowserType"})
	public void beforeClass(String url, String browserType) {
		
		if(browserType.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver");
			driver = new ChromeDriver();
		} 
		else if(browserType.equals("Firefox")) {
			System.setProperty("webdriver.chrome.driver", "./src/test/resources/firefoxdriver/firefoxdriver");
			driver = new FirefoxDriver();
		}
		else if(browserType.equals("Internet Explorer")) {
			System.setProperty("webdriver.ie.driver", "./src/test/resources/iedriver/iedriver");
			driver = new InternetExplorerDriver();
			
			//
		}
		
	}

	@Test
	public void youtubeSearch() {
	}

	
	@AfterClass
	public void afterClass() {
	}

}
