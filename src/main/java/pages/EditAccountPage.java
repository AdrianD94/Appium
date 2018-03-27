package pages;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import models.EditAccountModel;
import models.RegisterModel;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.DoubleTapAction;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class EditAccountPage {
    WebDriver driver;

    public EditAccountPage(WebDriver driverLn) {
        {
            this.driver = driverLn;
        }

    }



    @FindBy (how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout[5]\n")
    private WebElement moreButton;

    @FindBy (how = How.ID, using = "com.guzmanygomez.gyg.uat:id/more_edit_tv")
    private WebElement editAccountButton;

    @FindBy (how = How.ID, using = "com.guzmanygomez.gyg.uat:id/profile_save_bt")
    private WebElement saveChangesButton;

    @FindBy (how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[4]/TextInputLayout/android.widget.LinearLayout/android.widget.TextView")
    private WebElement postCodeError;


    @FindBy (how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[5]/android.widget.RelativeLayout/TextInputLayout/android.widget.LinearLayout/android.widget.TextView")
    private WebElement selectRestaurantError;

    @FindBy (how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[4]/TextInputLayout/android.widget.FrameLayout/android.widget.EditText\n")
    private WebElement zipInput;

    @FindBy (how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[5]/android.widget.RelativeLayout/TextInputLayout/android.widget.FrameLayout/android.widget.EditText\n")
    private WebElement selectRestaurant;

    @FindBy (how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[5]/android.widget.RelativeLayout/TextInputLayout/android.widget.FrameLayout/android.widget.EditText\n")
    private WebElement successMessage;


    public void editAccountFlow(EditAccountModel model) throws InterruptedException {

        WebDriverWait wait=new WebDriverWait(driver,50);
        wait.until(ExpectedConditions.visibilityOf(moreButton));
        moreButton.click();

        //-------------Edit account flow------------------

        wait.until(ExpectedConditions.visibilityOf(editAccountButton));
        editAccountButton.click();

        //----------------Edit account empty required fileds---------------
        Dimension size2 = this.driver.manage ()
                .window ()
                .getSize ();
        int startX2 = size2.getWidth () / 2;
        int startY2 = size2.getHeight () / 2;
        int endX2 = 0;
        int endY2 = (int) (startY2 * -1 * 0.75);
        TouchAction tap=new TouchAction<>((AndroidDriver)driver);
        tap.press (PointOption.point(startX2, startY2))
                .moveTo (PointOption.point(endX2, endY2))
                .release ()
                .perform ();

        wait.until(ExpectedConditions.visibilityOf(saveChangesButton));

        zipInput.clear();
        ((AndroidDriver) driver).hideKeyboard();

        saveChangesButton.click();



        wait.until(ExpectedConditions.visibilityOf(postCodeError));
        assertTrue(postCodeError.isDisplayed());
        assertEquals(postCodeError.getText(),"Please enter your postcode");

        wait.until(ExpectedConditions.visibilityOf(selectRestaurantError));
        assertTrue(selectRestaurantError.isDisplayed());
        assertEquals(selectRestaurantError.getText(),"Please select a restaurant");
        zipInput.clear();
        ((AndroidDriver) driver).hideKeyboard();
        zipInput.sendKeys(model.getZip());
        ((AndroidDriver) driver).hideKeyboard();
        wait.until(ExpectedConditions.elementToBeClickable(selectRestaurant));

        selectRestaurant.click();

        Thread.sleep(2000);
        tap.press(PointOption.point(415,885)).release().perform();

        wait.until(ExpectedConditions.visibilityOf(saveChangesButton));

        saveChangesButton.click();

        wait.until(ExpectedConditions.visibilityOf(editAccountButton));




    }





}