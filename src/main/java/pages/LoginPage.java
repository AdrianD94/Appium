package pages;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.offset.PointOption;
import models.LoginModel;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;

import static io.appium.java_client.touch.offset.PointOption.point;
import static org.testng.Assert.*;

public class LoginPage {
    AndroidDriver driver;

    /*public LoginPage(WebDriver driverLn) {
        {
            this.driver = driverLn;
        }

    }*/

    @FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[2]")
    private WebElement loginInButton;

    @FindBy(how = How.ID, using = "com.guzmanygomez.gyg.uat:id/rf_edit_text")
    private WebElement emailField;

    @FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/TextInputLayout/android.widget.FrameLayout/android.widget.EditText")
    private WebElement passwordField;

    @FindBy(how = How.ID, using = "com.guzmanygomez.gyg.uat:id/f_start_but_login")
    private WebElement loginButton;

    @FindBy (how = How.ID, using = "com.guzmanygomez.gyg.uat:id/dialog_tb_tv_text")
    private WebElement loginError;

    @FindBy (how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[2]")
    private WebElement welcomeMessage;


    //-----------------------------------------------------------------------------------------------

    @FindBy (how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout[2]")
    private WebElement locationButton;

    @FindBy (how = How.ID, using = "com.guzmanygomez.gyg.uat:id/choose_autoCompleteSearch")
    private WebElement searchField;


    @FindBy (how = How.XPATH, using = " /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.TextView[1]")
    private WebElement storeNameResult;



    public void LoginFlow(LoginModel model) throws InterruptedException {
       Thread.sleep(5000);
       loginInButton.click();
        //emailField.click();
        //emailField.clear();
        Thread.sleep(5000);
        emailField.sendKeys(model.getEmailAddress());
        //passwordField.click();
        //passwordField.clear();
        passwordField.sendKeys(model.getPassword());
        loginButton.click();

       // WebDriverWait wait = new WebDriverWait(driver,15);
        //wait.until(ExpectedConditions.visibilityOf(welcomeMessage));

       // Thread.sleep(10000);
        //assertTrue(welcomeMessage.isDisplayed());

        //assertEquals("Welcome Adrian",welcomeMessage.getText());

        System.out.println("Login test passed");

        //assertFalse(loginError.isDisplayed());
    }


    public void CheckEmptyOrders(String storeName) throws InterruptedException {
        Thread.sleep(5000);
        //WebDriverWait wait=new WebDriverWait(driver,20);
        //wait.until(ExpectedConditions.visibilityOf(locationButton));
        locationButton.click();
        Thread.sleep(5000);
        searchField.sendKeys(storeName);
        Thread.sleep(5000);


        //driver.findElement(By.xpath("//*[@text='"+storeName+"']")).click();
        //Thread.sleep(5000);

        TouchAction tap=new TouchAction(driver);
        tap.press(PointOption.point(202,594)).release();
        tap.perform();


        //tap.longPress(point(202,594)).release();
        //tap.longPress(-250,600).release();
        //Thread.sleep(5000);

        //TouchAction swipe=new TouchAction(driver);
        //Thread.sleep(5000);
        //swipe.press(195,585);
        //Thread.sleep(5000);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), '"+storeName+"')]")));
        //assertNotNull(driver.findElement(By.xpath("//*[contains(text(), '"+storeName+"')]")));
        //driver.findElement(By.xpath("//*[contains(text(), '"+storeName+"')]")).click();

        //wait.until(ExpectedConditions.visibilityOf(searchField));
        //searchField.click();
        //searchField.sendKeys(storeName);

        //searchField.sendKeys(storeName);
        //driver.findElement(By.id("com.guzmanygomez.gyg.uat:id/choose_store_list")).sendKeys(storeName);
        //List<WebElement> listItems=driver.findElements(By.id("com.guzmanygomez.gyg.uat:id/choose_store_list"));
        //listItems.get(0).click();
        /*wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.guzmanygomez.gyg.uat:id/choose_store_list")));
        driver.findElement(By.id("com.guzmanygomez.gyg.uat:id/choose_store_list")).click();
        List<WebElement> listItems=driver.findElements(By.id("com.guzmanygomez.gyg.uat:id/choose_store_list"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.guzmanygomez.gyg.uat:id/choose_store_list")));
        listItems.get(0).click();
        */





    }



}