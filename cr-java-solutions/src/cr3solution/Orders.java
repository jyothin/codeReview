package cr3solution;

import java.util.ArrayList;

public class Orders {
	private ArrayList<Order> orders;
	
	public void saveOrder(Order order) {
		orders.add(order);
	}
	
}
