package program1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class pgm1
{
    
	//@Parameters("browser")
	@Parameters("browser")
	@Test
	public void method1(String value)
	
	{
		
	WebDriver driver=null;	
	if(value.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver","C:\\GITArtifacts\\chromedriver.exe");
        driver=new ChromeDriver();
	}
    	else if(value.equals("firefox"))
    	{
    	System.setProperty("webdriver.gecko.driver","C:\\Demo1\\geckodriver.exe");
        driver=new FirefoxDriver();
    	}
	
    	else {
    		System.out.println("No Driver Found");
    		}

    	driver.get("https://github.com/login");
    	driver.manage().window().maximize();
    	
    	String name;
		driver.findElement(By.name(name="login")).click();
		driver.findElement(By.name(name="login")).sendKeys("pavi-01");
    	driver.findElement(By.name(name="password")).sendKeys("Admin2018");
    	driver.findElement(By.name(name="commit")).click();
    	
    	String title=driver.getTitle();
    	System.out.println(title);
    	
    	Assert.assertEquals(title,"GitHub");
    	
       	//System.out.println("Continue to test...");
    	
   
	}
	
	
}  





