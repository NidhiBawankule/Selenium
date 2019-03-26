package test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class GlobalisePrac {
	public WebDriver driver=null;
	@Test
	public void login() throws IOException
	{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\NI20015104\\eclipse-workspace\\TestNGTutorial\\datadriven.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("username"));
		if(prop.getProperty("browser").equals("firefox"))
		{
			 driver=new FirefoxDriver();
		}
		else if(prop.getProperty("browser").equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
			 driver=new ChromeDriver();
		}
		else
		{
			 driver=new InternetExplorerDriver();
		}
		driver.get(prop.getProperty("url"));
	}

}
