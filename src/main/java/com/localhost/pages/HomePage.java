package com.localhost.pages;

import com.localhost.driverfactory.ManageDriver;
import com.localhost.utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger LOGGER = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(ManageDriver.driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//button[@id='accept-cookies']")
    WebElement acceptCookies;

    @CacheLookup
    @FindBy(xpath = "//input[@id='keyword']")
    WebElement jobPreferenceField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='search']")
    WebElement searchButton;


    public void clickOnAcceptCookie() {
        clickOnElement(acceptCookies);
        LOGGER.info("Clicking on Accept Cookies Button = "+acceptCookies);
    }

    public void enterJobPreferences(String jobPreference) {
        sendTextToElement(jobPreferenceField,jobPreference);
        LOGGER.info("Enter Job Preference = "+jobPreference);
    }

    public void clickOnSearchButton() {
        clickOnElement(searchButton);
        LOGGER.info("Clicking on Search Button = "+searchButton);
    }
}
