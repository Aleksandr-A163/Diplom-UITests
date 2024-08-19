package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.KworkWebsiteRepairPage;


@Feature("Main search on website")
@Owner("Aleksandr Anosov")
@DisplayName("Автотесты по проверке заголовков страниц")
@Tag("Title")
public class KworkTitleTests extends BaseTest {


    @DisplayName("Проверка наименований заголовков и тегов")
    @Test
    public void websiteRepairPageTest() {
        KworkWebsiteRepairPage kworkPage = new KworkWebsiteRepairPage();

        kworkPage.openPage()
                .checkTitle()
                .checkTagName();
    }
}