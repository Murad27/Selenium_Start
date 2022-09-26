package Login.Functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dompage5 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\eclipse-workspace\\Selenium_Start\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.guru99.com/accessing-forms-in-webdriver.html");
	//driver.findElement(By.xpath("//a[@href='/'][1]")).click();
	//driver.findElement(By.xpath("(//span[@class='nav-drop-title-wrap'])[1]")).click();
	Thread.sleep(5000);
	//driver.findElement(By.xpath("(//*[@class='kadence-svg-icon kadence-arrow-down-svg'])[1]")).click();	
	
	}

}
