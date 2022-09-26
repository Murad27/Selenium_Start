package Login.Functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dompage {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\eclipse-workspace\\Selenium_Start\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.get("http://www.zoopla.com/sign in");
		 driver.manage().window().maximize();
		 //driver.quit();
		 //driver.close();
		  driver.navigate();
		 //driver.navigate().forward();
		 //driver.navigate().back();
		 //driver.navigate().refresh();
		  
		  driver.findElement(By.linkText("Sign in")).click();
		  
	     driver.findElement(By.id("email")).sendKeys("hasanmurad4201@gmail.com");
	     driver.findElement(By.id("password")).sendKeys("Murad123");
		 driver.findElement(By.xpath("//button[@class='c-juxpAL c-juxpAL-ervJfA-fw-true c-juxpAL-fKTdVa-category-primary']")).click();
		driver.findElement(By.xpath("(//*[@class='c-dCnEbb']//decendent::*[2]")).click();
		//driver.findElement(By.xpath("//*[@id='main-content']//descendant::span[2]")).click();
	     // System.out.println(driver.getTitle());
	     Thread.sleep(2000);               //don't show argu commend.//dalay
	     
	     
	   
	
}
}
	 
	 

    
   
    


