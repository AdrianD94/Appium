package pages;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import models.LoginModel;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

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

    @FindBy (how = How.ID, using = "com.guzmanygomez.gyg.uat:id/dialog_tb_tv_text")
    private WebElement wrongLoginDialog;

    @FindBy (how = How.ID, using = "com.guzmanygomez.gyg.uat:id/dialog_tb_but_left")
    private WebElement wrongLoginDialogOk;

    //-----------------------------------------------------------------------------------------------


    public void LoginFlow(LoginModel model) throws InterruptedException {
      WebDriverWait wait=new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOf(loginInButton));
        loginInButton.click();
        wait.until(ExpectedConditions.visibilityOf(emailField));

        //---------------------Bad email flow------------------

        emailField.sendKeys(model.getBadEmail());
        passwordField.sendKeys(model.getBadPassword());
        Assert.assertFalse(loginButton.isEnabled());

        //----------------Wrong email good password flow------------
        emailField.clear();
        passwordField.clear();
        emailField.sendKeys(model.getWrongEmail());
        passwordField.sendKeys(model.getPassword());
        loginButton.click();
        wait.until(ExpectedConditions.visibilityOf(wrongLoginDialog));
        assertTrue(wrongLoginDialog.isDisplayed());
        assertEquals(wrongLoginDialog.getText(),"The user name or password is incorrect.");
        wrongLoginDialogOk.click();

        //----------------------Good email Wrong Password flow------------------------------------

        emailField.clear();
        passwordField.clear();
        emailField.sendKeys(model.getEmailAddress());
        passwordField.sendKeys(model.getBadPassword());
        loginButton.click();
        wait.until(ExpectedConditions.visibilityOf(wrongLoginDialog));
        assertTrue(wrongLoginDialog.isDisplayed());
        assertEquals(wrongLoginDialog.getText(),"The user name or password is incorrect.");
        wrongLoginDialogOk.click();


        //-------------Wrong email wrong password-----------------

        emailField.clear();
        passwordField.clear();
        emailField.sendKeys(model.getWrongEmail());
        passwordField.sendKeys(model.getBadPassword());
        loginButton.click();
        wait.until(ExpectedConditions.visibilityOf(wrongLoginDialog));
        assertTrue(wrongLoginDialog.isDisplayed());
        assertEquals(wrongLoginDialog.getText(),"The user name or password is incorrect.");
        wrongLoginDialogOk.click();

        //---------------Happy flow-------------------------------
        emailField.clear();
        passwordField.clear();
        emailField.sendKeys(model.getEmailAddress());

        wait.until(ExpectedConditions.visibilityOf(passwordField));
        passwordField.sendKeys(model.getPassword());
        loginButton.click();


        wait.until(ExpectedConditions.visibilityOf(welcomeMessage));


        assertTrue(welcomeMessage.isDisplayed());

        assertEquals("Welcome Ady",welcomeMessage.getText());

        System.out.println("Login test passed");


    }



}