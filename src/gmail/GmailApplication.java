package gmail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailApplication {

	public static void main(String[] args) 
	{
		
		/*
		  To start chrome driver, we need to call set property method of System class.
		  System.setProperty(key, value);
		  key- webdriver.chrome.driver and value-C:\\chromedriver.exe i.e. path of driver
		 */
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		driver = new ChromeDriver();
		
		String url= "https://accounts.google.com";
		driver.get(url);
		driver.manage().window().maximize();	// to maximize the window.
		
		
		System.out.println(1);
		//Element can be invoked by using Action class
		/*
		WebElement loginButton = driver.findElement(By.xpath("//div[@class='h-c-header__cta h-c-header__cta--tier-two']//a[contains(text(),'Sign in')]"));
		Actions action = new Actions(driver);
		action.moveToElement(loginButton).build().perform();
		loginButton.click();
		*/
		
		//cssSelector is use to find out the locator.
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("#identifierId")).sendKeys("sachinwankhade.it@gmail.com");
		System.out.println(2);
		
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.cssSelector("#identifierNext > span > span"))).click().build().perform();
		//driver.findElement(By.cssSelector("#identifierNext > content > span")).click();
		System.out.println(3);
		
		//To wait driver for 5 seconds.(to load the page)
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);//implicit wait
		WebDriverWait wait= new WebDriverWait(driver, 20);//Explicit wait using WebDriverWait Interface.
		wait.until(ExpectedConditions.elementToBeSelected(By.cssSelector("#password > div.aCsJod.oJeWuf > div > div.Xb9hP > input")));
		driver.findElement(By.cssSelector("#password > div.aCsJod.oJeWuf > div > div.Xb9hP > input")).sendKeys("12345");
		
		System.out.println(4);
		wait.until(ExpectedConditions.elementToBeSelected(By.cssSelector("#passwordNext > span > span")));
		driver.findElement(By.cssSelector("#passwordNext > span > span")).click();
		
		driver.close();
		driver.quit();
	}

}
