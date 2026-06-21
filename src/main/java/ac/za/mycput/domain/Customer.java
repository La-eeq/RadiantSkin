package ac.za.mycput.domain;

import jakarta.persistence.Entity;

@Entity
public class Customer extends User {

    private String phoneNumber;

    protected Customer() {

    }

    public Customer(Long userId, String firstName, String lastName, String email,
                    String password, String phoneNumber) {
        super(userId, firstName, lastName, email, password);
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() { return phoneNumber; }

    @Override
    public String toString() {
        return "Customer{" +
                "phoneNumber='" + phoneNumber + '\'' +
                "} " + super.toString();
    }
}
