package pages;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import models.LoginModel;
import models.RegisterModel;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class RegisterPage {
    WebDriver driver;

    public RegisterPage(WebDriver driverLn) {
        {
            this.driver = driverLn;
        }

    }

    @FindBy(how = How.ID, using = "com.guzmanygomez.gyg.uat:id/start_sign_up_bt")
    private WebElement signUpButton;

    @FindBy(how = How.ID, using = "com.guzmanygomez.gyg.uat:id/f_start_but_create_acc")
    private WebElement createAccountButton;

    @FindBy(how = How.XPATH, using ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/TextInputLayout/android.widget.FrameLayout/android.widget.EditText")
    private WebElement emailField;

    @FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/TextInputLayout/android.widget.FrameLayout/android.widget.EditText")
    private WebElement passwordField;

    @FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[3]/TextInputLayout/android.widget.FrameLayout/android.widget.EditText")
    private WebElement confirmPasswordField;

    @FindBy(how = How.ID, using = "com.guzmanygomez.gyg.uat:id/f_sign_up_but_create_acc")
    private WebElement createAccount;

    @FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView\n")
    private WebElement emailAlreadyExists;

    @FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button")
    private WebElement emailAlreadyExistsOkButton;

    @FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/TextInputLayout/android.widget.LinearLayout/android.widget.TextView")
    private WebElement badEmailError;

    @FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[3]/TextInputLayout/android.widget.LinearLayout/android.widget.TextView")
    private WebElement passwordDontMatchError;

    @FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView[1]")
    private WebElement yourInfo;

    @FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/TextInputLayout/android.widget.FrameLayout/android.widget.EditText")
    private WebElement firstName;

    @FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/TextInputLayout/android.widget.FrameLayout/android.widget.EditText")
    private WebElement lastName;

    @FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[3]/android.widget.RelativeLayout/TextInputLayout/android.widget.FrameLayout/android.widget.EditText")
    private WebElement phoneNumber;

    @FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout")
    private WebElement phoneNumberScreen;

    @FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.Button")
    private WebElement ContinueButton;


    @FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView[1]")
    private WebElement lastScreenYourInfo;

    @FindBy(how = How.ID, using = "com.guzmanygomez.gyg.uat:id/f_info_terms_checkbox")
    private WebElement iAgreeButton;

    @FindBy(how = How.ID, using = "com.guzmanygomez.gyg.uat:id/f_info_but_finish")
    private WebElement finishButton;

    @FindBy (how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[2]")
    private WebElement welcomeMessage;

    public void RegisterFlow(RegisterModel model) throws InterruptedException {

        WebDriverWait wait=new WebDriverWait(driver,50);
        wait.until(ExpectedConditions.visibilityOf(signUpButton));
        signUpButton.click();

        wait.until(ExpectedConditions.visibilityOf(emailField));

        //email already registered flow
        emailField.sendKeys(model.getRegisteredAddress());
        passwordField.click();
        wait.until(ExpectedConditions.visibilityOf(emailAlreadyExists));
        assertEquals(emailAlreadyExists.getText(),"Email already exists");
        emailAlreadyExistsOkButton.click();
        wait.until(ExpectedConditions.visibilityOf(createAccountButton));
        createAccountButton.click();



        //bad email address and different passwords
        wait.until(ExpectedConditions.visibilityOf(emailField));
        emailField.sendKeys(model.getBadEmail());
        passwordField.sendKeys(model.getPassword());
        confirmPasswordField.sendKeys(model.getPassword2());

        assertTrue(badEmailError.isDisplayed());
        assertEquals(badEmailError.getText(),"Please enter a valid email address");

        assertTrue(passwordDontMatchError.isDisplayed());
        assertEquals(passwordDontMatchError.getText(),"Passwords do not match");

        Assert.assertFalse(createAccount.isEnabled());



        //Happy flow


        emailField.click();
        emailField.clear();
        emailField.sendKeys(model.getEmailAddress());
        passwordField.clear();
        passwordField.sendKeys(model.getPassword());
        confirmPasswordField.clear();
        confirmPasswordField.sendKeys(model.getPassword());

        createAccount.click();

        //Your info flow

        wait.until(ExpectedConditions.visibilityOf(yourInfo));
        firstName.sendKeys(model.getFirstName());
        lastName.sendKeys(model.getLastName());
        phoneNumber.click();
        wait.until(ExpectedConditions.visibilityOf(phoneNumberScreen));
        phoneNumberScreen.sendKeys(model.getPhoneNumber());
        phoneNumberScreen.click();

        Thread.sleep(10000);
        //wait.until(ExpectedConditions.visibilityOf(ContinueButton));
        Assert.assertTrue(ContinueButton.isEnabled());
        ContinueButton.click();

        wait.until(ExpectedConditions.visibilityOf(lastScreenYourInfo));

        iAgreeButton.click();
        assertTrue(finishButton.isEnabled());
        finishButton.click();

        //Check the home page redirect
        wait.until(ExpectedConditions.visibilityOf(welcomeMessage));
        assertEquals(welcomeMessage.getText(),"Welcome "+model.getFirstName());
    }





}