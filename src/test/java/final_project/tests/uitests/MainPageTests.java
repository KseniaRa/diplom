package final_project.tests.uitests;

import final_project.allure.JiraIssue;
import final_project.allure.JiraIssues;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


@Feature("Main page")
public class MainPageTests extends TestBase {
    String mainPageURL = "https://www.vprok.ru/";

    @Test
    @Story("Verification of the main page")
    @Tags({@Tag("web"), @Tag("ui")})
    @JiraIssues({@JiraIssue("HOMEWORK-253")})
    @DisplayName("Opening the main page")
    public void checkMainPageTitleTest() {
        step("Open the main page", () -> {
            open(mainPageURL);
        });

        step("Check product title", () -> {
            String expectedTitle = "Vprok.ru Перекрёсток – доставка продуктов на дом и на дачу Впрок";
            String actualTitle = title();
            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Story("Verification of the main page")
    @Tags({@Tag("web"), @Tag("ui")})
    @JiraIssues({@JiraIssue("HOMEWORK-253")})
    @DisplayName("Registration popup is available")
    public void loginPopupAvailabilityTest() {
        step("Open the main page", () -> {
            open(mainPageURL);
        });

        step("OPen popup", () -> {
            $(".xfnew-header__user-nav:nth-child(5)").click();
        });

        step("Check that Login popup is open", () -> {
            $(".xf-auth-title__text")
                    .shouldHave(text("Вход или регистрация"));
        });
    }

    @Test
    @Story("Verification of the main page")
    @Tags({@Tag("web"), @Tag("ui")})
    @JiraIssues({@JiraIssue("HOMEWORK-253")})
    @DisplayName("Checking region popup on the main page")
    public void regionTest() {
        step("Open the main page", () -> {
            open(mainPageURL);
        });

        step("Check popup", () -> {
            $(".xfnew-header__change-region").click();
            $(".xf-popup-polygons__block-check-region")
                    .shouldHave(text("Выберите ваш регион"));
        });
    }



    @Test
    @Story("Verification of the main page")
    @Tags({@Tag("web"), @Tag("ui")})
    @JiraIssues({@JiraIssue("HOMEWORK-253")})
    @DisplayName("Promo page")
    public void promoTest() {
        step("Open the main page", () -> {
            open(mainPageURL);
        });

        step("Go to Promo page", () -> {
            $(byText("Акции")).click();
        });

        step("Check page", () -> {
            $(".xf-caption__title")
                    .shouldHave(text("Акции"));
        });
    }

    @Test
    @Story("Verification of the main page")
    @Tags({@Tag("web"), @Tag("ui")})
    @JiraIssues({@JiraIssue("HOMEWORK-253")})
    @DisplayName("Successful opening Catalog page")
    public void catalogPageTest() {
        step("Open the main page", () -> {
            open(mainPageURL);
        });

        step("Go to Request Demo page", () -> {
            $(".xfnew-header__catalog-button").click();
            $$(".fo-catalog-menu__nav a").
                    findBy(text("Молоко, сыр, яйца")).click();
        });

        step("Check that  page is open", () -> {
            $(".fo-breadcrumbs__current").
                    shouldHave(text("Молоко, сыр, яйца"));
        });
    }

    @Test
    @Story("Verification of the main page")
    @Tags({@Tag("web"), @Tag("ui")})
    @JiraIssues({@JiraIssue("HOMEWORK-253")})
    @DisplayName("Successful opening news page")
    public void newsPageTest() {
        step("Open the main page", () -> {
            open(mainPageURL);
        });

        step("Go to news page", () -> {
            $(".xf-mp-recipe-news__list").scrollIntoView(true).click();
            $(".xf-mp-recipe-news__img-block").click();
        });

        step("Check that  page is open", () -> {
            $(".xf-caption__title").shouldBe(visible);
        });
    }


}
