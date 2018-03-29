package tests;

import Framework.BaseTestLogin;
import com.fasterxml.jackson.databind.ObjectMapper;
import models.LoginModel;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.OrderPage;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by casab on 11/2/2017.
 */
public class OrderTest extends BaseTestLogin {

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


    /*@Test(dataProvider = "LoginJson",priority=2)
    public void ChurosScenario(LoginModel loginModel) throws InterruptedException {
        OrderPage loginPage = PageFactory.initElements(driver, OrderPage.class);
        loginPage.CheckChurosScenario("Newtown");

    }*/
    @Test(dataProvider = "LoginJson",priority=3)
    public void AddProductToCartTest(LoginModel loginModel) throws InterruptedException {
        OrderPage orderPage = PageFactory.initElements(driver, OrderPage.class);
        orderPage.AddProductToCart("Newtown");


    }

    @Test(dataProvider = "LoginJson",priority=4)
    public void Reorder(LoginModel loginModel) throws InterruptedException {
        OrderPage orderPage = PageFactory.initElements(driver, OrderPage.class);
        orderPage.reorder("Newtown");


    }








}