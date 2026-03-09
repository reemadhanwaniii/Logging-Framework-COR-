package factory;

import handlers.*;

public class CreateHandlerFactory {
    public static Logger createLogHandler() {
        return new DebugLogger(
                new InfoLogger(
                        new WarnLogger(
                                new ErrorLogger(
                                        null
                                )
                        )
                )
        );
    }
}
