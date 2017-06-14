package cr3;

public class BrowserstackOrdersService {
	private BrowserstackOrders orders;
	
	public void placeOrder(BrowserstackOrder order) {
		orders.saveOrder(order);
		BrowserstackCustomer customer = BrowserstackCustomerRepository.CUSTOMERS.get(order.getCustomerId());
		customer.incrementOrders();
	}
}

