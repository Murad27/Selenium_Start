package Login.Functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class demopage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\eclipse-workspace\\Selenium_Start\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.xpath(" //*[@name='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(5000);
		String actual="OrangeHRM";
		Assert.assertEquals(actual, driver.getTitle());
	    System.out.println("My page " +driver.getTitle());
		
		driver.findElement(By.xpath("(//a[@href='#'])[1]")).click();
		Thread.sleep(5000);
	
		driver.findElement(By.xpath("//a[@href='/index.php/auth/logout']")).click();
	}

}
