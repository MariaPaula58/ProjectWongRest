package co.com.projectwongrest.utils;

public enum RestService {

    BASE_URL("https://gorest.co.in"),
    CREATE_USER("/public-api/users"),
    GET_USERS("/public-api/users/123");

    private String uri;

    RestService(String uri) {
        this.uri = uri;
    }

    @Override
    public String toString() {
        return uri;
    }

}
