package com.demo.wedriver.LaunchDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleChromeLaunch {
	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "\\Grid\\chromedriver.exe");//static method because calling directly from class System
		driver = new ChromeDriver();
		String baseUrl = "http://opensource.demo.orangehrmlive.com/#";
		String exepctedTitle = "OrangeHRM";
		String actualTitle = "";
		driver.get(baseUrl);
		actualTitle = driver.getTitle();
		if (actualTitle.contentEquals(exepctedTitle)) {
			System.out.println("Test Passed!");
		}else {
			System.out.println("Test Failed");
		}
		driver.close();
	}

}
