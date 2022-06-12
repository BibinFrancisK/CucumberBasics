package Steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.List;

public class LoginSteps {
    @Given("I navigate to the login page")
    public void iNavigateToTheLoginPage() {
        System.out.println("Navigated to login page");
    }
    

    @And("I click login button")
    public void iClickLoginButton() {
        System.out.println("Clicked login button");
    }

    @Then("I should see the user form page")
    public void iShouldSeeTheUserFormPage() {
        System.out.println("Saw user form");
    }

    @And("I enter the following details for login")
    public void iEnterTheFollowingDetailsForLogin(DataTable table) {
        List<List<String>> tableVals = table.asLists();
        System.out.println(tableVals.get(0).get(0));
    }
}
