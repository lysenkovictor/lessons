package tests;

import org.testng.annotations.BeforeClass;

import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    @BeforeClass
    public void setUp() {

        timeout = 10000;
        browser ="chrome";
        baseUrl = "https://www.fashionette.it";
        open(baseUrl);
    }

}
