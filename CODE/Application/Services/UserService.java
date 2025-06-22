package CODE.Application.Services;

import java.util.List;

import CODE.Domain.Model.User.Customer;

public class UserService {    

    Customer getProfile(String userID){
        return new Customer("1","bot", "bot@trial.com");
    }
    void registerUser(Customer user){
        
    }
    
}
