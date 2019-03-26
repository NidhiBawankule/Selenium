import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesforce {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        //selenium code-
		//create driver object for chromedriver
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.get("https://login.salesforce.com/?locale=in");
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("hello");
		driver.findElement(By.name("pw")).sendKeys("pwd");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		Thread.sleep(5000);
		driver.quit();
		
	}

}