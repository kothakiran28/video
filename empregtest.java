import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class empregtest
{
	static WebDriver driver;
public static void main(String[] args)
{
    WebDriver driver=new FirefoxDriver();
    
	AdminLoginTest.Launchapp(AdminLoginTest.url);
	AdminLoginTest admin=new AdminLoginTest();
	admin.adminlogin(admin.uname,admin.pword);
	String fname="Nag";
	String lname="Vemula";
      empreg(fname,lname);
	
	admin.adminlogout();
	AdminLoginTest.closeapp();
	
}
public static void empreg(String fname,String lname)
{
	Sleeper.sleepTightInSeconds(10);

	driver.findElement(By.linkText("PIM")).click();
	driver.findElement(By.linkText("Add Employee")).click();
	driver.findElement(By.id("firstName")).sendKeys(fname);
	driver.findElement(By.id("lastName")).sendKeys(lname);
	driver.findElement(By.id("employeeId")).clear();
	driver.findElement(By.id("employeeId")).sendKeys("0093");
	driver.findElement(By.id("btnSave")).click();
	if(driver.findElement(By.xpath("//div[@id='profile-pic']/h1")).getText().equals("+fname+"+"+lname"))
	
		System.out.println("empreg is success:");
		
	else
		System.out.println("empreg is success:");
	
}



}
