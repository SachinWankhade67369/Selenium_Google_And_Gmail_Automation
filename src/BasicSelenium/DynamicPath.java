package BasicSelenium;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;



public class DynamicPath {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();

		String url = "file:///C:/Users/SACHU/Desktop/Offline%20Website/index.html";

		driver.get(url);
		// driver.manage().window().maximize();
		/*
		 * List<WebElement> list= driver.findElements(By.cssSelector("#id"));
		 * System.out.println(list);
		 */

		WebElement emailText = driver.findElement(By.xpath("// input[@id='email']"));
		emailText.clear();
		emailText.sendKeys("kiran@gmail.com");

		WebElement pwdText = driver.findElement(By.xpath("// input[@type='password']"));
		pwdText.clear();
		pwdText.sendKeys("123456");

		// dynamic path by attribute
		WebElement singinButtton = driver.findElement(By.xpath("// button[@type='submit']"));
		singinButtton.click();

		// Dynamic path by contains() method.
		// WebElement singinButton= driver.findElement(By.xpath("//
		// button[contains(text(),'Sign In')]"));
		// singinButtton.click();

		WebElement userButton = driver.findElement(By.xpath("//a[@href='users.html']"));
		userButton.click();

		System.out.println(1);
		WebElement table = driver.findElement(By.xpath("//table[@class='table table-hover']"));
		List<WebElement> tr = table.findElements(By.tagName("tr"));

		for (WebElement row : tr) 
		{

			List<WebElement> td = row.findElements(By.tagName("td"));

			for (WebElement col : td) 
			{
				System.out.print(" " + col.getText());
			}
			System.out.println();
		}

		System.out.println(2);

		
		// Dynamic xpath to find out lebal name kiran@gmail.com
		WebElement lebalText = driver.findElement(By.xpath("//table[@class='table table-hover']//tr//td[contains(text(),'kiran@gmail.com')]"));
		System.out.println(" " + lebalText.getText());

		System.out.println(3);
	
		// Dynamic xpath to find out lebal name Male from 3 row
		WebElement lebalText1 = driver.findElement(By.xpath("//tr[@id='tr_2']//td[6]"));
		System.out.println(" " + lebalText1.getText());

		System.out.println(4);
	
		// Dynamic xpath to find out lebal name Female from 4 row
		WebElement lebalText2 = driver.findElement(By.xpath("//table[@class='table table-hover']//tr[4]//td[6]"));
		System.out.println(" " + lebalText2.getText());

		System.out.println(5);
		WebElement lebalText3 = driver.findElement(By.xpath("//tr[@id='tr_4']//td[contains(text(),'Punjab')]"));
		System.out.println(" " + lebalText3.getText());

		
		
		System.out.println(6);
		// to print the lebal value kiran from table.
		WebElement table1 = driver.findElement(By.xpath("//table[@class='table table-hover']"));

		for (int i = 2; i <= 5; i++)
		{
			for (int j = 1; j <= 7; j++) 
			{

				WebElement tableData = driver.findElement(By.xpath("//table/tbody/tr["+ i + "]/td[" + j + "]"));
				if (i == 2 && j == 2) 
				{
					System.out.print(" " + tableData.getText());
				}
			}
			System.out.println();
		}
		
		
		WebElement adduserButton= driver.findElement(By.xpath("//button[@class='btn btn-block btn-primary btn-sm pull-right']"));
		adduserButton.click();
		
		WebElement usernameText = driver.findElement(By.xpath("//input[@id='username']"));
		usernameText.clear();
		usernameText.sendKeys("Sachin Wankhade");
		
		WebElement mobileText = driver.findElement(By.xpath("//input[@id='mobile']"));
		mobileText.clear();
		mobileText.sendKeys("7030140848");
		
		WebElement useremailText = driver.findElement(By.xpath("//input[@id='email']"));
		useremailText.clear();
		useremailText.sendKeys("sachinwankhade.it@gmail.com");
		
		WebElement genderButton= driver.findElement(By.xpath("//input[@id='Male']"));
		genderButton.click();
		
		WebElement dropDownboxText = driver.findElement(By.xpath("//select"));
		Select s1= new Select(dropDownboxText);
		s1.selectByVisibleText("Maharashtra");
		
		WebElement userpasswordText = driver.findElement(By.xpath("//input[@id='password']"));
		userpasswordText.clear();
		userpasswordText.sendKeys("abc4566");
		
		
		WebElement submitButton= driver.findElement(By.xpath("//button[@id='submit']"));
		submitButton.click();
		
		
		
		Alert a1= driver.switchTo().alert();
		Thread.sleep(2000);
		a1.accept();
		
		
		WebElement logoutButton= driver.findElement(By.xpath("//a[@href='logout.html']"));
		logoutButton.click();
		Thread.sleep(5000);
		
		
		//String p=driver.findElement(By.xpath("//div[@class='small-box bg-aqua']//a[@class='small-box-footer']")).getText();
		//System.out.println(p);
		//String p= driver.findElement(By.xpath(text(),'More'));
		
		driver.close();//Close the current window, quitting the browser if it's the last window currently open.

		driver.quit();//Quits this driver, closing every associated window.
		
		
	}

}
