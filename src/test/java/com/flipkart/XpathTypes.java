package com.flipkart;

import org.openqa.selenium.chrome.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

public class XpathTypes {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		Thread.sleep(1000);
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.amazon.in/?tag=msndeskabkin-21&hvadid=72705384568101&hvqmt=e&hvbmt=be&hvdev=c&ref=pd_sl_5twasf2d2w_e");
		
		
	}

}
