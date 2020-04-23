package Pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Wishlist {
	
	public Wishlist(AndroidDriver<AndroidElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	}
	
	@AndroidFindBy(xpath="//android.view.View[contains(@resource-id,'add-to-wishlist-button-submit')]")
	public WebElement Wishlist;
	
	public WebElement getWishlist()
	{
		return Wishlist;
	}
	
	
	@AndroidFindBy(uiAutomator="text(\"Reshma's Wish List Reshma's Wish List Public\")")
	public WebElement WishlistNumber;
	
	public WebElement getWishlistNumber()
	{
		return WishlistNumber;
	}
	
	 
	    
	    

}
