package co.com.projectwongrest.tasks;

import co.com.projectwongrest.utils.RestService;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;

public class SearchUserTo implements Task {

    private String searchUsers;

    public SearchUserTo() {
        this.searchUsers = String.format(RestService.GET_USERS.toString());
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Get.resource(searchUsers)
        );
    }

    public static  SearchUserTo ofTheSecondGroup() {
        return new SearchUserTo();
    }
}
