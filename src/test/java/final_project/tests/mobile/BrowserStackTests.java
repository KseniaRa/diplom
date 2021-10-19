package final_project.tests.mobile;

import com.codeborne.selenide.ClickMethod;
import com.codeborne.selenide.ClickOptions;
import com.codeborne.selenide.Condition;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static io.appium.java_client.MobileBy.AccessibilityId;
import static io.qameta.allure.Allure.step;
import static java.nio.channels.Selector.open;

public class BrowserStackTests extends MobileTestBase {
    @Tag("mobile")
    @Test
    @DisplayName("Successful search in wikipedia android app")
    void searchTest() {
        step("Type search", () -> {
            $(MobileBy.AccessibilityId("Search Wikipedia")).click();
            $(MobileBy.id("org.wikipedia.alpha:id/search_src_text")).val("BrowserStack");
        });
        step("Verify content found", () ->
                $$(MobileBy.id("org.wikipedia.alpha:id/page_list_item_container"))
                        .shouldHave(sizeGreaterThan(0)));
    }

    @Tag("mobile")
    @Test
    @DisplayName("Open article")
    void openArticleTest(){
        step("Type search", () -> {
            $(MobileBy.AccessibilityId("Search Wikipedia")).click();
            $(MobileBy.id("org.wikipedia.alpha:id/search_src_text")).val("Cleopatra");
        });
        step("Click an content", () ->
                $$(MobileBy.className("android.widget.TextView")).
                        findBy(text("Search Wikipedia")).click());
        step("Check title 'Cleopatra' ", () ->
                $(MobileBy.id("org.wikipedia.alpha:id/view_page_title_text")).
                        shouldHave(text("Cleopatra")));
    }

}