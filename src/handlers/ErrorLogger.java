package handlers;

import model.LogRequest;

public class ErrorLogger extends BaseLogger{

    private final int level;

    public ErrorLogger() {
        this.level = 4;
    }

    @Override
    public void logMessage(LogRequest request) {

    }


}
