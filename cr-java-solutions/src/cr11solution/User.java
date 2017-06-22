/* 
 * Correctness
 * Is the code using the correct data structure for a multi-threaded environment?
 * Use a Vector or Collections.synchronizedList() or CopyOnWriteArrayList
 * 
 * Is the code susceptible to race conditions?
 * 
 * Is the code using locks correctly?
 * 
 * Is the performance test for the code valuable?
 * 
 * Caching
 * While caching might be a way to prevent making too many external requests, it comes with its own challenges. 
 * If the code under review uses caching, you should look for some common problems, for example, incorrect 
 * invalidation of cache items.
 * 
 */

package cr11solution;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class User {
  private final List<Session> sessions = new CopyOnWriteArrayList<>(); // use better data structure here
  private Orders orders;
  
  public void onOpen(Session session) {
    sessions.add(session);
  }
  
  public <T> void onMessage(T message) {
    sessions.stream()
            .filter(Session::isOpen)
            .forEach(session -> sendMessageToClient(message.toString(), session));
  }

  private Object sendMessageToClient(String string, Session session) {
    return null;
  }
  
  public void incrementOrders() {
    orders.setNumberOfOrders(orders.getNumberOfOrders() + 1); // potetial race condition
  }
  
}
