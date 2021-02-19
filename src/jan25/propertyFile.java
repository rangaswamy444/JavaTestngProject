package jan25;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class propertyFile 
{
	WebDriver driver;
	Properties p;
	FileInputStream fi;
	@BeforeTest
		public void setUp() throws Throwable
		{
			p= new Properties();
			fi=new FileInputStream("OR.properties");
			p.load(fi);
			if(p.getProperty("browser").equalsIgnoreCase("chrome"))
					{
				        Reporter.log("Executing on chrome",true);
						driver = new ChromeDriver();
						driver.get(p.getProperty("url"));
						driver.manage().window().maximize();
					}
			else if(p.getProperty("browser").equalsIgnoreCase("firefox"))
			{
				Reporter.log("Executing on firefox",true);
				driver = new FirefoxDriver();
				driver.get(p.getProperty("url"));
				
			}
			else
			{
				Reporter.log("Browser value is not matching",true);
			}
			
		}
	@Test
	public void verifyLogin() throws Throwable
	{
		
		driver.findElement(By.xpath(p.getProperty("objreset"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(p.getProperty("objusername"))).sendKeys("admin");
		Thread.sleep(5000);
		driver.findElement(By.xpath(p.getProperty("objpassword"))).sendKeys("master");
		driver.findElement(By.xpath(p.getProperty("objLoginbtn"))).submit();
		Thread.sleep(5000);
		String expected="dashboard";
		String actual=driver.getCurrentUrl();
		if(actual.contains(expected))
		{
			Reporter.log("Login success::"+expected+"   "+actual,true);
		}
		if(actual.contains(expected))
		{
			Reporter.log("Login fail::"+expected+"   "+actual,true);
		}
		
	}
	
	@AfterTest
	
		public void tearDown()
		{
			driver.close();
		}

	
}
