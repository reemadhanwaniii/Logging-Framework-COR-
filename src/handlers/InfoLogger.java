package handlers;

import model.LogRequest;

public class InfoLogger implements Logger{

    private final int level;

    public InfoLogger() {
        this.level = 2;
    }

    @Override
    public void logMessage(LogRequest request) {

    }

    @Override
    public void setNext(Logger handler) {

    }
}
