package sampleGetir;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.net.MalformedURLException;
import java.net.URL;

public class Hook {

     private static com.thoughtworks.gauge.Logger logger;
     public static AppiumDriver<MobileElement> appiumDriver;
     public  static DesiredCapabilities cap ;


     public static void main(String[] args) throws MalformedURLException, InterruptedException {

          System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!Test!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

          logger.info("Test");
          cap = new DesiredCapabilities();
          cap.setCapability("platformName", "Android");
          cap.setCapability("deviceName", "G6");
          cap.setCapability("automationName", "uiautomator2");
          cap.setCapability("appPackage", "com.allandroidprojects.getirsample");
          cap.setCapability("appActivity", "com.allandroidprojects.getirsample.startup.SplashActivity");
          cap.setCapability("fullReset","false");
          cap.setCapability("noReset","true");


          URL url = new URL("http://127.0.0.1:4723/wd/hub");
          appiumDriver = new AndroidDriver(url, cap);
          Thread.sleep(3000);



     }

}


