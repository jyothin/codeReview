/*
 * Lists
 * Anti-Pattern: Too Much Searching
 * Iterating over a list is not, in itself, a bad thing of course. But if iteration is required for a very common 
 * operation, there might be a better data structure to use. In our case, because we always want to find a particular 
 * item by ID, it might be better to create a map of ID to Customer.
 * 
 * Remember that in Java 8, and languages which support more expressive searches, this might not be as obvious as a 
 * for-loop, but the problem still remains.
 */

package cr1solution;

import java.util.ArrayList;
import java.util.Optional;

public class Customers {
	
	private ArrayList<Customer> customers;
	
	public Customer getCustomerById(final int customerId) {
		if(customers != null) {
			Optional<Customer> customerWithId = customers.stream()
					.filter(customer -> customer.getId() == customerId)
					.findFirst();
			return customerWithId.orElseGet(() -> getCustomerByIdFromDatabase(customerId));
		}
		return getCustomerByIdFromDatabase(customerId);
	}
	
	public Customer getCustomerByIdFromDatabase(int customerId) {
		return new Customer(0, "Just A", "Sample");
	}

}

