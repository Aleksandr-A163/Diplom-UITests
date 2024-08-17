package tests;

import io.qameta.allure.Feature;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.KworkLinksPage;

@Feature("Web tests")
@DisplayName("Автотесты для проверки ссылок на соц.сети и на маркетплейсы")
@Tag("kwork-web")
public class KworkLinksTests extends BaseTest {

    @DisplayName("Проверка наличия ссылки на VK переход по ссылке")
    @Test
    public void vkLinkFunctionalityTest() {
        KworkLinksPage linksVkPage = new KworkLinksPage();

        linksVkPage.openHomePage()
                .goToVkLink()
                .checkVkUrl()
                .openHomePage();
    }

    @DisplayName("Проверка наличия ссылки на Apple и проверка заголовка")
    @Test
    public void appleLinkFunctionalityTest() {
        KworkLinksPage linksApplePage = new KworkLinksPage();

        linksApplePage.openHomePage()
                .goToAppleLink()
                .checkTitleNameInAppleStore();
    }

    @DisplayName("Проверка наличия ссылки на Apple и проверка заголовка")
    @Test
    public void googleLinkFunctionalityTest() {
        KworkLinksPage linksApplePage = new KworkLinksPage();

        linksApplePage.openHomePage()
                .goToGoogleLink()
                .checkTitleNameInGoogleStore();
    }
}