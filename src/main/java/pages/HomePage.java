package pages;

import static com.codeborne.selenide.Condition.*;
import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;
import java.util.NoSuchElementException;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;


public class HomePage extends BasePage{

    private ElementsCollection bannerList = $$(By.xpath("//div[@class='tile follow-up']"));
    private ElementsCollection tabBrandList = $$(By.xpath("//div[@aria-expanded='true']//li"));

    public void chooseTabBrand(int numberTab) {
        $((By.xpath("//li[@aria-controls='tabs-"+numberTab+"']"))).click();
        $(By.xpath("//li[@aria-controls='tabs-"+ numberTab +"'"  + "and @aria-selected='true']")).shouldBe(visible);
    }

    public CatalogPage chooseBannerWithProductBy(int idInCollection, int countExpected) {
        bannerList.shouldHaveSize(countExpected);
        bannerList.get(idInCollection).click();
        return new CatalogPage();
    }

    public CatalogPage chooseBannerWithProductBy(String textBrandBanner, int sizeExpected) {
        bannerList.shouldHaveSize(sizeExpected);

        bannerList.stream()
                .filter(e->e.getText().toUpperCase().contains(textBrandBanner.toUpperCase()))
                .findFirst().orElseThrow(() ->new NoSuchElementException("not found element: " + textBrandBanner))
                .click();
        return new CatalogPage();
    }


    public void checkCountBrandFromList(int countBrand) {
        tabBrandList.shouldHaveSize(countBrand);
    }




}
