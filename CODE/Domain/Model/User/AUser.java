package CODE.Domain.Model.User;

public abstract class AUser {
    protected final String userID;
    protected final String name;  // optional
    protected final String email;

    protected AUser(String userID, String name, String email) {
        this.userID = userID;
        this.name = name;
        this.email = email;
    }

    public String getUserID() {
        return userID;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
