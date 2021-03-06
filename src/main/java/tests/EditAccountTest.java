package tests;

import Framework.BaseTestLogin;
import com.fasterxml.jackson.databind.ObjectMapper;
import models.EditAccountModel;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.EditAccountPage;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by casab on 11/2/2017.
 */
public class EditAccountTest extends BaseTestLogin {

    @DataProvider(name = "EdiAccountJson")
    public Iterator<Object[]> jsonEditAccountDataProvider() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Collection<Object[]> dp = new ArrayList<>();

        File[] files = getListOfFiles("editAccount");
        for (File f : files) {
            EditAccountModel m = objectMapper.readValue(f, EditAccountModel.class);
            dp.add(new Object[]{m});
        }
        return dp.iterator();
    }

    @Test(dataProvider = "EdiAccountJson",priority = 1)
    public void mainEditAccountTest(EditAccountModel editAccountModel) throws InterruptedException {
       EditAccountPage editAccountPage = PageFactory.initElements(driver, EditAccountPage.class);

        editAccountPage.editAccountFlow(editAccountModel);

    }


    @Test(dataProvider = "EdiAccountJson",priority = 2)
    public void mainEditPasswordTest(EditAccountModel editAccountModel) throws InterruptedException {
        EditAccountPage editAccountPage = PageFactory.initElements(driver, EditAccountPage.class);

        editAccountPage.editPasswordFlow(editAccountModel);

    }




    @Test(dataProvider = "EdiAccountJson",priority = 3)
    public void mainEditEmailTest(EditAccountModel editAccountModel) throws InterruptedException {
        EditAccountPage editAccountPage = PageFactory.initElements(driver, EditAccountPage.class);

        editAccountPage.editEmailFlow(editAccountModel);

    }










}