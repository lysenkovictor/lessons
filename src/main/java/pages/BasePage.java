package pages;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.codeborne.selenide.Selenide.Wait;
import static com.codeborne.selenide.Selenide.open;

public abstract class BasePage extends UtilsPage {

    protected String baseUrl = Configuration.baseUrl;

        public void openPage() {
        open(baseUrl);
    }

        public void shouldBeOpenUrl() {
        Wait().until(ExpectedConditions.urlContains(baseUrl));
    }

}