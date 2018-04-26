package pages;

import com.codeborne.selenide.SelenideElement;
import entities.Menu;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class HeaderPage {

    private SelenideElement buttonMyAccount = $(By.xpath("//*[@class='header__user-icon']"));

    public CatalogPage search(String stringSearch) {
        $(By.xpath("//*[@data-search-overlay-open]")).click();
        $(By.name("q")).setValue(stringSearch).pressEnter();
        return new CatalogPage();
    }

    public void goToByTopMenu(Menu menu) {
        int sizeListMenu = menu.getListMenuPath().size();
        for (int i = 0; i < sizeListMenu; i++) {
            SelenideElement searchElement = $(byText(menu.getListMenuPath().get(i)));
            searchElement.shouldBe(visible,enabled).hover().click();
        }
    }

    public void clickBattonMyAccount() {
        buttonMyAccount.click();
    }
}
