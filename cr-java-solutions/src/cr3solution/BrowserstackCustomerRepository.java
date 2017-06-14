/*
 * Maps
 * Anti-Pattern: Map as global constant
 * In the CR, the author has chosen to simply expose the CUSTOMERS map as a global constant. 
 * The CustomerUpdateService therefore uses this map directly when adding or updating customers. 
 * This might not seem too terrible, since the CustomerUpdateService is responsible for add and 
 * update operations, and these have to ultimately change the map. The issue comes when other 
 * classes, particularly those from other parts of the system, need access to the data.
 * 
 * Although the updated code isn’t much shorter, you have standardised and centralised core 
 * functions – for example, you know that getting a customer who doesn’t exist is always going 
 * to give you an Exception. Or you can choose to have this method return the new Optional 
 * type.
 * 
 * Note that this is exactly the sort of issue that should be found during a code review – 
 * hiding global constants is hard to do once their use has propagated throughout the system, 
 * but it’s easy to catch this when they’re first introduced.
 */

package cr3solution;

import java.util.HashMap;
import java.util.Map;

public class BrowserstackCustomerRepository {
	private static final Map<Integer, BrowserstackCustomer> CUSTOMERS = new HashMap<>();
	
	public BrowserstackCustomer get(int id) throws InvalidCustomerException {
		BrowserstackCustomer customer = CUSTOMERS.get(id);
		if(customer == null) {
			throw new InvalidCustomerException();
		}
		return customer;
	}
	
	public void add(BrowserstackCustomer customer) {
		CUSTOMERS.put(customer.getId(), customer);
	}
	
	public class InvalidCustomerException extends Exception {
		private static final long serialVersionUID = 1L;
	}
}

