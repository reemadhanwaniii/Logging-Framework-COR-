package handlers;

import model.LogRequest;

public abstract class BaseLogger implements Logger{
    private Logger next;

    public void setNext(Logger next) {
        this.next = next;
    }

    protected void forward(LogRequest request) {
        this.next.logMessage(request);
    }
}
