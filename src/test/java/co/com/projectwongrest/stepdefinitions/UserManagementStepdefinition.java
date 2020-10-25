package co.com.projectwongrest.stepdefinitions;

import co.com.projectwongrest.models.User;
import co.com.projectwongrest.questions.ResponseStatusCode;
import co.com.projectwongrest.tasks.CreateUserTo;
import co.com.projectwongrest.utils.RestService;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import java.util.List;

public class UserManagementStepdefinition {

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("user").whoCan(CallAnApi.at(RestService.BASE_URL.toString()));
    }

    @When("^I create an user$")
    public void iCreateAnUser(List<User> listUser) {

        OnStage.theActorInTheSpotlight().attemptsTo(CreateUserTo.aUser(listUser.get(0)));
    }

    @Then("^I sees the user created$")
    public void iSeesTheUserCreated() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat("last response status code is 201", ResponseStatusCode.is(201)));
    }
}
