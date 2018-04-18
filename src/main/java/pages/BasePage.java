package pages;

import com.codeborne.selenide.SelenideElement;
import entities.Menu;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;


public abstract class   BasePage extends UtilsPage{


    SelenideElement
            battonMyAccount = $(By.xpath("//a[contains(text(),'Mio account')]")),
            buttonLogOut = $(By.xpath("//a[contains(text(),'Carrello Chiudi')]"));

    public CatalogPage search(String stringSearch) {
        $(By.id("ui-id-1")).setValue(stringSearch);
        $(By.id("ui-id-2")).click();

        return new CatalogPage();
    }

    public void goToByTopMenu(Menu menu) {
        int sizeListMenu = menu.getListMenuRoad().size();
        for (int i = 0; i < sizeListMenu; i++) {
            SelenideElement searchElement = $(byText(menu.getListMenuRoad().get(i)));
            searchElement.shouldBe(visible).hover();
            if (sizeListMenu-1  == i)
            {
                searchElement.shouldBe(visible).click();
            }
        }
    }

    public BasketPage clickBattonBasket() {
        $(By.xpath("//a[@class='basket-full']")).click();
        return new BasketPage();
    }

    public void clickButtonMyAccount() {
        battonMyAccount.click();
    }

    public void clickButtonLogOut() {
        buttonLogOut.click();
    }
}


