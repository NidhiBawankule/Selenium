import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		System.out.println(driver.findElements(By.cssSelector("input[name='radioButton']")).size());
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[value='radio3']")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.cssSelector("input[value='radio3']")).isSelected());
		Thread.sleep(1000);
		driver.quit();
	}

}
