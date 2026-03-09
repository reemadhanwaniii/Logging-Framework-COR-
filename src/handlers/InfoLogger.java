package handlers;

import enums.LogLevel;
import model.LogRequest;

public class InfoLogger extends BaseLogger{

    public InfoLogger() {
        super(LogLevel.INFO);
    }


    @Override
    protected void write(LogRequest request) {
        System.out.println(" [INFO] : "+request.getMessage());
    }
}
