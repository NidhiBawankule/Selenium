import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
	       WebDriver driver =new ChromeDriver();
	     driver.get("http://qaclickacademy.com/practice.php");
	     System.out.println(driver.findElements(By.cssSelector("input[type='Checkbox']")).size());
	     driver.findElement(By.id("checkBoxOption2")).click();
	     String opt=driver.findElement(By.xpath("//label[@for='benz']")).getText();
	    driver.findElement(By.xpath("//select[@id='dropdown-class-example']")).click();
	    Select s=new Select(driver.findElement(By.xpath("//select[@id='dropdown-class-example']")));
	    s.selectByVisibleText(opt);
	     driver.findElement(By.xpath("//input[@id='name']")).sendKeys(opt);
	     Thread.sleep(1000L);
	     driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
	     Thread.sleep(1000L);
	     String s1=driver.switchTo().alert().getText();
	     System.out.println(driver.switchTo().alert().getText());
	     Thread.sleep(1000L);
	     if(s1.contains(opt)){

	    	 System.out.println("The message is correct");

	    	 }

	    	 else {

	    	 System.out.println("Somethings not right.");

	    	 }
	     driver.switchTo().alert().accept();
	     Thread.sleep(1000L);
	     driver.quit();
	}

}
