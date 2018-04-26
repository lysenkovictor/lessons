package tests;

import entities.User;
import listeners.ReportPortalOnFailListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.CustomerPage;
import pages.LoginPage;
import utils.I18n;

@Listeners({ReportPortalOnFailListener.class})
public class LoginTest extends BaseTest {


    @Test(enabled = true)
    public void canLoginTest() {
        User user = User.builder().email(baseConfig.login()).password(baseConfig.password()).build();
        LoginPage loginPage = new LoginPage();
        loginPage.openPage();
        loginPage.shouldBeOpenUrl();

        CustomerPage customerPage = loginPage.logIn(user);

        customerPage.shouldBeOpenUrl();
    }

    @Test(enabled = true)
    public void сanSeeValidationError() {

        User user = User.builder().email(baseConfig.incorrectLogin()).password(baseConfig.incorrectPassword()).build();
        LoginPage loginPage = new LoginPage();
        loginPage.openPage();
        loginPage.shouldBeOpenUrl();

        loginPage.logIn(user);

        loginPage.checkErrorMessageEmail(I18n.i18nInstance().massageErrorIncorrectLogin);
        loginPage.checkErrorMessagePassword(I18n.i18nInstance().massageErrorIncorrectPassword);

    }

}
