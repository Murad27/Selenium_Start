package Login.Functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class dompagemethod {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\eclipse-workspace\\Selenium_Start\\Drivers\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.zoopla.com/sign in");
		//driver.findElement(By.xpath("(//*[@data-testid='header-profile-sign-in'])[1]")).click();
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("email")).sendKeys("hasanmurad4201@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Murad123");
		driver.findElement(By.xpath("(//button[@aria-live='polite'])[3]")).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//*[@id='__next']/descendant::span[5]")).click();
		//driver.findElement(By.xpath("(//*[@class='c-PJLV c-PJLV-ikdeNol-css c-feaHCD c-DSRVB']//following::span)[1]")).click();
		//driver.findElement(By.xpath("(//span[contains(@class, 'c-dCnEbb')])[2]")).click();
		driver.findElement(By.xpath("(//*[@class='c-fLblyH c-iqKiGy c-fLblyH-bNuZrP-muted-true'])[2]")).click();
		
		//String actual="Sign in to Zoopla - Zoopla";
		//Assert.assertEquals(actual, driver.getTitle());
		System.out.println(driver.getTitle());
		
		
		
		
		
		
		
	
	}

}
