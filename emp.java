import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class emp
{

	public static void main(String[] args)
	{
        WebDriver driver=new FirefoxDriver();
        driver.get("http://opensource.demo.orangehrm.com");
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		 driver.findElement(By.id("txtPassword")).sendKeys("admin");
		 driver.findElement(By.id("btnLogin")).click();
         
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		driver.findElement(By.id("firstName")).sendKeys("kiran");
		driver.findElement(By.id("lastName")).sendKeys("kotha");
		driver.findElement(By.id("employeeId")).clear();
		driver.findElement(By.id("employeeId")).sendKeys("0093");
		driver.findElement(By.id("btnSave")).click();
	
	}

}
