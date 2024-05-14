package com.localhost.pages;

import com.localhost.driverfactory.ManageDriver;
import com.localhost.utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class SearchResultPage extends Utility {
    private static final Logger LOGGER = LogManager.getLogger(SearchResultPage.class.getName());

    public SearchResultPage() {
        PageFactory.initElements(ManageDriver.driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//ul[@class=\"nhsuk-list search-results\"]//div[1]//div//h3//a")
    WebElement allJobPreferenceTitle;

    @CacheLookup
    @FindBy(xpath = "//select[@id='sort']")
    WebElement sortByDatePosted;

    By allJobPreferenceTitles = By.xpath("//ul[@class=\"nhsuk-list search-results\"]//div[1]//div//h3//a");

    public void fetchItemsListName() {
        List<WebElement> originalList = driver.findElements(allJobPreferenceTitles);

        // Storing searched result in 'expected' variable
        List<String> expected = new ArrayList<>();

        for (WebElement data : originalList) {
            expected.add(data.getText());
        }
        // Print the actual text content of the original list elements
        List<String> originalTextList = new ArrayList<>();
        for (WebElement element : originalList) {
            originalTextList.add(element.getText());
        }

        // Print Original List and Expected List
        System.out.println("Original List: " + originalTextList);
        System.out.println("Expected List: " + expected);

        // Compare the two lists directly
        boolean listsMatch = originalTextList.equals(expected);

        if (listsMatch) {
            System.out.println("Expected list matches the original order.");
        } else {
            System.out.println("Expected list does not match the original order.");
        }
        webElementList(allJobPreferenceTitles);
    }

    public void selectByDatePosted(String date) {
        selectByVisibleTextFromDropDown(sortByDatePosted,date);
        LOGGER.info("Sort by Date Posted = "+sortByDatePosted);
    }
}
