package cr3;

public class BrowserstackCustomerUpdateService {
	public void addCustomer(int id, String firstName, String lastName) {
		BrowserstackCustomerRepository.CUSTOMERS.put(id, new BrowserstackCustomer(id, firstName, lastName));
	}
	
	public void updateName(int id, String firstName, String lastName) {
		BrowserstackCustomer customer = BrowserstackCustomerRepository.CUSTOMERS.get(id);
		if(customer != null) {
			customer.setFirstName(firstName);
			customer.setLastName(lastName);
		}
	}
}
