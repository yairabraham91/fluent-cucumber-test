package com.automation.fluent.cucumber.test.pages;

import com.automation.fluent.cucumber.test.utils.BasePage;

import static org.assertj.core.api.Assertions.*;

public class GoogleSearchPage extends BasePage {

    @Override
    public void isAt() {
        assertThat(window().title()).contains("Google Search");
    }

    public void checkPageTitleContainsValue(String value) {
        assertThat(window().title()).contains(value);
    }
}
