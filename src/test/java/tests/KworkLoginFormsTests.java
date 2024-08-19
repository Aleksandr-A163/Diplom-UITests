package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.KworkRegistrationPage;

@Feature("Login and Registration")
@Owner("Aleksandr Anosov")
@DisplayName("Автотесты для проверки модальных окон авторизации")
@Tag("Login")
public class KworkLoginFormsTests extends BaseTest {

    @DisplayName("Проверка открытия модального окна регистрации")
    @Test
    public void registrationModalTest() {
        KworkRegistrationPage registrationPage = new KworkRegistrationPage();

        registrationPage.openHomePage()
                .clickRegistrationButton()
                .verifyRegistrationModalOpened()
                .checkRegistrationModalElements();
    }

    @DisplayName("Проверка открытия модального окна для входа в учетную запись")
    @Test
    public void loginModalTest() {
        KworkRegistrationPage loginPage = new KworkRegistrationPage();

        loginPage.openHomePage()
                .clickLoginButton()
                .verifyLoginModalOpened()
                .checkLoginModalElements();
    }

}