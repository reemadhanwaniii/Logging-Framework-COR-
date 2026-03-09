package handlers;

import enums.LogLevel;
import model.LogRequest;

public class DebugLogger extends BaseLogger{
    public DebugLogger() {
        super(LogLevel.DEBUG);
    }


    @Override
    protected void write(LogRequest request) {
        System.out.println("[DEBUG] "+request.getMessage());
    }
}
