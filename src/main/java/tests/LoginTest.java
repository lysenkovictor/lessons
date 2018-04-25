package tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.AccountPage;
import pages.HomePage;
import pages.LoginPage;
import listeners.ReportPortalOnFailListener;
import utils.I18n;

@Listeners({ReportPortalOnFailListener.class})
public class LoginTest extends BaseTest{



    @Test()
    public void canLoginTest() {
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        homePage.clickButtonMyAccount();

        AccountPage accountPage = loginPage.logIn("viktorlsn@gmail.com", "P4r4zitTest");
        accountPage.initializationAccountPage();
    }

    @Test
    public void сanSeeValidationError() {
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        homePage.clickButtonMyAccount();
        loginPage.logIn("viktorlsn1@gmail.com", "P4r4zitTest");
        loginPage.checkErrorMessage("Indirizzo e-mail o password non2 validi");
    }

    @Test
    public void testTest() {
        System.out.println(I18n.i18nInstance().massageErrorIncorrectLogin);
    }

}
