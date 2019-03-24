package com.automation.fluent.cucumber.test.utils;

import cucumber.api.java8.En;
import org.fluentlenium.adapter.cucumber.FluentCucumberTest;
import org.fluentlenium.configuration.FluentConfiguration;

@FluentConfiguration(webDriver = "chrome")
public class BaseTest extends FluentCucumberTest implements En {
}
