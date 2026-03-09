package handlers;

import model.LogRequest;

public interface Logger {

    void logMessage(LogRequest request);
//    void setNext(Logger handler);
}
