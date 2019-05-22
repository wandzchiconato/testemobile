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

public class calc2 {

  private AndroidDriver driver;

  @Before
  public void setUp() throws MalformedURLException {
    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
    desiredCapabilities.setCapability("platformName", "Android");
    desiredCapabilities.setCapability("deviceName", "emulator-5554");
    desiredCapabilities.setCapability("automationName", "uiautomator2");
    desiredCapabilities.setCapability("noReset", "true");
    desiredCapabilities.setCapability("appPackage", "com.android.calculator2");
    desiredCapabilities.setCapability("appActivity", "com.android.calculator2.Calculator");

    URL remoteUrl = new URL("http://localhost:4723/wd/hub");

    driver = new AndroidDriver(remoteUrl, desiredCapabilities);
  }

  @Test
  public void sampleTest() {
    MobileElement el1 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_1");
    el1.click();
    MobileElement el2 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_7");
    el2.click();
    MobileElement el3 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_8");
    el3.click();
    MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("multiply");
    el4.click();
    MobileElement el5 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_8");
    el5.click();
    MobileElement el6 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_5");
    el6.click();
    MobileElement el7 = (MobileElement) driver.findElementByAccessibilityId("equals");
    el7.click();
  }

  @After
  public void tearDown() {
    driver.quit();
  }
}