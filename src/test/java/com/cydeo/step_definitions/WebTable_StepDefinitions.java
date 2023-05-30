package com.cydeo.step_definitions;

import com.cydeo.pages.WT_LoginPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class WebTable_StepDefinitions {


    @Given("user is on the Web Table app login page")
    public void user_is_on_the_web_table_app_login_page() {
        Driver.getDriver().get("https://web-table-2.cydeo.com/login");

    }

    WT_LoginPage wt_loginPage = new WT_LoginPage();

    @When("user enters correct username")
    public void user_enters_correct_username() {
        wt_loginPage.inputUsername.sendKeys("Test");

    }

    @When("user enters correct password")
    public void user_enters_correct_password() {
        wt_loginPage.inputPassword.sendKeys("Tester");

    }

    @When("user clicks to login button")
    public void user_clicks_to_login_button() {
        wt_loginPage.loginButton.click();

    }

    @Then("user should see orders word in the URL")
    public void userShouldSeeOrdersWordInTheURL() {
        String actualURL = Driver.getDriver().getCurrentUrl();
        String expectedInURL = "orders";

        Assert.assertTrue(actualURL.contains(expectedInURL));
    }


    @When("user enters {string} username and {string} password")
    public void userEntersUsernameAndPassword(String username, String password) {

        wt_loginPage.inputUsername.sendKeys(username);
        wt_loginPage.inputPassword.sendKeys(password);
    }
}

