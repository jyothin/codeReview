package cr8;

public class User {
  int id;
  String firstName;
  String lastName;
  
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

}
