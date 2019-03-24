package com.automation.fluent.cucumber.test.stepDefinitions;

import com.automation.fluent.cucumber.test.pages.GoogleHomePage;
import com.automation.fluent.cucumber.test.pages.GoogleSearchPage;
import com.automation.fluent.cucumber.test.utils.BaseTest;
import org.fluentlenium.core.annotation.Page;

public class BasicSearch extends BaseTest {

    @Page
    private GoogleHomePage homePage;

    @Page
    private GoogleSearchPage searchPage;

    public BasicSearch() {
        Given("I am on the Google home page", () -> {
            goTo(homePage);
            homePage.isAt();
        });

        When("I search for {string}", (String string) -> {
            homePage.performASearch(string);
        });

        Then("the page title should start with {string}", (String string) -> {
            searchPage.isAt();
            searchPage.checkPageTitleContainsValue(string);
        });
    }
}
