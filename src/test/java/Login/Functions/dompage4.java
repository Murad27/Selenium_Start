package Login.Functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class dompage4 {
	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\eclipse-workspace\\Selenium_Start\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.automationpractice.com/index.php");
		
		driver.findElement(By.xpath("//a[@class='login']")).click();
		driver.findElement(By.id("email")).sendKeys("hasanmurad4201@gmail.com");
		driver.findElement(By.xpath("(//*[@class='is_required validate account_input form-control'])[3]")).sendKeys("Murad123");
		driver.findElement(By.xpath("(//*[@type='submit'])[3]")).click();
		//driver.findElement(By.xpath("(//*[@class='logout'])")).click();
		
	    Thread.sleep(5000);
	    String actual="My account - My Store";
	    Assert.assertEquals(actual, driver.getTitle());
	    //System.out.println(driver.getTitle());
	     
		

}
}
