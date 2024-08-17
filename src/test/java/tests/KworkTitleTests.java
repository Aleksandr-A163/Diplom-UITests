package tests;

import io.qameta.allure.Feature;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.KworkWebsiteRepairPage;


@Feature("Web tests")
@DisplayName("Автотесты по платформе Kwork")
@Tag("kwork-web")
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