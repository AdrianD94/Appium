package tests;

import enums.Mobile;
import io.appium.java_client.android.AndroidDriver;
import org.apache.commons.logging.Log;
import org.aspectj.apache.bcel.classfile.Constant;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

/**
 * Created by casab on 11/2/2017.
 */
public class BaseTestLogin {
    public WebDriver driver;

    @BeforeMethod
    public void setUp() throws InterruptedException, MalformedURLException {



        driver = Os.getDriver(Mobile.ANDROID);



        Thread.sleep(1000);
    }


    public void quit() {
        driver.quit();
    }

    File[] getListOfFiles(String directoryName) {
        ClassLoader classLoader = getClass().getClassLoader();
        File directory = new File(classLoader.getResource(directoryName).getFile());
        File[] files = directory.listFiles();
        // System.out.println("Found " + files.length + " files in " + directoryName + " folder");
        return files;
    }

    @AfterMethod
    public void closeBrowser() throws InterruptedException{
        driver.quit();
    }
}