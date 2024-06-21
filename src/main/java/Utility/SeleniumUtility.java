package Utility;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumUtility {
	
	
	
	//global static varaiable
	public static WebDriver driver;
	public static WebDriverWait wait;
	protected static FileInputStream fis;
	protected static Properties properties;
protected static String filepath;
//nonststic globle avaraible
protected Actions action;
	//static block is use to load property and open desired browser info
	static {
	filepath= System.getProperty("user.dir")+"\\src\\test\\resources\\TestData\\config.properties";
	properties=new Properties();
	try {
		fis=new FileInputStream(filepath);
		properties.load(fis);
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	}
	
	// create reusable method for browser
	public WebDriver setup(String browsername, String url)
	{
		if(browsername.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}else if(browsername.equalsIgnoreCase("firefox")) {
			driver =new FirefoxDriver();
		}else if(browsername.equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();
}
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
//depricated use below instead of wait=new WebDriverWait(driver,20);
	 wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		driver.get(url);
		action=new Actions(driver);
		return driver;

		
	}
	
	
public String getvaluefrompropertyfile(String key)
{
	return properties.getProperty(key);
	}


public static WebDriver getdriver()
{
	return driver;
	}

public void typeinput(WebElement element,String input)
{
	waitForElementDisplayed(element);
	element.clear();
	element.sendKeys(input);
	}

public void typeeinput(WebElement element ,String input)
{ waitForElementDisplayed(element);
element.clear();
element.sendKeys(input);
	}

public void typeinputtext(WebElement element , String input)
{waitForElementDisplayed(element);
element.clear();
element.sendKeys(input);
	}

public void typeinputpract(WebElement element, String input)
{
	waitForElementDisplayed(element);
	element.clear();
	element.sendKeys(input);
	}
 
public void waitForElementDisplayed(WebElement element) {
	// TODO Auto-generated method stub
	wait.until(ExpectedConditions.visibilityOf(element));

}


public void clickonelement(WebElement element) {
	// TODO Auto-generated method stub
	element.click();
}

/**
 * Method to get the title of current page
 */
public String getCurrentTitleOfApplication(String title) {
	wait.until(ExpectedConditions.titleContains(title));
	return driver.getTitle();
}
}
