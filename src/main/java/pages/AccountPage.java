package pages;

import static com.codeborne.selenide.Condition.*;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AccountPage extends BasePage{

    public void initializationAccountPage() {
        $(By.className("my-account")).shouldBe(visible);
    }
}
