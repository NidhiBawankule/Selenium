import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("http://qaclickacademy.com/practice.php");
        driver.findElement(By.xpath("//input[@placeholder='Select Countries']")).sendKeys("Ind");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Select Countries']")).sendKeys(Keys.DOWN);
        driver.findElement(By.xpath("//input[@placeholder='Select Countries']")).sendKeys(Keys.DOWN);
        //System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value")); [short trick]
        JavascriptExecutor js= (JavascriptExecutor)driver;
        String script = "return document.getElementById(\"autocomplete\").value;";
        String text=(String) js.executeScript(script);
        System.out.println(text);
	}

}
