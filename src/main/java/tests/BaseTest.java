package tests;

import org.aeonbits.owner.ConfigFactory;
import org.testng.annotations.BeforeClass;
import utils.BaseConfig;
import utils.I18n;

import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    protected static BaseConfig baseConfig = ConfigFactory.create(BaseConfig.class, System.getProperties());

    @BeforeClass
    public void setUp() {

        timeout = 10000;
        browser = "chrome";
        baseUrl = I18n.i18nInstance().baseUrl;
        open(baseUrl);
    }

}
