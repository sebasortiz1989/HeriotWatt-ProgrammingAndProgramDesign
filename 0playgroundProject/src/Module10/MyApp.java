package Module10;

import java.io.IOException;
import java.util.logging.Logger;
import java.util.logging.Level;

public class MyApp {
    private static final Logger logger = Logger.getLogger(MyApp.class.getName());

    public void process() {
        try {
            // Some operation
            throw new IOException();
        } catch (IOException e) {
            logger.log(Level.SEVERE, "I/O operation failed: " + e.getMessage(), e);
        }
    }
}