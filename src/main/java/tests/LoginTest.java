package tests;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import models.LoginModel;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by casab on 11/2/2017.
 */
public class LoginTest extends BaseTestLogin {

    @DataProvider(name = "LoginJson")
    public Iterator<Object[]> jsonLoginDataProvider() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Collection<Object[]> dp = new ArrayList<>();

        File[] files = getListOfFiles("login");
        for (File f : files) {
            LoginModel m = objectMapper.readValue(f, LoginModel.class);
            dp.add(new Object[]{m});
        }
        return dp.iterator();
    }

    @Test(dataProvider = "LoginJson",priority = 1)
    public void mainLoginTest(LoginModel loginModel) throws InterruptedException {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

        loginPage.LoginFlow(loginModel);

    }
    /*@Test(dataProvider = "LoginJson",priority=2)
    public void ChurosScenario(LoginModel loginModel) throws InterruptedException {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.CheckChurosScenario("Newtown");

    }*/
    @Test(dataProvider = "LoginJson",priority=3)
    public void AddProductToCartTest(LoginModel loginModel) throws InterruptedException {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.AddProductToCart("Newtown");


    }

    @Test(dataProvider = "LoginJson",priority=4)
    public void Reorder(LoginModel loginModel) throws InterruptedException {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.reorder("Newtown");


    }








}