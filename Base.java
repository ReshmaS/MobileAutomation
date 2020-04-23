package Maven.MobileAutomation;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
 
public class Base {
 
AndroidDriver<AndroidElement>driver;
 
public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException
{
 //File classpathRoot = new File(System.getProperty("user.dir"));
// File appDir = new File(classpathRoot, "/Apps/Amazon/");
 //File app = new File(appDir, "com.android.vending.apk");
 //File f=new File("src/main/java");
 //File fs=new File(f,"Amazon_shopping.apk");
 
 DesiredCapabilities cap = new DesiredCapabilities();
 //cap.setCapability(MobileCapabilityType.DEVICE_NAME, "RESHMAEMULATOR");
 cap.setCapability("deviceName", "XUV3Y18917001321");
 cap.setCapability("platformName", "Android");
 //cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
// cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
 AndroidDriver<AndroidElement>driver=new AndroidDriver<>(new URL("https://127.0.0.1:4723/wd/hub"),cap);
 cap.setCapability("appPackage", "in.amazon.mshop.android.shopping");
 cap.setCapability("appActivity", "com.amazon.mShop.home.HomeActivity");
 return driver;
 
 }


}
 