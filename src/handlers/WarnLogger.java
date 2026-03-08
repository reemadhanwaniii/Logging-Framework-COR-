package handlers;

import model.LogRequest;

public class WarnLogger extends BaseLogger{

    private final int level;

    public WarnLogger() {
        this.level = 3;
    }

    @Override
    public void logMessage(LogRequest request) {

    }


}
