package cr3;

public class OrdersService {
	private Orders orders;
	
	public void placeOrder(Order order) {
		orders.saveOrder(order);
		Customer customer = CustomerRepository.CUSTOMERS.get(order.getCustomerId());
		customer.incrementOrders();
	}
}

