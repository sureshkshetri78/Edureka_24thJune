package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Training QA\\Selenium Training\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		System.setProperty("webdriver.gecko.driver", "D:\\Training QA\\Selenium Training\\Driver\\geckodriver.exe");
//		WebDriver driver1 = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		//driver1.get("https://www.google.com/");
		
		driver.findElement(By.id("u_0_e")).sendKeys("Suresh ");
		driver.findElement(By.name("lastname")).sendKeys("Basnet");
		driver.findElement(By.id("u_0_j")).sendKeys("suresh@gmail.com");

		
	}

}
