package cr11;

public class Session {
  long id;
  
  public Session () {}
  
  public boolean isOpen() {
    return (id == 0 ? false: true);
  }
  
}
