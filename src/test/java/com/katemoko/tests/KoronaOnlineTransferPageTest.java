package com.katemoko.tests;

import com.codeborne.selenide.CollectionCondition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static com.codeborne.selenide.ClickOptions.usingJavaScript;
import static com.codeborne.selenide.Selenide.*;

public class KoronaOnlineTransferPageTest extends TestBase{

    final List<String> menuButtons = List.of("Send cash", "Send to China", "Deposit to my card", "FAQ", "Log in");

    @DisplayName("Проверка отображения владок на странице Денежные переводы")
    @Test
    void onlineTransfersTabTest() {
        open("/transfers/online/");
        $("#clickable-button-locale-en").click(usingJavaScript());
        $$(".no-mobile-nav a[tabindex='0']").shouldHave(CollectionCondition.texts(menuButtons));
    }
}