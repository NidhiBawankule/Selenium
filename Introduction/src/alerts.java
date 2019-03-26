import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		driver.findElement(By.xpath("//input[@value='Confirmation Alert']")).click();
		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
        driver.quit();
	}

}
/*package test;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerts {

public static void main(String[] args) {

// TODO Auto-generated method stub

WebDriver driver=new FirefoxDriver();

driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");

driver.findElement(By.xpath("html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/form/input")).click();

System.out.println(driver.switchTo().alert().getText());

//driver.switchTo().alert().sendKeys("fesfe");

driver.switchTo().alert().accept(); //Accept = ok done yes

//driver.switchTo().alert().dismiss();

}

}

*/
