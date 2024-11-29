import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;


public class EnterprisePageLoadTest {

    @Test
    void TitleOfEnterprisePageCheck() {
        // открываем страницу GitHub
        open("https://github.com/");

        // наводим мышь на элемент меню Solutions
        $(byTagAndText("button", "Solutions")).hover();

        // ищем ссылку на страницу Enterprises и проваливаемся в нее
        $("a[href=\"https://github.com/enterprise\"]").click();

        // проверяем, что страница загрузилась и на ней появился текст "The AI-powered developer platform"
        $("#hero-section-brand-heading").shouldHave(text("The AI-powered developer platform"));
    }
}
