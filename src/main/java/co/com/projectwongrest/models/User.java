package co.com.projectwongrest.models;

public class User {

    private String id;

    private String name;

    private String email;

    private String gender;

    private String status;

    private String created_at;

    private String updated_at;

    public User(String id, String name, String email, String gender, String status, String created_at, String updated_at) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.status = status;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public String getStatus() {
        return status;
    }

    public String getCreated_at() {
        return created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }
}
