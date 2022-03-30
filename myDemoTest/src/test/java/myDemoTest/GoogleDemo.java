/*******************************************************************************
 * Copyright (c) 2022 or the year of first publication, if earlier, HighQ Solutions Limited or its licensors
 ******************************************************************************/
package myDemoTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleDemo {

	@Test
	public void googleTitleTest() {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");

		String title = driver.getTitle();
		System.out.println(title);

		Assert.assertTrue("Google".equals(title));

		driver.quit();
	}
}
