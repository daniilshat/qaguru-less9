package ru.daniilshat.tests;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import ru.daniilshat.pages.GitHubPage;

public class GitHubPageTest {

    GitHubPage ghp = new GitHubPage();

    @BeforeAll
    static void setUp() {
        WebDriverManager.chromedriver().setup();
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://github.com/";
    }

    @Test
    void mainGitHubWikiTest() {
        ghp.openGHPage().goToGHWiki().checkPagesList().checkJUnit5Example();
    }
}
