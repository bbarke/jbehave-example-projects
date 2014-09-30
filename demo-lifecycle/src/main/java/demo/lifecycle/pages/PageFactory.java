package demo.lifecycle.pages;

import org.jbehave.web.selenium.WebDriverProvider;

public class PageFactory {

    private final WebDriverProvider webDriverProvider;

    public PageFactory(WebDriverProvider webDriverProvider) {
        this.webDriverProvider = webDriverProvider;
    }

    public AdvancedSearch newAdvancedSearch() {
        return new AdvancedSearch(webDriverProvider);
    }

    public SearchResults newSearchResults() {
        return new SearchResults(webDriverProvider);
    }

    public GoogleHomePage newGoogle()
    {
      return new GoogleHomePage(webDriverProvider);
    }

}
