package pages;
import enums.Mobile;
import io.appium.java_client.*;
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
import org.testng.Assert;
import tests.Os;

import java.io.IOException;
import java.net.MalformedURLException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;

import static io.appium.java_client.touch.offset.PointOption.point;
import static org.testng.Assert.*;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driverLn) {
        {
            this.driver = driverLn;
        }

    }

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


    @FindBy (how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.Button")
    private WebElement orderNowButton;


    @FindBy (how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.ImageView[1]")
    private WebElement burritoBowls;


    @FindBy (how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.View")
    private WebElement grilledChicken;

    @FindBy (how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.Button\n")
    private WebElement nextButtonFillings;

    @FindBy (how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.TextView[3]")
    private WebElement nextButtonExtras;


    @FindBy (how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.TextView[3]")
    private WebElement addPayButton;

    @FindBy (how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.Button[2]")
    private WebElement checkoutButton;

    @FindBy (how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.ImageView[2]")
    private WebElement payPallButton;

    @FindBy (how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.Button")
    private WebElement tapToMakeOrderButton;

    @FindBy (how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.Button")
    private WebElement changeTaqueriaButton;

    @FindBy (how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView[2]")
    private WebElement timeSelector;

    @FindBy (how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView[2]\n")
    private WebElement orderStatus;

    @FindBy (how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[6]/android.widget.RelativeLayout/android.widget.ImageView[1]\n")
    private WebElement Churros;


    @FindBy (how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView\n")
    private WebElement ChurrosErrorMessage;

    @FindBy (how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[2]")
    private WebElement reorderChangeLocation;

    @FindBy (how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.EditText\n")
    private WebElement reorderSearchInput;

    @FindBy (how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.EditText\n")
    private WebElement reorderButtonHome;

    @FindBy (how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout\n")
    private WebElement yourLastMealDialog;

    @FindBy (how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ImageView[3]\n")
    private WebElement yourLastMealDialog3Star;

    @FindBy (how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView\n")
    private WebElement yourLastMealDialogGraciasMessage;


    public void LoginFlow(LoginModel model) throws InterruptedException {
      WebDriverWait wait=new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOf(loginInButton));
        loginInButton.click();
        wait.until(ExpectedConditions.visibilityOf(emailField));
        emailField.sendKeys(model.getEmailAddress());

        wait.until(ExpectedConditions.visibilityOf(passwordField));
        passwordField.sendKeys(model.getPassword());
        loginButton.click();


        wait.until(ExpectedConditions.visibilityOf(welcomeMessage));


        assertTrue(welcomeMessage.isDisplayed());

        assertEquals("Welcome Ady",welcomeMessage.getText());

        System.out.println("Login test passed");


    }


    public void AddProductToCart(String storeName) throws InterruptedException {

        WebDriverWait wait=new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOf(locationButton));
        locationButton.click();
        wait.until(ExpectedConditions.visibilityOf(searchField));
        searchField.sendKeys(storeName);

        Thread.sleep(3000);
        TouchAction tap=new TouchAction((AndroidDriver)driver);
        tap.press(PointOption.point(202,594)).release();
        tap.perform();

        wait.until(ExpectedConditions.visibilityOf(orderNowButton));
        orderNowButton.click();

        wait.until(ExpectedConditions.visibilityOf(burritoBowls));
        burritoBowls.click();

        wait.until(ExpectedConditions.visibilityOf(grilledChicken));
        grilledChicken.click();

        nextButtonFillings.click();

        wait.until(ExpectedConditions.visibilityOf(nextButtonExtras));
        nextButtonExtras.click();

        wait.until(ExpectedConditions.visibilityOf(addPayButton));
        addPayButton.click();

        wait.until(ExpectedConditions.visibilityOf(checkoutButton));
        checkoutButton.click();

        Thread.sleep(9000);


      /* tap.longPress(PointOption.point(700,1866));
       tap.moveTo(PointOption.point(712,1866));
       tap.release();
       tap.perform();
        */

        Dimension size = this.driver.manage ()
                .window ()
                .getSize ();
        int startX = size.getWidth () / 2;
        int startY = size.getHeight () / 2;
        int endX = 0;
        int endY = (int) (startY * -1 * 0.75);

        tap.press (PointOption.point(startX, startY))
                .moveTo (PointOption.point(endX, endY))
                .release ()
                .perform ();

        wait.until(ExpectedConditions.visibilityOf(payPallButton));
        payPallButton.click();

        wait.until(ExpectedConditions.visibilityOf(tapToMakeOrderButton));
        tapToMakeOrderButton.click();

        Thread.sleep(10000);
        tap.press(PointOption.point(213,1283)).release().perform();
        Thread.sleep(10000);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.TextView")));

        Assert.assertEquals(orderStatus.getText(),"Success");

    }

    public void CheckChurosScenario(String storeName) throws InterruptedException {
        WebDriverWait wait =new WebDriverWait(driver,20);



        wait.until(ExpectedConditions.visibilityOf(locationButton));
        locationButton.click();
        wait.until(ExpectedConditions.visibilityOf(searchField));
        searchField.sendKeys(storeName);

        Thread.sleep(3000);
        TouchAction tap=new TouchAction((AndroidDriver)driver);
        tap.press(PointOption.point(202,594)).release();
        tap.perform();

        wait.until(ExpectedConditions.visibilityOf(orderNowButton));
        orderNowButton.click();

        Thread.sleep(9000);

        Dimension size = this.driver.manage ()
                .window ()
                .getSize ();
        int startX = size.getWidth () / 2;
        int startY = size.getHeight () / 2;
        int endX = 0;
        int endY = (int) (startY * -1 * 0.75);

        tap.press (PointOption.point(startX, startY))
                .moveTo (PointOption.point(endX, endY))
                .release ()
                .perform ();

        Thread.sleep(5000);

        wait.until(ExpectedConditions.visibilityOf(Churros));
        Churros.click();

        //wait.until(ExpectedConditions.visibilityOf(nextButtonFillings));

        //nextButtonFillings.click();

        wait.until(ExpectedConditions.visibilityOf(nextButtonExtras));
        nextButtonExtras.click();

        //wait.until(ExpectedConditions.visibilityOf(addPayButton));
        //addPayButton.click();

        wait.until(ExpectedConditions.visibilityOf(checkoutButton));
        checkoutButton.click();

        Thread.sleep(9000);


      /* tap.longPress(PointOption.point(700,1866));
       tap.moveTo(PointOption.point(712,1866));
       tap.release();
       tap.perform();
        */

        Dimension size2 = this.driver.manage ()
                .window ()
                .getSize ();
        int startX2 = size.getWidth () / 2;
        int startY2 = size.getHeight () / 2;
        int endX2 = 0;
        int endY2 = (int) (startY * -1 * 0.75);

        tap.press (PointOption.point(startX2, startY2))
                .moveTo (PointOption.point(endX2, endY2))
                .release ()
                .perform ();

        wait.until(ExpectedConditions.visibilityOf(payPallButton));
        payPallButton.click();

        wait.until(ExpectedConditions.visibilityOf(tapToMakeOrderButton));
        tapToMakeOrderButton.click();

        Thread.sleep(10000);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")));

        Assert.assertEquals(ChurrosErrorMessage.getText(),"Error");
    }


    public void reorder(String storeName) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 20);

            wait.until(ExpectedConditions.visibilityOf(reorderChangeLocation));
            reorderChangeLocation.click();

            wait.until(ExpectedConditions.visibilityOf(reorderSearchInput));
            reorderSearchInput.sendKeys(storeName);
            Thread.sleep(2000);
            TouchAction tap = new TouchAction((AndroidDriver) driver);
            tap.press(PointOption.point(219, 588)).release().perform();
            wait.until(ExpectedConditions.visibilityOf(welcomeMessage));
            tap.press(PointOption.point(1037, 1390)).release().perform();
            wait.until(ExpectedConditions.visibilityOf(checkoutButton));
            checkoutButton.click();
            Thread.sleep(9000);


            Dimension size = this.driver.manage()
                    .window()
                    .getSize();
            int startX = size.getWidth() / 2;
            int startY = size.getHeight() / 2;
            int endX = 0;
            int endY = (int) (startY * -1 * 0.75);

            tap.press(PointOption.point(startX, startY))
                    .moveTo(PointOption.point(endX, endY))
                    .release()
                    .perform();

            wait.until(ExpectedConditions.visibilityOf(payPallButton));
            payPallButton.click();

            wait.until(ExpectedConditions.visibilityOf(tapToMakeOrderButton));
            tapToMakeOrderButton.click();

            Thread.sleep(10000);
            tap.press(PointOption.point(213, 1283)).release().perform();
            //Thread.sleep(10000);

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.TextView")));

            Assert.assertEquals(orderStatus.getText(), "Success");



    }
}