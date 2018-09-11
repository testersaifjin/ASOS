package com.ASOS;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef extends DriverManager {
    HomePage hp = new HomePage();

    @Given("^User is on Home Page$")
    public void user_is_on_Home_Page() {
        hp.navigateToNopCommercePage();
    }

    @When("^User search a product \"([^\"]*)\"$")
    public void user_search_a_product(String searchItem) {

        hp.goToSearch(searchItem);

    }


    @Then("^User can see the respective products$")
    public void user_can_see_the_respective_products() {

    }

    @When("^User search a product$")
    public void user_search_a_product() {

    }


    @When("^User selects a product and selects a size$")
    public void user_selects_a_product_and_selects_a_size(){

    }

    @When("^User add a product in the Bag$")
    public void user_add_a_product_in_the_Bag(){

    }

    @Then("^User should see the respective product in the Bag$")
    public void user_should_see_the_respective_product_in_the_Bag() {

    }
}
