package Login2;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Utility.SeleniumUtility;

public class testseleniumutility extends SeleniumUtility {
WebDriver driver;
	@Test
public void tc1()
{
	driver=setup(getvaluefrompropertyfile("browser"),getvaluefrompropertyfile("appUrl"));
	
	}
}
