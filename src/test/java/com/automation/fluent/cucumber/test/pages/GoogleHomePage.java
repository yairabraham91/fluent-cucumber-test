package com.automation.fluent.cucumber.test.pages;

import com.automation.fluent.cucumber.test.utils.BasePage;
import org.fluentlenium.core.annotation.PageUrl;

import static org.assertj.core.api.Assertions.*;
import static org.fluentlenium.core.filter.FilterConstructor.*;

@PageUrl("https://google.com")
public class GoogleHomePage extends BasePage {

    @Override
    public void isAt() {
        assertThat(window().title()).contains("Google");
    }

    public void fillSearchBar(String value) {
        $("input", withName("q")).fill().with(value);
    }

    public void clickGoogleSearchButton() {
        $("input", withName("btnK")).click();
    }

    public void performASearch(String value) {
        fillSearchBar(value);
        clickGoogleSearchButton();
    }
}
