package org.example;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;

import java.net.MalformedURLException;
import java.net.URL;

public class App 
{
    public static void main( String[] args ) throws MalformedURLException, InterruptedException {
        UiAutomator2Options options = new UiAutomator2Options()
                .setDeviceName("emulator-5554")
                .setPlatformVersion("12")
                .setPlatformName("Android")
                .setApp(System.getProperty("user.dir") + "/src/apps/app-debug.apk")
                .eventTimings();
        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
        driver.findElement(By.id("random"));
    }
}
