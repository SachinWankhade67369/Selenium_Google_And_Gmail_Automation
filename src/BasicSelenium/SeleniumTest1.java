package BasicSelenium;

import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumTest1 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver wd= new FirefoxDriver();
		wd.get("file:///C:/Users/SACHU/Desktop/Offline%20Website/index.html");
		
		WebElement textMain= wd.findElement(By.xpath("html/body/div[1]/div[1]/a"));
		System.out.println(textMain.getText());
		
		//for blank space
		System.out.println(1);
		WebElement emailMainBlank= wd.findElement(By.xpath(".//*[@id='email']"));
		emailMainBlank.clear();
		emailMainBlank.sendKeys("");
		
		System.out.println(2);
		WebElement passwordMainBlank= wd.findElement(By.xpath(".//*[@id='password']"));
		passwordMainBlank.clear();
		passwordMainBlank.sendKeys("");
		
		System.out.println(3);
		WebElement loginButton= wd.findElement(By.xpath(".//*[@id='form']/div[3]/div/button"));
		loginButton.click();
		
		//for invalid entry
		System.out.println(4);
		WebElement emailMainInvalid= wd.findElement(By.xpath(".//*[@id='email']"));
		emailMainInvalid.clear();
		emailMainInvalid.sendKeys("kfhkasgkas");
		
		System.out.println(5);
		WebElement passwordMainInvalid= wd.findElement(By.xpath(".//*[@id='password']"));
		passwordMainInvalid.clear();
		passwordMainInvalid.sendKeys("87654654");
		
		System.out.println(7);
		WebElement loginButton1= wd.findElement(By.xpath(".//*[@id='form']/div[3]/div/button"));
		loginButton1.click();
		
		//for valid entry
		System.out.println(8);
		WebElement emailMain= wd.findElement(By.xpath(".//*[@id='email']"));
		emailMain.clear();
		emailMain.sendKeys("kiran@gmail.com");
		
		System.out.println(9);
		WebElement passwordMain= wd.findElement(By.xpath(".//*[@id='password']"));
		passwordMain.clear();
		passwordMain.sendKeys("123456");
		
		System.out.println(10);
		WebElement loginButton2= wd.findElement(By.xpath(".//*[@id='form']/div[3]/div/button"));
		loginButton2.click();
		
		//click on user button
		System.out.println(11);
		WebElement userbutton = wd.findElement(By.xpath("html/body/div[1]/aside[1]/section/ul/li[3]/a/span"));
		userbutton.click();
		
		System.out.println(12);
		WebElement addUserbutton = wd.findElement(By.xpath("html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button"));
		addUserbutton.click();
		
		Thread.sleep(2000);
		
		System.out.println(13);
		WebElement addUsername= wd.findElement(By.xpath(".//*[@id='username']"));
		addUsername.clear();
		addUsername.sendKeys("Kajal");
		
		System.out.println(14);
		WebElement addMobile= wd.findElement(By.xpath(".//*[@id='mobile']"));
		addMobile.clear();
		addMobile.sendKeys("7030140848");
		
		System.out.println(15);
		WebElement addEmail= wd.findElement(By.xpath(".//*[@id='email']"));
		addEmail.clear();
		addEmail.sendKeys("kajal@gmail.com");
		
		System.out.println(16);
		WebElement genderButton = wd.findElement(By.xpath(".//*[@id='Female']"));
		genderButton.click();
		
		System.out.println(17);
		WebElement selectState= wd.findElement(By.xpath("html/body/div[1]/div[1]/section[2]/div/div/div/form/div[1]/div[5]/div/select"));
		Select s= new Select(selectState);
		s.selectByVisibleText("Maharashtra");//to visible the entry from selected drop down list.
		
		
		System.out.println(18);
		WebElement addPassword= wd.findElement(By.xpath(".//*[@id='password']"));
		addPassword.clear();
		addPassword.sendKeys("0987654");
		
		System.out.println(16);
		WebElement submitButton = wd.findElement(By.xpath(".//*[@id='submit']"));
		submitButton.click();
		
		//To click windows pop up window which is part of window operating System,not browser.
		//because we can not find the path of pop up window so for that purpose we need to use Alert Interface..
		System.out.println(17);
		Alert a= wd.switchTo().alert();
		Thread.sleep(2000);
		a.accept();
		
		/*
		 * Inspect web table using for loop,but it is not relevant way to go though web table.
		 * If any row or data get change(i.e. increase or decrease) then the test case will be failed so
		 * for that matter we need to use dynamic way i.e. for each loop..
		 */
		System.out.println(18);
		WebElement userbutton1 = wd.findElement(By.xpath("html/body/div[1]/aside[1]/section/ul/li[3]/a/span"));
		userbutton1.click();
		
		for(int i=2 ;i<=5;i++)
		{
			for(int j=1;j<=7;j++)
			{
				WebElement tableData=wd.findElement(By.xpath("html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr["+i+"]/td["+j+"]"));
				System.out.print(" "+tableData.getText());
			}
			System.out.println();
		}
		
		
		//using for each loop
		
		/*
		System.out.println(19);
		WebElement table= wd.findElement(By.xpath("html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table"));
		
		List<WebElement> tr= table.findElements(By.tagName("tr"));
		
		for(WebElement row : tr)
		{
			List<WebElement> td= row.findElements(By.tagName("td"));
			
			for(WebElement col : td)
			{
				System.out.print(" "+col.getText());
			}
			System.out.println();
		}
		
		*/
		
	}

}
