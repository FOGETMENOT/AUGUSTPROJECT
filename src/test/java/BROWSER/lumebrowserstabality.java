package BROWSER;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Utility.SeleniumUtility;
import Webpages.LUMA_DashboardPage;

public class lumebrowserstabality extends SeleniumUtility{

	// create class initialization
	LUMA_DashboardPage getLumedashboardpage;
	WebDriver driver;
	@BeforeMethod
	public void precondition()
	{
		//open browera nd url
		driver=setup(getvaluefrompropertyfile("browser"), getvaluefrompropertyfile("appUrl"));
		getLumedashboardpage=new LUMA_DashboardPage(driver);
	}
	@Test
	public void browserstatbality()
	{
		getLumedashboardpage.modulewhatnew();
		String expectedtitle=getvaluefrompropertyfile("whatnewtitle");
		String acttitle=getCurrentTitleOfApplication(expectedtitle);
		Assert.assertEquals(acttitle, expectedtitle," either page failed title got changed");
	
	}
	
	@AfterMethod
	public void postcondition()
	{
		driver.close();
	}
}
