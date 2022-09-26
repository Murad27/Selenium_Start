package Login.Functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Login_Test {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\eclipse-workspace\\Selenium_Start\\Drivers\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\Owner\\eclipse-workspace\\Selenium_Start\\Drivers\\geckodriver.exe");
		//System.setProperty("webdriver.opera.driver","C:\\Users\\Owner\\eclipse-workspace\\Selenium_Start\\Drivers\\operadriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		//WebDriver driver=new FirefoxDriver();
		//WebDriver driver=new OperaDriver();
		
		
		//driver.get("https://www.youtube.com/watch?v=m80E1K75vDI");
		driver.get("http://www.zoopla.com");
		driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		
		//driver.navigate("");
		//driver.navigate().forward();    //For the forward the page
		//driver.navigate().back();       //for the back the page
        //driver.navigate().refresh();
		//driver.close();                    //only the close the  browser,not server.
		//driver.quit();                    //close the browser and backend server.
		
		driver.findElement(By.linkText("Sign in")).click();              //By element,linktext-locator
		driver.findElement(By.id("email")).sendKeys("hasanmurad4201@gmail.com");
		driver.findElement(By.id("password")).sendKeys("murad1991");
		
		//driver.get("https://www.youtube.com");
	}
	

}
