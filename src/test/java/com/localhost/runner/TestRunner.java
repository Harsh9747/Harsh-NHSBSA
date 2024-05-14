package com.localhost.runner;


import com.localhost.propertyReader.PropertyReader;
import io.cucumber.java.BeforeAll;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.platform.suite.api.*;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "com/localhost")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME,
        value = "pretty, " +
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:, " +
                "json:reporting/Cucumber.json")

@IncludeTags("search")

public class TestRunner {
    private static final Logger LOGGER = LogManager.getLogger(TestRunner.class.getName());

    @BeforeAll
    public static void globalSetup() {
        LOGGER.info("Starting E2E Test Suite ...");
        String node = PropertyReader.getInstance().getConfigurationValue("node");
        String environment = PropertyReader.getInstance().getConfigurationValue("environment");
        String browser = PropertyReader.getInstance().getConfigurationValue("browser");
        String language = PropertyReader.getInstance().getConfigurationValue("language");
        String implicitlyWait = PropertyReader.getInstance().getConfigurationValue("implicitlyWait");
        String os = PropertyReader.getInstance().getConfigurationValue("os");
        String tags = PropertyReader.getInstance().getConfigurationValue("cucumber.filter.tags");
        LOGGER.info("== Node: " + node);
        LOGGER.info("== Environment: " + environment);
        LOGGER.info("== Browser: " + browser);
        LOGGER.info("== Language: " + language);
        LOGGER.info("== Implicit Wait: " + implicitlyWait);
        LOGGER.info("== Perfecto OS: " + os);
        LOGGER.info("== Cucumber Tags: " + tags);
    }
}
