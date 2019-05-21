package mobile;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;

public class mobile_motorola {

  private AndroidDriver driver;

  @Before
  public void setUp() throws MalformedURLException {
    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
    desiredCapabilities.setCapability("udid", "0036795549");
    desiredCapabilities.setCapability("deviceName", "Moto_G__4_");
    desiredCapabilities.setCapability("platformName", "Android");
    desiredCapabilities.setCapability("automationName", "uiautomator2");
    desiredCapabilities.setCapability("appPackage", "com.google.android.calculator");
    desiredCapabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
    desiredCapabilities.setCapability("noReset", "true");

    URL remoteUrl = new URL("http://localhost:4723/wd/hub");

    driver = new AndroidDriver(remoteUrl, desiredCapabilities);
  }

  @Test
  public void sampleTest() {
    MobileElement el1 = (MobileElement) driver.findElementById("com.google.android.calculator:id/digit_1");
    el1.click();
    MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("multiplicar");
    el2.click();
    MobileElement el3 = (MobileElement) driver.findElementById("com.google.android.calculator:id/digit_8");
    el3.click();
    MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("igual");
    el4.click();
  }

  @After
  public void tearDown() {
    driver.quit();
  }
}
