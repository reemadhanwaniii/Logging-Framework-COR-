package handlers;

import model.LogRequest;

public class WarnLogger implements Logger{

    private final int level;

    public WarnLogger() {
        this.level = 3;
    }

    @Override
    public void logMessage(LogRequest request) {

    }

    @Override
    public void setNext(Logger handler) {

    }
}
