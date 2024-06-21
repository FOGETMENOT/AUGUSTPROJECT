package BROWSER;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Utility.SeleniumUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Lumebrowsertest  extends SeleniumUtility{
	WebDriver driver;
@Test
public void lumewebsitestabality()
{
	WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	 driver.get("https://magento.softwaretestingboard.com");
	 driver.manage().window().maximize();
	 System.out.println(driver.getTitle());}
}







