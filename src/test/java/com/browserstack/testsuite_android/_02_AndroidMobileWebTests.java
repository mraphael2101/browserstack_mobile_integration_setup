package com.browserstack.testsuite_android;

import com.browserstack.base.DriverManager;
import io.appium.java_client.AppiumDriver;
import org.junit.Test;

import static com.browserstack.base.DriverManager.getDriver;

public class _02_AndroidMobileWebTests {
    private final AppiumDriver<?> driver;

    public _02_AndroidMobileWebTests() throws Exception {
        DriverManager driverManager = new DriverManager();
        driverManager.setPlatform("Android_Web");
        driver = getDriver();
    }

    @Test
    public void androidMobileWebTest() throws Exception {
        System.out.println(driver.getContext());
        driver.get("https://uk.nttdata.com/");
        Thread.sleep(6000);
    }

}