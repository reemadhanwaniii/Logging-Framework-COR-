import enums.LogLevel;
import factory.CreateHandlerFactory;
import handlers.Logger;
import model.LogRequest;

public class Main {
    static void main() {
        Logger logger = CreateHandlerFactory.createLogHandler();
        LogRequest request = new LogRequest(LogLevel.DEBUG, " User Logged in");

        logger.logMessage(request);
    }
}
