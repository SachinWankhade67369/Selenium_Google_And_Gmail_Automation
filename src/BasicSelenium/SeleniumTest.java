package BasicSelenium;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumTest {
	public static void main(String[] args) throws InterruptedException {
	WebDriver wd =new FirefoxDriver();
	wd.get("file:///C:/Users/SACHU/Desktop/Offline%20Website/index.html");
	
	
	
	System.out.println(0);
	WebElement emailblank=wd.findElement(By.xpath(".//*[@id='email']"));
	emailblank.clear();
	emailblank.sendKeys("");	
	WebElement idblank=wd.findElement(By.xpath(".//*[@id='password']"));
	idblank.clear();
	idblank.sendKeys("");	
	WebElement sub=wd.findElement(By.xpath(".//*[@id='form']/div[3]/div/button"));
	sub.click();
	
	System.out.println(1);
	WebElement emailInvalid=wd.findElement(By.xpath(".//*[@id='email']"));
	emailInvalid.clear();
	emailInvalid.sendKeys("kdkbsxv");
	WebElement idInvalid=wd.findElement(By.xpath(".//*[@id='password']"));
	idInvalid.clear();
	idInvalid.sendKeys("snlfasf");
	WebElement sub1=wd.findElement(By.xpath(".//*[@id='form']/div[3]/div/button"));
	sub1.click();
	
	System.out.println(3);
	WebElement email=wd.findElement(By.xpath(".//*[@id='email']"));
	email.clear();
	email.sendKeys("kiran@gmail.com");
	WebElement id=wd.findElement(By.xpath(".//*[@id='password']"));
	id.clear();
	id.sendKeys("123456");
	WebElement sub3=wd.findElement(By.xpath(".//*[@id='form']/div[3]/div/button"));
	sub3.click();
	
	System.out.println(4);
	WebElement Userbutton = wd.findElement(By.xpath("html/body/div[1]/aside[1]/section/ul/li[3]/a"));
	Userbutton.click();
	
	System.out.println(5);
	
	WebElement AddUserbutton = wd.findElement(By.xpath("html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button"));
	AddUserbutton.click();
	Thread.sleep(2000);
	
	System.out.println(6);
	WebElement AddUsername= wd.findElement(By.xpath(".//*[@id='username']"));
	AddUsername.clear();
	AddUsername.sendKeys("Sachin Wankhade");
	
	System.out.println(7);
	WebElement Addmobile= wd.findElement(By.xpath(".//*[@id='mobile']"));
	Addmobile.clear();
	Addmobile.sendKeys("7475513154");
	
	System.out.println(8);
	WebElement Addemail= wd.findElement(By.xpath(".//*[@id='email']"));
	Addemail.clear();
	Addemail.sendKeys("sachin@gmail.com");
	
	System.out.println(9);
	WebElement AddGender= wd.findElement(By.xpath(".//*[@id='Male']"));
	AddGender.click();
	
	System.out.println(10);
	WebElement 	SelectState= wd.findElement(By.xpath("html/body/div[1]/div[1]/section[2]/div/div/div/form/div[1]/div[5]/div/select"));
	Select s= new Select(SelectState);
	s.selectByVisibleText("Maharashtra");  
	
	
	System.out.println(11);
	WebElement Addpwd= wd.findElement(By.xpath(".//*[@id='password']"));
	Addpwd.clear();
	Addpwd.sendKeys("00000");
	
	System.out.println(12);
	WebElement SubmitButton= wd.findElement(By.xpath(".//*[@id='submit']"));
	SubmitButton.click();
	Thread.sleep(2000);
	
	System.out.println(13);
	Alert al= wd.switchTo().alert();
	al.accept();
	//Thread.sleep(3000);
	
		/*
		  System.out.println(14);
		   WebElement UserDelete= wd.findElement(By.xpath(
		  "html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[4]/td[8]/a/span"));
		   UserDelete.click();
		 */
	System.out.println(14);
	WebElement Userbutton1 = wd.findElement(By.xpath("html/body/div[1]/aside[1]/section/ul/li[3]/a"));
	Userbutton1.click();
	
	WebElement text= wd.findElement(By.xpath("html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[2]/td[3]"));
	System.out.println(text.getText());
	
/*	
	//To print the table,we must use the for loop.
	for(int i= 2;i<=5;i++)// 1st loop is for Table row--tr[]
	{
		for(int j=1;j<=7;j++)//2nd loop is for Table data--td[]
		{
			WebElement tableElement= wd.findElement(By.xpath("html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr["+i+"]/td["+j+"]"));
			System.out.print("  "+tableElement.getText());
		}
		System.out.println();
	}
	}*/
	
	
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
