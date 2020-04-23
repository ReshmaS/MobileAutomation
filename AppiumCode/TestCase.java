package Maven.MobileAutomation;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import Pageobjects.Search;
import Pageobjects.Sign_inPage;
import Pageobjects.Utilities;
import Pageobjects.Wishlist;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class TestCase extends Base {
	
	@BeforeTest()
	public void setup() throws IOException {
		driver=capabilities();
		
	}

	@Parameters({ "email", "pass" })
	public void Search_Item(String email, String pass) throws MalformedURLException {

		AndroidDriver<AndroidElement> driver = capabilities();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//-------Login Functionality-------------------------------------------------------------------------------//
		Sign_inPage signin = new Sign_inPage(driver);
		signin.Sign_In.click();
		signin.EmailID.sendKeys(email);
		signin.Continue.click();
		signin.Password.sendKeys(pass);
		signin.LogIn.click();
		
		//----Search Functionality----------------------------------------------------------------------------------//
		
		Search s = new Search(driver);
		s.Searchbox.sendKeys("65 inch TV");
		WebElement tapele = driver.findElementByClassName("(//android.widget.LinearLayout)[1]");
		TouchAction t = new TouchAction(driver);
		t.tap(tapOptions().withElement(element(tapele))).perform();
		
//----Reuse of the methods which are defined in the Utility Class-------------------------------//
		
		Utilities u = new Utilities(driver);
		u.scrolltoText("by Koryo");
        s.productlist.get(4).click();
        
//--------Adding the product to wish list----------------------------------------------------------------------//
		u.scrolltoText("ADD TO WISH LIST");
		Wishlist w = new Wishlist(driver);
		w.Wishlist.click();
		w.WishlistNumber.click();
		String Pagetext = driver.findElementByXPath("//android.view.View[contains(@resource-id,'itemWrapper')]").getText();
		String Expected = "Shinco 165 cm (65 Inches) 4K UHD Smart LED TV S65QHDR10 (Black) (2019 model)";
        Assert.assertEquals(Expected, Pagetext);
	}
	
	
	@AfterTest
	public void teardown() {
		driver.close();
		driver=null;
		//to avoid increase of memory
	}

}
