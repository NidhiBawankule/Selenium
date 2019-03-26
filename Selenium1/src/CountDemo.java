import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
	       WebDriver driver =new ChromeDriver();
	       driver.get("https://www.makemytrip.com/");
	       //driver.get("http://qaclickacademy.com/practice.php");
	       System.out.println(driver.findElements(By.tagName("a")).size());
	       WebElement footdriver=driver.findElement(By.xpath("//div[@class='cfoot__container cfoot__borderTop']"));
	       System.out.println(footdriver.findElements(By.tagName("a")).size());
	       WebElement colmndriver=driver.findElement(By.xpath("//div[@class='cfooter_small']//section[1]"));
	       int a=colmndriver.findElements(By.tagName("a")).size();
	       System.out.println(colmndriver.findElements(By.tagName("a")).size());
	       for(int i=0;i<a;i++)
	       {
	    	   String clickon=Keys.chord(Keys.CONTROL,Keys.ENTER);
	    	   colmndriver.findElements(By.tagName("a")).get(i).sendKeys(clickon);
	    	   Thread.sleep(1000L);
	       }   
	    	   Set <String> abc=driver.getWindowHandles();
	    	   Iterator <String> it=abc.iterator();
	    	   while(it.hasNext())
	    	   {
	    		   driver.switchTo().window(it.next());
	    		   System.out.println(driver.getTitle());
	    	   }
	    	   
	       

	}

}
