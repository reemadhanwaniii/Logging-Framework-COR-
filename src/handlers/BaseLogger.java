package handlers;

import enums.LogLevel;
import model.LogRequest;

public abstract class BaseLogger implements Logger{
    protected Logger nextLogger;
    protected LogLevel logLevel;

    public BaseLogger(LogLevel logLevel) {
        this.logLevel = logLevel;
    }

    @Override
    public void setNext(Logger next) {
        this.nextLogger = next;
    }

    @Override
    public void logMessage(LogRequest request) {
        if(request.getLevel().getLevel() >= this.logLevel.getLevel()) {
            write(request);
        }

        if(nextLogger != null) {
            this.nextLogger.logMessage(request);
        }
    }

    protected abstract void write(LogRequest request);
}
