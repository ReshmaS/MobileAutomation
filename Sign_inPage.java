package Pageobjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Sign_inPage {
	public Sign_inPage(AndroidDriver<AndroidElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	}
	
	@AndroidFindBy(xpath="//android.widget.button(@text='Already a customer? Sign in')")
	public WebElement Sign_In;
	
	public WebElement getSignin()
	{
		return Sign_In;
	}
	
	@AndroidFindBy(className="//android.widget.EditText")
	public WebElement EmailID;
	
	public WebElement getEmailID()
	{
		return EmailID;
	}
	
	@AndroidFindBy(xpath="//android.widget.Button(@text='Continue')\")")
	public WebElement Continue;
	
	public WebElement getContinue()
	{
		return Continue;
	}
	
	@AndroidFindBy(xpath="//android.widget.EditText[contains(@resource-id,'ap_password')]")
	public WebElement Password;
	
	public WebElement getPassword()
	{
		return Password;
	}
	
	@AndroidFindBy(uiAutomator="text(\"Login\")")
	public WebElement LogIn;
	
	public WebElement getLogin()
	{
		return LogIn;
	}
	
	
	
	

}
