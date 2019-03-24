package com.automation.fluent.cucumber.test.utils;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class FluentHooks extends BaseTest {

    private static final String CHROME_DRIVER_PROPERTY = "webdriver.chrome.driver";
    private static final String PATH_TO_CHROME_DRIVER = "src\\test\\resources\\com\\automation\\fluent\\cucumber\\test\\chromedriver.exe";

    @Before
    public void beforeScenario(Scenario scenario) {
        System.setProperty(CHROME_DRIVER_PROPERTY, PATH_TO_CHROME_DRIVER);
        before(scenario);
    }

    @After
    public void afterScenario(Scenario scenario) {
        after(scenario);
    }
}
