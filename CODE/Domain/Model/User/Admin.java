package CODE.Domain.Model.User;

public class Admin extends AUser{
    private String password;

    private Admin(String userID, String name, String email) {
        super(userID, name, email);
    }

    // TODO: FUNCTIONS

}
