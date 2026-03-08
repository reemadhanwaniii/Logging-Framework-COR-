package handlers;

import model.LogRequest;

public class InfoLogger extends BaseLogger{

    private final int level;

    public InfoLogger() {
        this.level = 2;
    }

    @Override
    public void logMessage(LogRequest request) {

    }


}
