package ac.za.mycput.factory;

// Tebogo Makgato 230116086

import ac.za.mycput.domain.Customer;
import ac.za.mycput.util.Helper;

public class CustomerFactory {

    public static Customer createCustomer(Long userId, String firstName, String lastName, String email, String password, String phoneNumber){
        if (Helper.isNullEmpty(firstName)) {
            return null;
        }

        if (Helper.isNullEmpty(lastName)) {
            return null;
        }
        if (Helper.isNullEmpty(email) || !Helper.isValidEmail(email)) {
            return null;
        }
        if(!Helper.isValidUserId(userId)){
            return null;
        }
        if (Helper.isNullEmpty(password)) {
            return null;
        }
        if(!Helper.isValidPhoneNumber(phoneNumber)){
            return null;
        }
        return new Customer.Builder()
                .setUserId(userId)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .setPassword(password)
                .setPhoneNumber(phoneNumber)
                .build();
    }
}
