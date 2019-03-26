import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class budgetTracker {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://localhost:8090");
		driver.findElement(By.xpath("//input[@id='emailId']")).sendKeys("nidhibawankule@gmail.com");
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("abc");
		driver.findElement(By.xpath("//button[contains(@onclick,'return false;')]")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//a[contains(text(),'Create an account')]")).click();
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("nidhi");
		driver.findElement(By.xpath("//input[@id='emailID']")).sendKeys("nidhibawankule@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@id='conform_password']")).sendKeys("abc");
		driver.findElement(By.xpath("//button[@value='Sign Up']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='emailId']")).sendKeys("nidhibawankule@gmail.com");
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("abc");
		driver.findElement(By.xpath("//button[contains(@onclick,'return false;')]")).click();
		Thread.sleep(1000);
		Assert.assertEquals(driver.findElement(By.xpath("//div[@class='budget__income--text']")).getText(),"INCOME");
		Thread.sleep(1000);
		driver.quit();
	}

}
