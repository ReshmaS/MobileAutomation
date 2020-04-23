package Pageobjects;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Search {
	
	public Search(AndroidDriver<AndroidElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	}
	
	@AndroidFindBy(uiAutomator="text(\"Search\")")
	public WebElement Searchbox;
	
	public WebElement getSearchbox()
	{
		return Searchbox;
	}
	
	
	
	@AndroidFindBy(id="//in.amazon.mShop.android.shopping:id/list_product_linear_layout")
	public List<WebElement> productlist;
	
	public WebElement getProducts()
	{
		return (WebElement) productlist;
	}
	

	
	
	

	

}
