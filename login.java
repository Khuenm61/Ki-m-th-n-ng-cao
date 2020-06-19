package TestDA;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetAllCookies;
import org.openqa.selenium.remote.server.handler.GetCurrentUrl;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class login {
	public String baseURL = "http://localhost:8084/ass_java5/";
	String drivePath = "D:\\Driver\\KTNC\\chromedriver.exe";
	public WebDriver driver;

	@BeforeTest
	public void login() throws IOException {
		try {
			System.out.println("launching chrome browser");
			System.setProperty("webdriver.chrome.driver", drivePath);
			driver = new ChromeDriver();
			driver.get(baseURL);

			driver.findElement(ByName.name("Username")).sendKeys("Admin");
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.MINUTES);
			driver.findElement(ByName.name("Password")).sendKeys("123");
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.MINUTES);
			driver.findElement(By.id("submit")).click();
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			Assert.assertEquals("http://localhost:8084/ass_java5/Login.htm", driver.getCurrentUrl());
		} catch (Exception e) {
		}

	}

	@Test
	public void f() {
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
//		String expectedTitle = "QuanLyNhanVien";
//		String actualTitle = driver.getTitle();
//		Assert.assertEquals(actualTitle, expectedTitle);
		
//		Test Insert
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.MINUTES);
		driver.findElement(ByName.id("inuser")).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.MINUTES);
		driver.findElement(By.id("user")).click();
		driver.findElement(ByName.id("user")).sendKeys("A");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.MINUTES);
		driver.findElement(By.id("pass")).click();
		driver.findElement(ByName.id("pass")).sendKeys("1234");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.MINUTES);
		driver.findElement(By.id("name")).click();
		driver.findElement(ByName.id("name")).sendKeys("QL");
		driver.findElement(By.id("IN")).click();
		
//		Test Update
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.MINUTES);
		driver.findElement(ByName.id("user1")).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.MINUTES);
		driver.findElement(ByName.id("edit")).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.MINUTES);
		driver.findElement(By.id("name")).click();
		driver.findElement(ByName.id("name")).clear();
		driver.findElement(ByName.id("name")).sendKeys("QTV SỐ 1");
		driver.findElement(By.id("upUser")).click();
		
//		Test Delete
//		driver.manage().timeouts().implicitlyWait(100, TimeUnit.MINUTES);
//		driver.findElement(ByName.id("delete")).click();
	}

}
