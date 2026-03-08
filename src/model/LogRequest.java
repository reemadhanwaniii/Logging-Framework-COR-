package model;

import enums.LogLevel;

public class LogRequest {
    private final LogLevel level;
    private final String message;

    public LogRequest(LogLevel level,String message) {
        this.level = level;
        this.message = message;
    }

    public LogLevel getLevel() {
        return level;
    }

    public String getMessage() {
        return message;
    }
}
