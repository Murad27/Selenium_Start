package Login.Functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dompage2 {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\eclipse-workspace\\Selenium_Start\\Drivers\\chromedriver.exe" );
	WebDriver driver= new ChromeDriver();
	driver.get("http:/www.automationpractice.com");
	driver.manage().window().maximize();
	
	driver.findElement(By.linkText("Sign in")).click();
	driver.findElement(By.id("email")).sendKeys("hasanmurad4201@gmail.com");
    driver.findElement(By.xpath("(//*[@class='is_required validate account_input form-control'])[3]")).sendKeys("Murad123");
	driver.findElement(By.xpath("(//*[@type='submit'])[3]")).click();	
	
	//driver.findElement(By.xpath("//a[@class='btn-orange trial-btn pulse']")).click();
	//driver.findElement(By.className("login")).click();
}
}
