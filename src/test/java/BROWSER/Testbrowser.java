package BROWSER;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testbrowser {
@Test
public void tc1()
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https:\\www.google.com");
	System.out.println(driver.getTitle());
	}

@Test
public void tc2()
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https:\\www.google.com");
	System.out.println(driver.getTitle());
	}
}

