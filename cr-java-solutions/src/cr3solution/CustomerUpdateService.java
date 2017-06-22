package cr3solution;

import cr3solution.CustomerRepository.InvalidCustomerException;

public class CustomerUpdateService {
	private CustomerRepository customerRepository;
	
	public void addCustomer(int id, String firstName, String lastName) {
		customerRepository.add(new Customer(id, firstName, lastName));
	}
	
	public void updateName(int id, String firstName, String lastName) {
		Customer customer = null;
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
