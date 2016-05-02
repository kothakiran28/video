

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class AdminLoginTest
{
    static WebDriver driver;
    static String res;
    static String url="http://opensource.demo.orangehrm.com";
    static String uname="Admin";
    static String pword="admin";
        
    
	public static void main(String[] args) 
	{
		String result;
		result=Launchapp(url);
		System.out.println("login page is displayed :"+ result);
		adminlogin(uname,pword);
		System.out.println("admin login page is displayed:"+ result);
		result=adminlogout();
		System.out.println("admin logout step result:"+result);
		closeapp();
		
	}
	public static String Launchapp(String url)
	{

		driver=new FirefoxDriver();
		driver.get(url);
		if (driver.findElement(By.id("btnLogin")).isDisplayed())
		{
			res="pass";
			
		}else
		{
			res="fail";
			
		}return res; 
		
	}
	public static String adminlogin(String uid,String pwd)
	
	{
		 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		 driver.findElement(By.id("txtPassword")).sendKeys("admin");
		 driver.findElement(By.id("btnLogin")).click();
		 if(driver.findElement(By.linkText("Welcome Admin")).isDisplayed())
		 {
			 res="pass";
			 

	}else
	{
		res="fail";
		
	}return res;
	}
	public static String adminlogout()
	{
		
		driver.findElement(By.linkText("Welcome Admin")).click();
		driver.findElement(By.linkText("Logout")).click();
		Sleeper.sleepTight(10);
		if (driver.findElement(By.id("btnLogin")).isDisplayed())
		{
			res="pass";
			
		}else
		{
			res="fail";
			
		}return res; 
	}


	
		public static void closeapp()
		{
			driver.quit();
		}
		
		
		
		
		
		
		
		}
	
	
	
	


