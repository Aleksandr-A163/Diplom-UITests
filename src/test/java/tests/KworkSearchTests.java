package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.KworkSearchPage;


@Feature("Main search on website")
@Owner("Aleksandr Anosov")
@DisplayName("Автотесты по проверке поиска на платформе")
@Tag("Search")
public class KworkSearchTests extends BaseTest {


    @DisplayName("Проверка поиска на главной странице кириллией")
    @Test
    public void searchKirilFunctionalityTest() {
        KworkSearchPage searchPage = new KworkSearchPage();

        searchPage.openHomePage()
                .searchFor("настройка чат бота")
                .checkSearchInputValue("настройка чат бота")
                .checkSearchResult();
    }

    @DisplayName("Проверка поиска на главной странице латиницей")
    @Test
    public void searchEngFunctionalityTest() {
        KworkSearchPage searchPage = new KworkSearchPage();

        searchPage.openHomePage()
                .searchFor("QA")
                .checkSearchInputValue("QA")
                .checkSearchResult();
    }

    @DisplayName("Проверка поиска на главной странице по числу")
    @Test
    public void searchNumberFunctionalityTest() {
        KworkSearchPage searchPage = new KworkSearchPage();

        searchPage.openHomePage()
                .searchFor("12")
                .checkSearchInputValue("12")
                .checkSearchResult();
    }
}