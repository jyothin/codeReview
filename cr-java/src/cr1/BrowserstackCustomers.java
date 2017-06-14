package cr1;

import java.util.ArrayList;

public class BrowserstackCustomers {
    
    private ArrayList<BrowserstackCustomer> customers;
    
    public BrowserstackCustomer getCustomerById(int customerId) {
        if(customers != null) {
            for(BrowserstackCustomer customer : customers) {
                if(customer.getId() == customerId) {
                    return customer;
                }
            }
        }
        return getCustomerByIdFromDatabase(customerId);
    }
    
    public BrowserstackCustomer getCustomerByIdFromDatabase(int customerId) {
        /* Placeholder, ignore in CR */
        return new BrowserstackCustomer(0, "Just A", "Sample");
    }

}

