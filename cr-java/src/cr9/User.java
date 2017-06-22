package cr9;

public class User {
  private int id;
  private String firstName;
  private String lastName;
  
  public User(int id) {
    this.id = id;
  }
  
  public User(int id, String firstName, String lastName) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
  }
  
  public int getId() {
    return this.id;
  }
  
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
  
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
  
  public void addOrder(int orderId) {
  }
}
