package handlers;

import enums.LogLevel;
import model.LogRequest;

public class DebugLogger extends BaseLogger{
    public DebugLogger(Logger next) {
        super(LogLevel.DEBUG,next);
    }


    @Override
    protected void write(LogRequest request) {
        System.out.println("[DEBUG] : "+request.getMessage());
    }
}
