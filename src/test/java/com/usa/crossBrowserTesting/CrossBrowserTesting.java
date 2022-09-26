package com.usa.crossBrowserTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTesting {
	WebDriver driver;
	@BeforeTest                               //use basic annotation
	@Parameters("browser")                    //Advance annotation n pass the argument-Browser
	public void setUp(String browser) {         //create method and pass the string veritable
		                                        // and pass the argument browser
		if(browser.equalsIgnoreCase("chrome")) {   //Then i use if condition and use equalsIgnore case method 
		                                           //and which browser u test pass this browser
	 WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
	}
		else if (browser.equalsIgnoreCase("firefox")){                          // Check if parameter passed from TestNG is 'firefox
			System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");//how to open the browse
			driver=new FirefoxDriver();
		}
		else if (browser.equalsIgnoreCase("opera")){
			System.setProperty("webdriver.opera.driver","./Drivers/operadriver.exe");
			driver=new OperaDriver();
		
}
		else {
			System.out.println("If browser is not open");
		}
		
		
		
			
		}
    @Test
	public void testxml() {
		driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
		driver.get("https://www.zoopla.co.uk/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/header/div/div/nav/div[3]/div[2]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("hasanmurad4201@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murad123");
		driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div/form/div[6]/div/button")).click();
		driver.quit();
	}
	



}
