package Google;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleHomePage {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "D:\\Test WorkSpace\\SeleniumDemo\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		driver.get("https://www.google.com/");

		System.out.println(driver.getTitle());
		String Title = driver.getTitle();
		if (Title.equals("Google")) {
			System.out.println("Correct title.");
		} else {
			System.out.println("Incorrect title.");
		}
		
		//Type of locator. 
		//1.id
		Boolean GoogleImage= driver.findElement(By.id("hplogo")).isDisplayed();
		System.out.println("Is Google Image display?"+GoogleImage);
		
		//2.xpath
		WebElement serachTextbox= driver.findElement(By.xpath("//input[@name='q']"));
		serachTextbox.clear();
		serachTextbox.sendKeys("java by kiran");
		driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@name='btnK']")).click();
		
		//3.name.
	
		////div[@class='gb_e gb_f']//a[@data-pid='23']
		//4.linkText.
        //Thread.sleep(10);
		//driver.findElement(By.linkText("Gmail")).click();
		//Thread.sleep(10);
		
		//5.CSSSelector.
		
		//6.partiallinkText.(not recommended.)
		
		//7.className(not recommended because class name can be multiple.)
		//Boolean MickImage= driver.findElement(By.className("hb2Smf")).isDisplayed();
		//System.out.println("Is MickImage displayed:"+MickImage);
		
		//8.tagName
		
		
		
	//	driver.quit();

	}

}
