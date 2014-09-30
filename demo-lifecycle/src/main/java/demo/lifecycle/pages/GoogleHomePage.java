package demo.lifecycle.pages;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;

public class GoogleHomePage extends FluentWebDriverPage {

    public GoogleHomePage(WebDriverProvider driverProvider) {
	super(driverProvider);
    }

    public void go() {
	get("http://www.google.com");
    }

}
