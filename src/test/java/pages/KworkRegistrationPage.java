package pages;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Condition.visible;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.junit.jupiter.api.DisplayName;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;

public class KworkRegistrationPage {

    private final SelenideElement
            registrationButton = $(byXpath("//a[@href='https://kwork.ru/signup']")),
            loginButton = $(byXpath("//a[@href='javascript:;']")),
            modalForm = $(".k-modal-content"),

            loginModalEmailInput = $(byXpath("//input[contains(@placeholder, 'Электронная почта')]")),
            loginModalPasswordInput = $(byXpath("//input[contains(@placeholder, 'Пароль')]")),
            loginModalCheckbox = $(".checkbox-after-label"),
            loginModalButton = $(".signin-signup__content-button");

    private final String
            registrationModalInputSelector = ".k-input__field",
            registrationModalButtonSelector = ".kw-button",
            loginModalEmailInputSelector = "input[type='text'][placeholder='Электронная почта или логин']",
            loginModalPasswordInputSelector = "input[type='password']",
            loginModalButtonSelector = ".signin-signup__content-button";

    @Step("Открыть главную страницу Kwork")
    public KworkRegistrationPage openHomePage() {
        open("https://kwork.ru/");
        return this;
    }

    @DisplayName("Проверка модального окна регистрации")
    @Step("Нажать на кнопку регистрации")
    public KworkRegistrationPage clickRegistrationButton() {
        registrationButton.shouldBe(visible).click();
        return this;
    }

    @Step("Проверить, что модальное окно регистрации открылось")
    public KworkRegistrationPage verifyRegistrationModalOpened() {
        modalForm.shouldBe(visible);  // Проверка открытия модального окна
        return this;
    }

    @Step("Проверка элементов в модальном окне регистрации ")
    public KworkRegistrationPage checkRegistrationModalElements() {
        modalForm.find(registrationModalInputSelector).shouldBe(visible);
        modalForm.find(registrationModalButtonSelector).shouldBe(visible);
        return this;
    }

    @DisplayName("Проверка модального окна входа в учетную запись")
    @Step("Нажать на кнопку входа в учетную запись")
    public KworkRegistrationPage clickLoginButton() {
        loginButton.click();
        return this;
    }

    @Step("Проверить, что модальное окно входа в учетную запись")
    public KworkRegistrationPage verifyLoginModalOpened() {
        modalForm.shouldBe(visible);  // Проверка открытия модального окна
        return this;
    }

    @Step("Проверка элементов в модальном окне входа в учетную запись")
    public KworkRegistrationPage checkLoginModalElements() {
        modalForm.find(loginModalEmailInputSelector).shouldBe(visible);
        modalForm.find(loginModalPasswordInputSelector).shouldBe(visible);

        modalForm.find(loginModalButtonSelector).shouldBe(visible);
        return this;
    }

}