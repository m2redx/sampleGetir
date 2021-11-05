package sampleGetir;

import io.appium.java_client.MobileElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Step extends Hook {
    private Logger logger = LoggerFactory.getLogger(getClass());

    public void isExist (String key){

        

    }

    public void existClickByKey(String key) {


        MobileElement el = appiumDriver.findElementByAccessibilityId(key);
        el.click();
        logger.info("TIKLANDI");
    }

}


