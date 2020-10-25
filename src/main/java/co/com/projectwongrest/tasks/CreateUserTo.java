package co.com.projectwongrest.tasks;

import co.com.projectwongrest.models.User;
import co.com.projectwongrest.utils.RestService;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Post;

public class CreateUserTo implements Task {

    private User user;

    public CreateUserTo(User user){
        this.user=user;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Post.to(RestService.CREATE_USER.toString())
                        .with(request-> request.header("Content-Type", "application/json")
                        .body(user)
                        )

        );
    }

    public static CreateUserTo aUser(User user){
        return new CreateUserTo(user);
    }
}
