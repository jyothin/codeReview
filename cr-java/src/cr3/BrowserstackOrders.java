package cr3;

import java.util.ArrayList;

public class BrowserstackOrders {
	private ArrayList<BrowserstackOrder> orders;
	
	public void saveOrder(BrowserstackOrder order) {
		orders.add(order);
	}
	
}
