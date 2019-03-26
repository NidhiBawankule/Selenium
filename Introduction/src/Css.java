import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/interview.php");
		driver.findElement(By.cssSelector("#tablist1-tab1")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#tablist1-tab2")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#tablist1-tab3")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#tablist1-tab4")).click();
		Thread.sleep(1000);
        driver.quit();
	}

}
