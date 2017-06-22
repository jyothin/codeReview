/*
 * Here, the order service is aware of the data structure used to store customers. 
 * In fact, in the code above, the author has made an error – they don’t check to see if the 
 * customer is null, which could cause a NullPointerException. As the reviewer of this code, 
 * you’ll want to suggest hiding this data structure away and providing suitable access 
 * methods. That will make these other classes easier to understand, and hide any complexity 
 * of managing the map in the CustomerRepository, where it belongs. In addition, if later you 
 * change the customers data structure, or you move to using a distributed cache or some other 
 * technology, the changes associated with that will be restricted to the CustomerRepository 
 * class and not ripple throughout the system. This is the principle of Information Hiding.
 */
package cr3solution;

import cr3solution.CustomerRepository.InvalidCustomerException;

public class OrdersService {
	private Orders orders;
	private CustomerRepository customerRepository;
	
	public void placeOrder(Order order) {
		orders.saveOrder(order);
		Customer customer = null;
		try {
			customer = customerRepository.get(order.getCustomerId());
		} catch (InvalidCustomerException e) {
			e.printStackTrace();
		}
		customer.incrementOrders();
	}
}

