package cr3;

public class Customer {
	int id;
	String firstName;
	String lastName;
	long orders;
	
	public Customer(int id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void incrementOrders() {
		orders++;
	}

}

