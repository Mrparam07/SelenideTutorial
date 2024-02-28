package stepdefinitions;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.GooglePage;

import static com.codeborne.selenide.Selenide.*;

public class GoogleStepDefinition {

    @Given("I navigate to {string}")
    public void i_navigate_to(String string) {
        GooglePage googlePage = new GooglePage();
        open(string);
    }
    @Given("I wait for {int} seconds")
    public void i_wait_for_seconds(Integer time) throws InterruptedException {
        wait(time);
    }
    @Given("I navigate back")
    public void i_navigate_back() {
        back();
    }
    @Given("I navigate forward")
    public void i_navigate_forward() {
        forward();
    }
    @Given("I refresh the page")
    public void i_refresh_the_page() {
        refresh();
    }
    @Then("I hold the browser open")
    public void i_hold_the_browser_open() {
        Configuration.holdBrowserOpen = true;
    }
    public void wait(int timeInSecond) throws InterruptedException {
        Thread.sleep(timeInSecond*1000);
    }
}
