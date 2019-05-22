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

public class whatsApp3 {

  private AndroidDriver driver;

  @Before
  public void setUp() throws MalformedURLException {
    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
    desiredCapabilities.setCapability("platformName", "Android");
    desiredCapabilities.setCapability("deviceName", "emulator-5554");
    desiredCapabilities.setCapability("automationName", "uiautomator2");
    desiredCapabilities.setCapability("noReset", "true");
    desiredCapabilities.setCapability("appPackage", "com.whatsapp");
    desiredCapabilities.setCapability("appActivity", "com.whatsapp.Main");

    URL remoteUrl = new URL("http://localhost:4723/wd/hub");

    driver = new AndroidDriver(remoteUrl, desiredCapabilities);
  }

  @Test
  public void sampleTest() {
    MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Search");
    el1.click();
    MobileElement el2 = (MobileElement) driver.findElementById("com.whatsapp:id/search_src_text");
    el2.click();
    el2.sendKeys("dafne");
    el2.click();
    el2.click();
    MobileElement el3 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/android.widget.ListView/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.TextView");
    el3.click();
    MobileElement el4 = (MobileElement) driver.findElementById("com.whatsapp:id/entry");
    el4.click();
    el4.sendKeys("olá Dafne, eu sou um robo, vc quer tc comigo?");
    MobileElement el5 = (MobileElement) driver.findElementByAccessibilityId("Send");
    el5.click();
    MobileElement el6 = (MobileElement) driver.findElementById("com.whatsapp:id/entry");
    el6.click();
    el6.sendKeys("meu nome é RoboWanderson");
    MobileElement el7 = (MobileElement) driver.findElementByAccessibilityId("Send");
    el7.click();
  }

  @After
  public void tearDown() {
    driver.quit();
  }
}
