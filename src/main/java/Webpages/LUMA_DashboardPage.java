package Webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.SeleniumUtility;

public class LUMA_DashboardPage extends SeleniumUtility{
	
	//pagefactory  build in class of selenium web driver ,support page object mobdel design pattern
	//pom pages do not have main method
	// to use method of this class 
	// when object of class is created  contructor is called and with the help of pagefactory, initelement load all element on webpages 
	// is that page factory init is use to load pom element is withthe help of constuctor and invoke pagefactory built in seleniumwebdriver class
	
	//
public LUMA_DashboardPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
		
	}
//element on webpage
@FindBy(xpath="//a[@id='ui-id-3']//span[1]")
private WebElement  whatnew;

@FindBy(xpath="")
private  WebElement mens;

@FindBy(xpath="")
private WebElement womens;
@FindBy(xpath="")
private WebElement modulesales;

@FindBy(xpath="")
private WebElement trainingmodule;
public void modulewhatnew()

{
	clickonelement(whatnew);
	}

public void modulemens() {
	clickonelement(mens);
}


public void womens()
{
	clickonelement(womens);
	}


public void salesmodule()
{
	clickonelement(modulesales);
	}



public void trainingmodule() {
	clickonelement(trainingmodule);
}
}