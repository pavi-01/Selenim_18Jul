

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class pgm1
{
    @Test
	public void method1()
	{
		System.setProperty("webdriver.chrome.driver","C:\\GITArtifacts\\chromedriver.exe");
    	WebDriver driver=new ChromeDriver();
    	driver.get("https://github.com/login");
    	driver.manage().window().maximize();
    	
    	String name;
		driver.findElement(By.name(name="login")).click();
		driver.findElement(By.name(name="login")).sendKeys("pavi-01");
    	driver.findElement(By.name(name="password")).sendKeys("Admin2018");
    	driver.findElement(By.name(name="commit")).click();
    	
    	String title=driver.getTitle();
    	System.out.println(title);
    	
    	Assert.assertEquals(title,"Sign in to GitHub. GitHub");
    	
    	System.out.println("Continue to test...");
    	
    	Assert.assertEquals(title,"Sign in to GitHub. GitHub");
    	
    	
    	
		
	}
	
}  



/*public class pgm1
{
    @Test
	public void method1()
	{
		System.setProperty("webdriver.chrome.driver","C:\\GITArtifacts\\chromedriver.exe");
    	WebDriver driver=new ChromeDriver();
    	driver.get("https://github.com/login");
    	driver.manage().window().maximize();
    	
    	String name;
		driver.findElement(By.name(name="login")).click();
		driver.findElement(By.name(name="login")).sendKeys("pavi-01");
    	driver.findElement(By.name(name="password")).sendKeys("Admin2018");
    	driver.findElement(By.name(name="commit")).click();
    	
    	String title=driver.getTitle();
    	System.out.println(title);
    	
    	Assert.assertEquals(title,"Sign in to GitHub. GitHub");
    	
    	System.out.println("Continue to test...");
    	
    	
    	
    	
		
	}
	
}  */


