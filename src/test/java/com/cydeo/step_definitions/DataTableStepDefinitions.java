package com.cydeo.step_definitions;

import com.cydeo.pages.DropDownsPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DataTableStepDefinitions {


    @Then("user should see below step")
    public void user_should_see_below_step(List<String > fruitsAndVegetables) {
        System.out.println("fruitsAndVegetables = " + fruitsAndVegetables);

        System.out.println(fruitsAndVegetables.get(1));

    }

    @Then("I will share my favorites")
    public void i_will_share_my_favorites(List<String> listOfPets) {
        System.out.println("listOfPets = " + listOfPets);

    }


    @Then("officer is able to see any data he wants")
    public void officer_is_able_to_see_any_data_he_wants(Map<String, String> driverInfo) {
        System.out.println("driverInfo = " + driverInfo);
        System.out.println("driverInfo.get(\"name\")=" + driverInfo.get("name"));
        System.out.println("driverInfo.get(\"address\")=" + driverInfo.get("address"));
        System.out.println("driverInfo.size()=" + driverInfo.size());

    }



    @Given("User is on the dropdowns page of practice tool")
    public void user_is_on_the_dropdowns_page_of_practice_tool() {
        Driver.getDriver().get("https://practice.cydeo.com/dropdown");
    }

    DropDownsPage dropDownsPage = new DropDownsPage();
    @Then("User should see below info in month dropdown")
    public void user_should_see_below_info_in_month_dropdown(List<String> expectedMonths) {

        List<String > actualMonths = BrowserUtils.dropDownOptions_as_String(dropDownsPage.monthDropDown);

        Assert.assertEquals(expectedMonths, actualMonths);


    }




}
