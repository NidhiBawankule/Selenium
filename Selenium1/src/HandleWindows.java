import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
	       WebDriver driver =new ChromeDriver();
	       driver.get("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	       driver.findElement(By.xpath("//a[contains(text(),'Learn more')]")).click();
	       System.out.println(driver.getTitle());
	}

}
