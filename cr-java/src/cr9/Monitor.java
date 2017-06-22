package cr9;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

public class Monitor {
  private final Map<Integer, User> users = new HashMap<>();
  
  private Database database = new Database();
  
  public void onOrder(int userId, int orderId) {
    User user = users.computeIfAbsent(userId, User::new);
    user.addOrder(orderId); // grows indefinitely, will not be collected by the GC
  }
  
  public User getUser(int userId) {
    return users.get(userId);
  }
  
  public User getUserById(final int userId) {
    User user = null;
    try {
      Connection connection = database.getConnection();
      Statement statement = connection.createStatement();
      
      ResultSet rs = statement.executeQuery("SELECT * FROM Users WHERE id = " + userId);
      rs.next();
      user = new User(userId, rs.getString("first"), rs.getString("last"));
    } catch (SQLException e) {
      doDatabaseErrorHandling(e);
    }
    return user;
  }
  
  private void doDatabaseErrorHandling(Exception e) {
    e.printStackTrace();
  }

}
