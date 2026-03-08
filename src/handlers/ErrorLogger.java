package handlers;

import model.LogRequest;

public class ErrorLogger implements Logger{

    private final int level;

    public ErrorLogger() {
        this.level = 4;
    }

    @Override
    public void logMessage(LogRequest request) {

    }

    @Override
    public void setNext(Logger handler) {

    }
}
