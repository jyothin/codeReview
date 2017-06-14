package cr1;

public class BrowserstackCustomer {
    int id;
    String firstName;
    String lastName;
    
    public BrowserstackCustomer(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public int getId() {
        return this.id;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}

