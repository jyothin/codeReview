/*
 * The onOpen method and incrementOrders are called by multiple threads
 */

package cr11;

import java.util.ArrayList;
import java.util.List;

public class User {
  private final List<Session> sessions = new ArrayList<>();
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
    orders.setNumberOfOrders(orders.getNumberOfOrders() + 1);
  }

}
