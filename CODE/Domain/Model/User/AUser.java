package CODE.Domain.Model.User;
public abstract class AUser {

        private String userID;
        private String name;
        private String email;        
        
    public AUser(String userID, String name, String email) {
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