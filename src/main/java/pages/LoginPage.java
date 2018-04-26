package pages;

import entities.User;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class LoginPage extends BasePage {

    public LoginPage() {
        baseUrl += "login";
    }

    private void fillFieldEmail(String email) {
        $(By.name("email")).setValue(email);
    }

    private void fillFieldPassword(String password) {
        $(By.name("password")).setValue(password);
    }

    public CustomerPage logIn(User user) {
        fillFieldEmail(user.getEmail());
        fillFieldPassword(user.getPassword());
        $(By.xpath("//*[@id='form-login']//*[@class='btn-default form__login__submit form__submit']")).click();
        return new CustomerPage();
    }

    public void checkErrorMessageEmail(String massageError) {
        assertThat($(By.id("email-error")).getText())
                .describedAs("must have error message")
                .contains(massageError);
    }

    public void checkErrorMessagePassword(String massageError) {
        assertThat($(By.id("password-error")).getText())
                .describedAs("must have error message")
                .contains(massageError);
    }


}
