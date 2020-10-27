package co.com.projectwongrest.questions;


import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Question;


public class ResponseStatusCode {

    public static Question<Boolean> is(int code){
        return a -> SerenityRest.lastResponse().statusCode() ==code;
    }
}
