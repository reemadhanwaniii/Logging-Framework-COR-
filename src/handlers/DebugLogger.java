package handlers;

import model.LogRequest;

public class DebugLogger extends BaseLogger{
    private final int level;

    public DebugLogger() {
        this.level = 1;
    }

    @Override
    public void logMessage(LogRequest request) {

    }


}
