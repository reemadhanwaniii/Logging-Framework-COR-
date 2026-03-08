package handlers;

import model.LogRequest;

public class DebugLogger implements Logger{
    private final int level;

    public DebugLogger() {
        this.level = 1;
    }

    @Override
    public void logMessage(LogRequest request) {

    }

    @Override
    public void setNext(Logger handler) {

    }
}
