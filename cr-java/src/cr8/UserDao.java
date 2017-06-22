package cr8;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
  
  private final Database database = new Database();
  
  public List<User> getAllUsers() {
    List<Integer> userIds = getAllUserIds();
    ArrayList<User> users = new ArrayList<>();
    
    try (Connection connection = database.getConnection();
        Statement statement = connection.createStatement()) {
        for(Integer userId: userIds) {
          try(ResultSet rs = statement.executeQuery("SELECT * FROM Customers WHERE id = " + userId)) {
            rs.next();
            users.add(new User(userId, rs.getString("first"), rs.getString("last")));
          }
        }
      } catch (SQLException e) {
        doDatabaseErrorHandling(e);
      }
    return users;
  }

  public List<Integer> getAllUserIds() {
    return null;
  }
  
  private void doDatabaseErrorHandling(SQLException e) {
    
  }
}

