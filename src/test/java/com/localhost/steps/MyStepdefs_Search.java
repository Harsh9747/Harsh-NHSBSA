package com.localhost.steps;

import com.localhost.pages.HomePage;
import com.localhost.pages.SearchResultPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs_Search {
    @Given("I am a jobSeeker on NHS Jobs website")
    public void iAmAJobSeekerOnNHSJobsWebsite() {
      //  new HomePage().clickOnAcceptCookie();
    }

    @When("I put my {string} into the Search functionality")
    public void iPutMyIntoTheSearchFunctionality(String jobPreference) {
        new HomePage().enterJobPreferences(jobPreference);
        new HomePage().clickOnSearchButton();
    }

    @Then("I should get a list of jobs which matches my preferences")
    public void iShouldGetAListOfJobsWhichMatchesMyPreferences() {
        new SearchResultPage().fetchItemsListName();
    }

    @And("sort my search results with the newest Date Posted")
    public void sortMySearchResultsWithTheNewestDatePosted() {
        new SearchResultPage().selectByDatePosted("Date Posted (newest)");
    }

}
