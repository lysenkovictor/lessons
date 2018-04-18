package tests;

import org.testng.annotations.Test;
import pages.AccountPage;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends BaseTest{

    @Test
    public void canLoginTest() {
        HomePage homePage = new HomePage();
        homePage.clickButtonMyAccount();
        LoginPage loginPage = new LoginPage();
        AccountPage accountPage = loginPage.logIn("viktorlsn@gmail.com", "P4r4zitTest");
        accountPage.initializationAccountPage();

    }
}
