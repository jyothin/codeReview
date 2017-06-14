package cr3solution;

import cr3solution.BrowserstackCustomerRepository.InvalidCustomerException;

public class BrowserstackCustomerUpdateService {
	private BrowserstackCustomerRepository customerRepository;
	
	public void addCustomer(int id, String firstName, String lastName) {
		customerRepository.add(new BrowserstackCustomer(id, firstName, lastName));
	}
	
	public void updateName(int id, String firstName, String lastName) {
		BrowserstackCustomer customer = null;
		try {
			customer = customerRepository.get(id);
		} catch (InvalidCustomerException e) {
			e.printStackTrace();
		}
		if(customer != null) {
			customer.setFirstName(firstName);
			customer.setLastName(lastName);
		}
	}
}
