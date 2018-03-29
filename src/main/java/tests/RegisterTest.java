package tests;

import Framework.BaseTestLogin;
import com.fasterxml.jackson.databind.ObjectMapper;
import models.RegisterModel;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.RegisterPage;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by casab on 11/2/2017.
 */
public class RegisterTest extends BaseTestLogin {

    @DataProvider(name = "RegisterJson")
    public Iterator<Object[]> jsonLoginDataProvider() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Collection<Object[]> dp = new ArrayList<>();

        File[] files = getListOfFiles("register");
        for (File f : files) {
            RegisterModel m = objectMapper.readValue(f, RegisterModel.class);
            dp.add(new Object[]{m});
        }
        return dp.iterator();
    }

    @Test(dataProvider = "RegisterJson",priority = 1)
    public void mainRegisterTest(RegisterModel registerModel) throws InterruptedException {
        RegisterPage registerPage = PageFactory.initElements(driver, RegisterPage.class);

        registerPage.RegisterFlow(registerModel);

    }









}