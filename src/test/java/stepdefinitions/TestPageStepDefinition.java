package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.TestPage;

public class TestPageStepDefinition {
    TestPage testPage = new TestPage();
    @Given("I enter username {string}")
    public void i_enter_username(String userName) {
        testPage.username.setValue(userName);
    }
    @Given("I enter password {string}")
    public void i_enter_password(String pswd) {
        testPage.password.setValue(pswd);
    }
    @Given("I enter submit button")
    public void i_enter_submit_button() {
        testPage.submitButton.click();
    }
    @Given("I click on logout link")
    public void i_click_on_logout_link() {
        testPage.logOutLink.click();
    }

}
