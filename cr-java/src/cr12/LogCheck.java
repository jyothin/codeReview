package cr12;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LogCheck {
  
  private static final Logger LOGGER = Logger.getLogger(LogCheck.class.getName());
  
  public <T> void onMessage(T message) {
    LOGGER.log(Level.FINEST, String.format("Received message %s", message));
  }
  
}
