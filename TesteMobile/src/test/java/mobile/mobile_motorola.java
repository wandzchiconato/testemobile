package mobile;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
//import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;

public class mobile_motorola {

  private AndroidDriver<MobileElement> driver;

  @Before
  public void setUp() throws MalformedURLException {
    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
    desiredCapabilities.setCapability("platformName", "Android");
    desiredCapabilities.setCapability("deviceName", "emulator-5554");
    desiredCapabilities.setCapability("automationName", "uiautomator2");
    desiredCapabilities.setCapability("appPackage", "com.sec.android.app.popupcalculator");
    desiredCapabilities.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");

    URL remoteUrl = new URL("http://localhost:4723/wd/hub");

    driver = new AndroidDriver<MobileElement>(remoteUrl, desiredCapabilities);
  }

  @Test
  public void sampleTest() {
    MobileElement el1 = (MobileElement) driver.findElementById("com.sec.android.app.popupcalculator:id/bt_01");
    el1.click();
    MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Mais");
    el2.click();
    MobileElement el3 = (MobileElement) driver.findElementById("com.sec.android.app.popupcalculator:id/bt_02");
    el3.click();
    MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("Igual");
    el4.click();
    MobileElement el5 = (MobileElement) driver.findElementByAccessibilityId("Campo de entrada da Calculadora");
    el5.click();
  }

  @After
  public void tearDown() {
    driver.quit();
  }
}