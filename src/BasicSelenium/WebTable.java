package BasicSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTable
{

	public static void main(String[] args) 
	{
		WebDriver wd =new FirefoxDriver();
		wd.get("file:///C:/Users/SACHU/Desktop/Offline%20Website/index.html");
		
		System.out.println(1);
		WebElement emailMain= wd.findElement(By.xpath(".//*[@id='email']"));
		emailMain.clear();
		emailMain.sendKeys("kiran@gmail.com");
		
		System.out.println(2);
		WebElement passwordMain= wd.findElement(By.xpath(".//*[@id='password']"));
		passwordMain.clear();
		passwordMain.sendKeys("123456");
		
		System.out.println(3);
		WebElement loginButton2= wd.findElement(By.xpath(".//*[@id='form']/div[3]/div/button"));
		loginButton2.click();
		
		System.out.println(4);
		WebElement userbutton = wd.findElement(By.xpath("html/body/div[1]/aside[1]/section/ul/li[3]/a/span"));
		userbutton.click();
		

	 	//Dynamic way to display the table using List<E> interface.
		//Use of for each loop to find out the elements of list.
		
		WebElement table= wd.findElement(By.xpath("html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table"));
		
		List<WebElement> tr= table.findElements(By.tagName("tr"));//find out elements in tr(row) and stored in list.
		
		System.out.println("No of rows:"+tr.size());
		
		for (WebElement row: tr)	// for each loop for row/tr.
		{
			List<WebElement> td= row.findElements(By.tagName("td"));//find out elements in td(Data/col) and stored in list.
			
			for(WebElement col: td)	//for each loop for column/td.
			{
				System.out.print(" "+col.getText());// to print the text.
			}
			System.out.println("");
		}
			System.out.println("--------------");
		}
}


