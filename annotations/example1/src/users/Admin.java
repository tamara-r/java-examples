package users;


public class Admin extends User {

    public Admin(String name, String email) {
        super(name, email);
        super.setUserType("admin");
    }

    @Override
    public String toString() {
        return "User (" +
                "id: " + super.getId() +
                ", name: " + super.getName() + '\'' +
                ", email: " + super.getEmail()+ '\'' +
                 ", type: " + super.getUserType() + '\'' +
                ", created at: " + super.getCreated() +
                ')';
    }


}
