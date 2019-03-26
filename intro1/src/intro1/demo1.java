import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 //selenium code-
		
		//create driver object for chromedriver
		
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		driver.get("https://www.udemy.com/organization/global-login/email");
		Thread.sleep(5000);
		//driver.navigate().forward();
		//driver.navigate().back();
		//driver.quit();
		driver.findElements(By.id("organization-global-login-email-input")).);
		
	}

}