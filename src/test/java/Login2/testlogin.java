package Login2;

public class testlogin {
// pull code from git
  
@Test
public void tc2()
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https:\\www.google.com");
	System.out.println(driver.getTitle());
	}

}
