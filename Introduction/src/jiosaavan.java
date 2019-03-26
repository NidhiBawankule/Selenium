import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jiosaavan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.jiosaavn.com/");
		//driver.findElement(By.id("idOfElement")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id='main']/div/ol/li[6]/div/a/div/div/button")).click();

	}

}
