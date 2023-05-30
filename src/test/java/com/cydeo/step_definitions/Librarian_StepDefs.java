package com.cydeo.step_definitions;

import com.cydeo.pages.librarian.Librarian_LoginPage;
import com.cydeo.pages.librarian.UserPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Librarian_StepDefs {


    Librarian_LoginPage loginPage = new Librarian_LoginPage();
    UserPage userPage = new UserPage();
    @Given("the {string} on the home page")
    public void the_on_the_home_page(String user) {
        Driver.getDriver().get(ConfigurationReader.getProperty("libraryUrl"));
        loginPage.login(user);
    }
    @Given("the librarian navigates to {string} page")
    public void the_librarian_navigates_to_page(String page) {
        loginPage.navigateTo(page); // child class object can reach parent bas class method

    }
    @When("the librarian clicks to Add User")
    public void the_librarian_clicks_to_add_user() {
        userPage.addUser.click();

    }
    @When("the librarian enters fullname {string}")
    public void the_librarian_enters_fullname(String fullName) {
        userPage.fullName.sendKeys(fullName);

    }
    @When("the librarian enters password {string}")
    public void the_librarian_enters_password(String password) {
        userPage.password.sendKeys(password);

    }
    @When("the librarian enters email {string}")
    public void the_librarian_enters_email(String email) {
        userPage.email.sendKeys(email);

    }
    @When("the librarian clicks to save changes")
    public void the_librarian_clicks_to_save_changes() {

        userPage.saveBtn.click();

    }
    @Then("verify {string} message is displayed")
    public void verify_message_is_displayed(String expectedMessage) {
        String actualMessage = userPage.message.getText();
        Assert.assertEquals(expectedMessage,actualMessage);

    }
    @Then("verify created user with {string} and {string} able to login")
    public void verify_created_user_with_and_able_to_login(String username, String password) {




    }
    @Then("verify created user should be able to see {string}")
    public void verify_created_user_should_be_able_to_see(String expectedName) {




    }




}
