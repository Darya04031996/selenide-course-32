package github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SelenideRepositorySearch {
    @Test
    void shouldFindSelenideRepositoryAtTheTop() {

        // открыть главную страницу
        open("https://github.com/");
        // ввести в поле поиска selenide и нажать enter
        $("[placeholder='Search GitHub']").setValue("selenide").pressEnter();
        // кликнуть на первый репозиторий из списка найденых
        $$("ul.repo-list li").first().$("a").click();
        // проверка: заголовок selenide/selenide
        $("#repository-container-header").shouldHave(text("selenide / selenide"));


        // ARRANGE(подготовка)//
        // ACT(действие)//
        // ACT(действие)//
        // (ASSERT)(проверка)//
        // ACT
        // ASSERT
        //.classname ищем по имени класса,# ищем по id, [] ищем по атрибуту, "a" по тегу. a[href=abc].red, тег а у которого должно быть значение атрибута abc и должен быть класс со значением red//
    }











}
