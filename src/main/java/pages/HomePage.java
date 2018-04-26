package pages;

import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;
import java.util.NoSuchElementException;
import static com.codeborne.selenide.Selenide.$$;


public class HomePage extends BasePage {

    private HeaderPage headerPage = new HeaderPage();

    public HeaderPage getHeaderPage() {
        return headerPage;
    }

    private ElementsCollection bannerList = $$(By.xpath("//ul[@id='brands']/li"));

    public CatalogPage chooseBannerWithProductBy(int idInCollection, int countExpected) {
        bannerList.shouldHaveSize(countExpected);
        bannerList.get(idInCollection).click();
        return new CatalogPage();
    }

    public CatalogPage chooseBannerWithProductBy(String textBrandBanner, int sizeExpected) {
        bannerList.shouldHaveSize(sizeExpected);

        bannerList.stream()
                .filter(e -> e.getText().toUpperCase().contains(textBrandBanner.toUpperCase()))
                .findFirst().orElseThrow(() -> new NoSuchElementException("not found element: " + textBrandBanner))
                .click();
        return new CatalogPage();
    }

}
