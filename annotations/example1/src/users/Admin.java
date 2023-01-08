package users;

public class Admin extends User {

    public Admin(String name, String email) {
        super(name, email);
        super.setUserType("admin");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
