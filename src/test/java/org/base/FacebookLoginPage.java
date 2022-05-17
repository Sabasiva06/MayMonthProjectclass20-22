package org.base;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLoginPage {

	public static WebDriver driver;

	@AfterClass
	public static void tc0() throws WebDriverException, IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		FileUtils.copyFile(ts.getScreenshotAs(OutputType.FILE), new 
				File("C:\\April\\sample.png"));
		driver.close();
	}

	@Before
	public void tc3() {
		Date d = new Date();
		System.out.println("before entering credentialls" + d);
	}

	@After
	public void tc4() {
		Date d1 = new Date();
		System.out.println("after entering credentials" + d1);
	}

	@Test
	public void tc1() {
		driver.findElement(By.id("email")).sendKeys("ramsss");
		driver.findElement(By.id("pass")).sendKeys("12345");
		driver.findElement(By.name("login")).click();

	}

	@BeforeClass
	public static void tc2() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
	}

}
