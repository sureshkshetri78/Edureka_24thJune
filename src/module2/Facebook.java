package module2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Training QA\\Selenium Training\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
//		System.setProperty("webdriver.gecko.driver", "D:\\Training QA\\Selenium Training\\Driver\\geckodriver.exe");
//		WebDriver driver1 = new FirefoxDriver();
		
		//driver1.get("https://www.google.com/");
		
		driver.findElement(By.id("u_0_e")).sendKeys("Suresh ");
		driver.findElement(By.name("lastname")).sendKeys("Basnet");
		driver.findElement(By.id("u_0_j")).sendKeys("suresh@gmail.com");
		
		driver.findElement(By.className("inputtext")).sendKeys("basnet@gmail.com");
	
		driver.findElement(By.linkText("Forgot account?")).click();
		driver.navigate().back();
		
	   driver.findElement(By.partialLinkText("e a P")).click();
	
		driver.findElement(By.cssSelector("#pass")).sendKeys("basnet"); 
		
//		List<WebElement> tagList = driver.findElements(By.tagName("input"));
//		System.out.println(tagList.size());
//		List<WebElement> anchorList = driver.findElements(By.tagName("a"));
//		System.out.println(anchorList.size());
		

		
	}

}
