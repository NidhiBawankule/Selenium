import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
       WebDriver driver =new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.amazon.in/");
       Actions a=new Actions(driver);
       a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello");
       a.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-yourAccount']//span[@class='nav-line-2']"))).build().perform();
	}

}
