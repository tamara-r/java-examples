package users;

import annotations.ClassFields;

import java.util.Date;

public class User extends IdGenerator {
//
//    @ClassFields(name = "idGenerator", type = Integer.class)
//    private static int idGenerator = 1;

    @ClassFields(name = "id", type = Integer.class)
    private int id;

    @ClassFields(name = "name", type = String.class)
    private String name;

    @ClassFields(name = "userType", type = String.class)
    private String userType;

    @ClassFields(name = "email", type = String.class)
    private String email;

    @ClassFields(name = "created", type = Date.class)
    private Date created;

    public User(String name, String email) {
        this.id = super.idGenerator++;
        this.name = name;
        this.email = email;
        this.userType = "user";
        this.created = new Date();
    }

    public long getId() {
        return id;
    }

    @SuppressWarnings("unused")
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @SuppressWarnings("unused")
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    @SuppressWarnings("unused")
    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public Date getCreated() {
        return created;
    }

    @SuppressWarnings("unused")
    public void setCreated(Date created) {
        this.created = created;
    }


    @Override
    public String toString() {
        return "User (" +
                "id: " + id +
                ", name: " + name + '\'' +
                ", email: " + email + '\'' +
                ", created at: " + created +
                ')';
    }
}
