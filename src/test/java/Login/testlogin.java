package Login;

public class testlogin {
@Test
public void tc1()
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https:\\www.google.com");
	System.out.println(driver.getTitle());
	}
}
