package CODE.Domain.Exceptions;

public class UserHasNoAdminRightsException extends RuntimeException {
    public UserHasNoAdminRightsException() {
        super("Operation failed: User does not have admin rights.");
    }

    public UserHasNoAdminRightsException(String message) {
        super(message);
    }
}
