package demo.lifecycle.steps;


import static org.hamcrest.MatcherAssert.assertThat;

import org.hamcrest.Matchers;
import org.jbehave.core.annotations.Alias;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;

import demo.lifecycle.pages.AdvancedSearch;
import demo.lifecycle.pages.GoogleHomePage;
import demo.lifecycle.pages.PageFactory;
import demo.lifecycle.pages.SearchResults;

public class EtsyDotComSteps {
    
    private AdvancedSearch advancedSearch;
    private SearchResults searchResults;
    private GoogleHomePage google;

    public EtsyDotComSteps(PageFactory pageFactory){
        advancedSearch = pageFactory.newAdvancedSearch();
        searchResults = pageFactory.newSearchResults();
        google = pageFactory.newGoogle();
    }
    
    @Given("I am searching on Etsy.com")
    public void advancedSearchingOnEtsyDotCom() {
        advancedSearch.go();
    }
    
    @When("I specify the $subCat sub category")
    public void specifiSubCategory(String subCat) {
        advancedSearch.subCategory(subCat);
    }
    
    @When("I search for $thing")
    public void seachForThing(String thing) {
        advancedSearch.searchFor(thing);
    }
    
    @Then("there are search results")
    @Alias("results will be displayed in the gallery")
    public void thereAreSearchResults() {
        assertThat(searchResults.resultsFound(), Matchers.greaterThan(0));
    }
    
    @Then("fail")
    public void thenFail()
    {
      Assert.fail();
    }
    
    @Given("I am on google's home page")
    public void givenOnGoogleHomePage()
    {
      google.go();
    }

}
