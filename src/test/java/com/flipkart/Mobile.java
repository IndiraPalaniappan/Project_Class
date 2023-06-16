package com.flipkart;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Mobile {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--incognito");
		option.addArguments("--start-maximized");
		option.addArguments("--disable-popup-blocking");
		option.addArguments("--disable-notifications");
		DesiredCapabilities dc=new DesiredCapabilities();				
		WebDriver driver=new ChromeDriver(option);
		driver.navigate().to("https://www.flipkart.com");

		//driver.manage().window().maximize();
		
		
	}
}
