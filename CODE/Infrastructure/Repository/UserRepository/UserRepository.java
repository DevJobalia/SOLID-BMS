package CODE.Infrastructure.Repository.UserRepository;

import CODE.Domain.Model.User.AUser;
import CODE.Domain.Model.User.Admin;
import CODE.Domain.Model.User.Customer;

import java.util.*;

public class UserRepository {
    private final Map<String, AUser> userStore = new HashMap<>();

    public void registerUser(AUser user) {
        userStore.put(user.getUserID(), user);
    }

    public AUser getUserById(String userId) {
        return userStore.get(userId);
    }

    public List<AUser> getAllUsers() {
        return new ArrayList<>(userStore.values());
    }

    public List<Customer> getAllCustomers() {
        List<Customer> customers = new ArrayList<>();
        for (AUser user : userStore.values()) {
            if (user instanceof Customer) {
                customers.add((Customer) user);
            }
        }
        return customers;
    }

    public List<Admin> getAllAdmins() {
        List<Admin> admins = new ArrayList<>();
        for (AUser user : userStore.values()) {
            if (user instanceof Admin) {
                admins.add((Admin) user);
            }
        }
        return admins;
    }
}
