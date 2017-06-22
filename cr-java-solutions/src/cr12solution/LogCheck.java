package cr12solution;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LogCheck {
  
  private static final Logger LOGGER = Logger.getLogger(LogCheck.class.getName());
  
  public <T> void onMessage(T message) {
    if(LOGGER.isLoggable(Level.FINEST)) {
      LOGGER.log(Level.FINEST, String.format("Received message %s", message));
    }
    LOGGER.log(Level.FINEST, () -> String.format("Received message %s", message));
  }
  
}
