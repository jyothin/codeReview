package cr1;

import java.util.ArrayList;

public class Customers {
    
    private ArrayList<Customer> customers;
    
    public Customer getCustomerById(int customerId) {
        if(customers != null) {
            for(Customer customer : customers) {
                if(customer.getId() == customerId) {
                    return customer;
                }
            }
        }
        return getCustomerByIdFromDatabase(customerId);
    }
    
    public Customer getCustomerByIdFromDatabase(int customerId) {
        /* Placeholder, ignore in CR */
        return new Customer(0, "Just A", "Sample");
    }

}

