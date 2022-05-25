package ru.daniilshat.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GitHubPage {
    // Locators
    SelenideElement wikiTab = $("#wiki-tab");
    SelenideElement wikiTabExtra = $(byText("Show 2 more pages…"));
    SelenideElement wikiPagesBox = $("#wiki-pages-box");
    SelenideElement searchText =$(byText("SoftAssertions"));
    SelenideElement textBody = $(".markdown-body");

    // Actions
    public GitHubPage openGHPage() {
        open("selenide/selenide");
        return this;
    }

    public GitHubPage goToGHWiki() {
        wikiTab.click();
        wikiTabExtra.click();
        return this;
    }

    public GitHubPage checkPagesList() {
        wikiPagesBox.shouldHave(text("SoftAssertions"));
        return this;
    }

    public GitHubPage checkJUnit5Example() {
        searchText.click();
        textBody.shouldHave(text("3. Using JUnit5 extend test class:"));
        return this;
    }
}
