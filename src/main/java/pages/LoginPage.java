package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage extends BasePage {


    private void fillFieldEmail(String email) {
        $(By.id("email")).setValue(email);
    }

    private void fillFieldPassword(String password) {
        $(By.id("pass")).setValue(password);
    }

    public AccountPage logIn(String email, String password) {
        fillFieldEmail(email);
        fillFieldPassword(password);
        $(By.xpath("//div[@class='buttons-set']/button[@id='send2']")).click();
        return new AccountPage();
    }



}
