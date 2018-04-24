package tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.AccountPage;
import pages.HomePage;
import pages.LoginPage;
import listeners.ReportPortalOnFailListener;

@Listeners({ReportPortalOnFailListener.class})
public class LoginTest extends BaseTest{

    private HomePage homePage = new HomePage();
    private LoginPage loginPage = new LoginPage();

    @Test()
    public void canLoginTest() {
        homePage.clickButtonMyAccount();
        AccountPage accountPage = loginPage.logIn("viktorlsn@gmail.com", "P4r4zitTest");
        accountPage.initializationAccountPage();
    }

    @Test
    public void сanSeeValidationError() {
        homePage.clickButtonMyAccount();
        loginPage.logIn("viktorlsn1@gmail.com", "P4r4zitTest");
        loginPage.checkErrorMessage("Indirizzo e-mail o password non2 validi");


    }
}
