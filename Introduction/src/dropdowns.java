import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

public class dropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		/*driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='PNQ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXTaction")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='DEL']")).click();
	    driver.findElement(By.id("divpaxinfo")).click();
	    Thread.sleep(2000);
	    for(int i=0;i<5;i++) {
	    driver.findElement(By.id("hrefIncAdt")).click();
	    }
	    driver.findElement(By.id("btnclosepaxoption")).click();
		Select s=new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		s.selectByValue("AED");
		Thread.sleep(1000);*/
		/*
		 // System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
            System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
{
System.out.println("its enabled");
Assert.assertTrue(true);
}
else
{
Assert.assertTrue(false);
}
*/
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id=ctl00_mainContent_chk_IndArm")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.cssSelector("input[id=ctl00_mainContent_chk_IndArm")).isSelected());
		Thread.sleep(1000);
		driver.quit();
	}

}
