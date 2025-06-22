package CODE.Domain.Model.User;

public class Admin extends AUser {
    private final String password;

    private Admin(AdminBuilder builder) {
        super(builder.userID, builder.name, builder.email);
        this.password = builder.password;
    }

    public static class AdminBuilder {
        // Required
        private String userID;
        private String email;
        private String password;

        // Optional
        private String name;

        public AdminBuilder(String userID, String email, String password) {
            this.userID = userID;
            this.email = email;
            this.password = password;
        }

        public AdminBuilder setUserID(String _id) {
            this.userID = _id;
            return this;
        }
        public AdminBuilder setEmail(String _email) {
            this.email = _email;
            return this;
        }
        public AdminBuilder setPassword(String _password) {
            this.password = _password;
            return this;
        }
        public AdminBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public Admin build() {
            return new Admin(this);
        }
    }

    public AdminBuilder toBuilder() {
    AdminBuilder adminBuilder = new AdminBuilder(this.userID, this.email, this.password);
    adminBuilder.setName(this.name);    
    return adminBuilder;
  }

    // Example getter
    public String getPassword() {
        return password;
    }

    // TODO: Add domain-specific methods
}
