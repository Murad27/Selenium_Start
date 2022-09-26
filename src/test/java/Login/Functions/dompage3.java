package Login.Functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dompage3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\eclipse-workspace\\Selenium_Start\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http:/www.automationpractice.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("email")).sendKeys("hasamurad4201@gmail.com");
		

        driver.findElement(By.id("passwd")).sendKeys("Murad123");
        Thread.sleep(7000);
		driver.findElement(By.id("authentication")).click();
	}

}
