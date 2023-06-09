package com.katemoko.tests;

import com.codeborne.selenide.CollectionCondition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static com.codeborne.selenide.ClickOptions.usingJavaScript;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class KoronaOnlineTransferPageTest extends TestBase {

    final List<String> menuButtons = List.of("Send cash", "Send to China", "Deposit to my card", "FAQ", "Log in");

    @DisplayName("Проверка отображения владок на странице Денежные переводы")
    @Test
    void onlineTransfersTabTest() {
        step("Открываем страницу переводов", () -> {
            open("/transfers/online/");
        });
        step("Переключаем язык на EN", () -> {
            $("#clickable-button-locale-en").click(usingJavaScript());
        });
        step("Проверяем доступные вкладки", () -> {
            $$(".no-mobile-nav a[tabindex='0']").shouldHave(CollectionCondition.texts(menuButtons));
        });
    }
}